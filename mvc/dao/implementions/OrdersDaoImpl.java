/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springapp.mvc.dao.implementions;

import com.springapp.mvc.dao.interfaces.OrdersDao;
import com.springapp.mvc.domain.order.Orders;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */

@Repository
public class OrdersDaoImpl implements OrdersDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    
        
    @Override
    @SuppressWarnings("unchecked")
    public void addOrder(Orders orders) {
        sessionFactory.getCurrentSession().saveOrUpdate(orders);
    } 
    
    @Override
    @SuppressWarnings("unchecked")
    public int getAmountOfOrders() {
     List<Orders> list1 = (List<Orders> ) sessionFactory.getCurrentSession().createQuery("from Orders where status='in'").list();
 return list1.size();
    } 
    
    @Override  @SuppressWarnings("unchecked")
   public List<Orders> getListOrders(){
     List<Orders> list1 = (List<Orders> ) sessionFactory.getCurrentSession().createQuery("from Orders where status='in'").list();
 return list1;
    } 
    
}
