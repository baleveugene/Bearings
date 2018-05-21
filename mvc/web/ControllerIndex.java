
package com.springapp.mvc.web;


import com.springapp.mvc.service.interfaces.OrdersService;

import com.springapp.mvc.domain.message.Message;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class ControllerIndex  {
  

     @Autowired
    OrdersService ordersService;  
       
       
     @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        
        return "redirect:/";
    }
     
    
    
    
        @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(HttpSession session) {
        
    ModelAndView mv = new ModelAndView("index_mc");
        
  mv.addObject("nombersofquerys", ordersService.getAmountOfOrders());


 mv.addObject("message", new Message()); // it is need for feed back !!!!!!
 
        session.setAttribute("currentpagewithpage", "/index");
        
        return mv;
    }

    

       
}
