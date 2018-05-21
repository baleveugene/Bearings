package com.springapp.mvc.service.implementions;

import com.springapp.mvc.dao.interfaces.OrdersDao;
import com.springapp.mvc.domain.order.Orders;
import com.springapp.mvc.service.interfaces.OrdersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    OrdersDao ordersDao ;
    
    
    @Override
    @Transactional
    public void addOrder(Orders orders) {
   ordersDao.addOrder(orders);
    }
    
    @Override
    @Transactional
    public int getAmountOfOrders() {
  return ordersDao.getAmountOfOrders();
    }
    
    
    @Override
    @Transactional
    public List<Orders>  getListOrders () {
  return ordersDao.getListOrders();
    }
    
}
