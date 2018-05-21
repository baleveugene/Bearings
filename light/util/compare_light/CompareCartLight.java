
package com.springapp.light.util.compare_light;



import com.springapp.light.domain.LightOffice;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

 
public class CompareCartLight {
    
   List<CompareCartItemLight> items;
int numberOfItems;
//double total;
 

        public CompareCartLight() {
            items = new ArrayList<CompareCartItemLight>();
            numberOfItems = 0;
//            total = 0;
        }
  

        public synchronized void addItem(LightOffice lightOffice) {

                        boolean newItem = true;
                        for (CompareCartItemLight scItem : items) {
                        if (scItem.getProduct().getId().
                                                        equals( lightOffice.getId())) {
                        newItem = false;
//                        scItem.incrementQuantity();
                }
                }

                if (newItem) {
                CompareCartItemLight scItem = new CompareCartItemLight(lightOffice);
                items.add(scItem);
                }
        }  

        
        
     public synchronized void update (LightOffice lightOffice, String quantity) {
           
               
 short qty = -1;
                // cast quantity as short
                qty = Short.parseShort(quantity);
                if (qty >= 0) {
                CompareCartItemLight item = null;
                for (CompareCartItemLight scItem : items) {
                if (scItem.getProduct().getId().
                                                equals( lightOffice.getId())) {
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
for (CompareCartItemLight scItem : items) {
numberOfItems += scItem.getQuantity();
}
return numberOfItems;
}

    public List<CompareCartItemLight> getItems() {
        return items;
    }
    
        
        
        
}
