package com.springapp.mvc.web.cart;

//import dao.vmc.Vmc;
//import dao.vmc.VmcDaoImpl;
//import dao.orders.Order;
//import dao.orders.OrderDaoImpl;


import com.springapp.mvc.domain.message.Message;
import com.springapp.mvc.util.PrintInFile;
import com.springapp.mvc.util.cart.Product;
import com.springapp.mvc.util.cart.ShoppingCart;
import com.springapp.mvc.util.cart.ShoppingCartItem;
import com.springapp.mvc.domain.order.Orders;
import com.springapp.mvc.service.interfaces.OrdersService;

import java.text.SimpleDateFormat;
import java.util.Date;

//import javax.validation.Valid;

//import dao.hmc.Hmc;
//import dao.grinder.Grinder;
//import dao.grinder.GrinderDaoImp;
//import dao.hmc.HmcJdbcDaoImp;
//import dao.lathe.Lathe;
//import dao.lathe.LatheDaoImp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class ControllerCart extends PrintInFile {
  
    

    
    @Autowired
    OrdersService ordersService;
    

    
    /// ------------   Basket : Start  ---------------  
    
        @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public void cart(HttpSession session,  Map<String, Object> map) {
        
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart==null)  cart = new ShoppingCart();
        cart.calculateTotal("0"); // GDP (for example)
         session.setAttribute("cart", cart); 
         session.setAttribute("currentpagewithpage", "cart"); //
 map.put("message", new Message()); // it is need for feed back !!!!!!
//       return "vmc/cart"; 
    }  
    
    
    
    

      @RequestMapping(value = "/add-product-to-customer-basket",  method = RequestMethod.GET)
    public String addProductToShoppingCart(  @RequestParam(value = "id") int id, 
                                            @RequestParam(value = "model") String model,
                                            HttpSession session  ){

        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart==null)  cart = new ShoppingCart();
           
        Product product = null;
        Product p ;
    
//        if((p = vmcService.getVmc(id, model))!=null) product = p; 
     
  
        if(product!=null)  cart.addItem(product);
        
 
        session.setAttribute("cart", cart); 
        String currentpagewithpage;
        try {
        currentpagewithpage =  (String)session.getAttribute("currentpagewithpage");              
        } catch (Exception e) {
        currentpagewithpage = "index";
        }
      return "redirect:"+currentpagewithpage; 
        
    }
 
    
            @RequestMapping(value = "/from_cart", method = RequestMethod.GET)
    public String from_cart( @RequestParam(value = "id") int id, 
                             @RequestParam(value = "model") String model,
                             HttpSession session){

//       if((  vmcService.getVmc(id, model))!=null ) return "redirect:/vmc"+id; 
//       else if(( latheService.getLathe(id, model))!=null ) return "redirect:/lathe"+id;
//       else if(( hmcService.getHmc(id, model))!=null ) return "redirect:/hmc"+id;
//       else if(( grinderService.getGrinder(id, model))!=null ) return "redirect:/grinder"+id;
//       else
       return "redirect:/index";
    }
    
    
  
 
     @RequestMapping(value = "/del-from-basket", method = RequestMethod.GET)
    public String del_from_basket1(
            @RequestParam("id") int id,@RequestParam(value = "model") String model,
            HttpSession session
    ) {

         ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("cart");
       if (shoppingCart==null)  shoppingCart = new ShoppingCart();
       
       ///---- !!! - Кастыль
//       Vmc temperary   = new Vmc();
//       temperary.setId(id);
//       temperary.setModel(model);
//       Product prod = temperary;
//       //----!!! end - Кастыль
//
//       shoppingCart.update(prod, "0"); // delete from compare
//       session.setAttribute("cart", shoppingCart);
//   
//         String currentpagewithpage = (String)session.getAttribute("currentpagewithpage");              
//          if (currentpagewithpage == null) currentpagewithpage = "index";
       
          return "redirect:";
//                  +currentpagewithpage;  
    }
    

    
//    	@RequestMapping(value = "/updatequantity", method = RequestMethod.GET)
//	public String Minus(    @RequestParam(value = "id") int id, 
//                                @RequestParam(value = "model") String model, 
//                                @RequestParam(value = "quantity") int quantity, 
//                                HttpSession session ) {
//
//         ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
//        if (cart==null)  cart = new ShoppingCart();
////        Vmc hmc = vmcDaoImpl.getVmc(id);
//        
//        ///---- !!! - Кастыль
//       Vmc p   = new Vmc();
//       p.setId(id);
//       p.setModel(model);
//       Product prod = p;
//       //----!!! end - Кастыль
//       
//        cart.update(prod, ""+quantity); // We do less on 1 position
//
//         session.setAttribute("cart", cart);
//           
//         String currentpagewithpage = (String)session.getAttribute("currentpagewithpage");              
//          if (currentpagewithpage == null) currentpagewithpage = "index";
//         
//         
//	return "redirect:"+currentpagewithpage;  
//	}
    

    /// ------------  </ Basket  :End > ---------------   
    
          
    // -------- ---------  checkout : start ------------- -----------
    
        
        
        
        
        
        @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public void checkout(HttpSession session,  Map<String, Object> map) {
        
//        ModelAndView mv = new ModelAndView("checkout");
        
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart==null)  cart = new ShoppingCart();
        cart.calculateTotal("0"); // GDP (for example)
         session.setAttribute("cart", cart); 
//         Order order = new Order();
//         order.setFirstname("Dimitry");
        

         map.put("order", new Orders()); 
         
   String currentpagewithpage = (String)session.getAttribute("currentpagewithpage");              
          if (currentpagewithpage == null) currentpagewithpage = "index";
          
         session.setAttribute("currentpagewithpage", "checkout");
        
//       return mv; 
    }  
    
    
    
    
    
    
        @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    public ModelAndView checkoutPOST(@Valid @ModelAttribute ("order") Orders order, 
            BindingResult result,
            HttpSession session) {
       
         ModelAndView mv = new ModelAndView("checkoutfinish");
        
           if(result.hasErrors()){
             mv = new ModelAndView("checkout");
             mv.addObject("order", order);
//           List<TypeStanina> listTypeStanina= typeStaninaDAO.listTypeStanina();
//           mv.addObject("listTypeStanina", listTypeStanina);
             return mv;             
             }  
      
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart==null)  cart = new ShoppingCart();
//        cart.calculateTotal("0"); // GDP (for example)
//        orderJDBCTemplate
//         session.setAttribute("cart", cart); 
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
String dateInString = "2017-01-01";
//        try {
//            Date date = sdf.parse(dateInString);
            Date date = new Date();
        order.setDatatime(date);
//        } catch (ParseException ex) {
//            Logger.getLogger(ControllerCart.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        order.setDatatime("2015-06-02");
        order.setStatus("in");
        
      List <ShoppingCartItem> list =   cart.getItems();
  String query ="";    
      for(ShoppingCartItem ttt: list){
          query += ttt.getProduct().getProductid();
          query += "<br>->" + ttt.getProduct().getModel();
          query += "<br>->" + ttt.getProduct().getCountry();
          query += "<br>";
      }
        
        order.setRequest(query);
        
            printInFile("order 11", order.toString());
        
  ordersService.addOrder(order);
  cart = null;
   session.setAttribute("cart", cart);
         session.setAttribute("currentpagewithpage", "checkout");
        
       return mv; 
    }  
    
    

}
