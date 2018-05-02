
package com.springapp.bearings.util.compare_bearings;

import com.springapp.bearings.domain.BearingsIndustrial;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

 
public class CompareCartBearings {
    
   List<CompareCartItemBearings> items;
int numberOfItems;
//double total;
 
        public CompareCartBearings() {
            items = new ArrayList<CompareCartItemBearings>();
            numberOfItems = 0;
//            total = 0;
        }
  
        public synchronized void addItem(BearingsIndustrial bearingsIndustrial) {

                        boolean newItem = true;
                        for (CompareCartItemBearings scItem : items) {
                        if (scItem.getProduct().getId().
                                                        equals(bearingsIndustrial.getId())) {
                        newItem = false;
//                        scItem.incrementQuantity();
                }
                }

                if (newItem) {
                CompareCartItemBearings scItem = new CompareCartItemBearings(bearingsIndustrial);
                items.add(scItem);
                }
        }  
        
     public synchronized void update (BearingsIndustrial bearingsIndustrial, String quantity) {
           
               
 short qty = -1;
                // cast quantity as short
                qty = Short.parseShort(quantity);
                if (qty >= 0) {
                CompareCartItemBearings item = null;
                for (CompareCartItemBearings scItem : items) {
                if (scItem.getProduct().getId().
                                                equals( bearingsIndustrial.getId())) {
                if (qty != 0) {
                // set item quantity to new value
                scItem.setQuantity(qty);
                } else {
                // if quantity equals 0, save item and break
                item = scItem;
                break;
                }
                }
                }

                if (item != null) {
                // remove from cart

                items.remove(item);
                }
                }
     } 
        
public synchronized int getNumberOfItems() {

numberOfItems = 0;
for (CompareCartItemBearings scItem : items) {
numberOfItems += scItem.getQuantity();
}
return numberOfItems;
}

    public List<CompareCartItemBearings> getItems() {
        return items;
    }    
}
