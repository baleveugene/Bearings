/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.bearings.util.compare_bearings;


import com.springapp.bearings.domain.BearingsIndustrial;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
//@Service
public class CompareCartItemBearings {
    
BearingsIndustrial bearingsIndustrial;
short quantity;


public CompareCartItemBearings(BearingsIndustrial bearingsIndustrial) {
this.bearingsIndustrial =  bearingsIndustrial;
quantity = 1;
}

public BearingsIndustrial  getProduct() {
return  bearingsIndustrial;
}


public short getQuantity() {
return quantity;
}


public void setQuantity(short quantity) {
this.quantity = quantity;
}


public void incrementQuantity() {
quantity++;
}


public void decrementQuantity() {
quantity--;
}


public double getTotal() {
double amount = 0;
//amount = (this.getQuantity() *  hmc.getCost().doubleValue());
amount = (this.getQuantity() *  bearingsIndustrial.getPrice());
return amount;
}  

    @Override
    public String toString() {
        return "CompareCartItem{" + "hmc=" + bearingsIndustrial + ", quantity=" + quantity + '}';
    }



}
