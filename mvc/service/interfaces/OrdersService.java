/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.service.interfaces;

import com.springapp.mvc.domain.order.Orders;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface OrdersService {
   
  public void  addOrder (Orders orders);
  public int  getAmountOfOrders ();
  public List<Orders>  getListOrders ();
    
}
