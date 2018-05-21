package com.springapp.mvc.service.interfaces;

//import com.springapp.mvc.domain.MachineOrder;
import com.springapp.mvc.domain.order.Orders;

public interface EmailService {
//    public void sendNewOrderEmailToAdmin(MachineOrder machineOrder);
//    public void sendNewOrderEmailToCustomer(String email, MachineOrder machineOrder);
    public void sendNewOrderEmailToAdmin(Orders orders);
    public void sendNewOrderEmailToCustomer(String email, Orders orders);
}
