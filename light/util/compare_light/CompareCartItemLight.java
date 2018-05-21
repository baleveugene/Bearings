/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.light.util.compare_light;


import com.springapp.light.domain.LightOffice;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
//@Service
public class CompareCartItemLight {
    
LightOffice lightOffice;
short quantity;


public CompareCartItemLight(LightOffice lightOffice) {
this.lightOffice =  lightOffice;
quantity = 1;
}

public LightOffice  getProduct() {
return  lightOffice;
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
amount = (this.getQuantity() *  lightOffice.getPrice());
return amount;
}  

    @Override
    public String toString() {
        return "CompareCartItem{" + "hmc=" + lightOffice + ", quantity=" + quantity + '}';
    }



}
