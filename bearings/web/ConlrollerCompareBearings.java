
package com.springapp.bearings.web;

import com.springapp.bearings.domain.BearingsIndustrial;
import com.springapp.bearings.service.BearingsIndustrialService;
import com.springapp.bearings.util.compare_bearings.CompareCartItemBearings;
import com.springapp.bearings.util.compare_bearings.CompareCartBearings;
import com.springapp.mvc.domain.message.Message;
import com.springapp.mvc.util.PrintInFile;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class ConlrollerCompareBearings extends PrintInFile{
  
final private String COMPARE_BEARINGS = "compare-bearings";

@Autowired  BearingsIndustrialService bearingsService;
  
       
    @RequestMapping(value =  "/"+COMPARE_BEARINGS+"", method = RequestMethod.GET)
    public String compareBearings(HttpSession session) {
        String ids = "";
       CompareCartBearings compareCartBearings = (CompareCartBearings) session.getAttribute("compareCartBearings");
       if (compareCartBearings==null)  {
           compareCartBearings = new CompareCartBearings();
       }  else {
           for(CompareCartItemBearings cc : compareCartBearings.getItems()){
             ids +=  cc.getProduct().getId()+",";
           }
       }
       if (ids.equals(""))  
        return "redirect:/"+COMPARE_BEARINGS+"?ids="+null; 
       return "redirect:/"+COMPARE_BEARINGS+"?ids="+ids; 
    }
    
    
    @RequestMapping(value =  "/"+COMPARE_BEARINGS+"", method = RequestMethod.GET, params = "ids")
    public ModelAndView compareBearingsWithID( @RequestParam(value = "ids", required = false) String ids,
                                            HttpSession session){
    
    ModelAndView mv = new ModelAndView("bearings/bearings_compare");
    List<BearingsIndustrial> listBearings=null;
    if(ids!=null && !ids.equals("") )  listBearings = bearingsService.getListBearingsByIds(ids);

    Message mes=new Message(); mes.setMessage(listBearings.toString());
        
    mv.addObject("message", mes); // it is need for feed back !!!!!!
    mv.addObject("listBearings", listBearings);
    session.setAttribute("currentpagewithpage", COMPARE_BEARINGS+"?ids="+ids);
    return mv;
    }
   
   
    
//        @RequestMapping(value =  "/compare/light/add" , method = RequestMethod.GET)
        @RequestMapping(value =  "/compare-bearings-add" , method = RequestMethod.GET)
    public String addProductToCompareList( 
            @RequestParam(value = "id") String id, 
            @RequestParam(value = "pagereturn") String pagereturn, 
            HttpSession session ) {
       
    CompareCartBearings compareCartBearings = (CompareCartBearings) session.getAttribute("compareCartBearings");
    if (compareCartBearings==null)  compareCartBearings = new CompareCartBearings();

 
    compareCartBearings.addItem(bearingsService.getBearingsById(id));
    session.setAttribute("compareCartBearings", compareCartBearings);  

           
//    if (pagereturn == null)   pagereturn = "index";
//        
//    return "redirect:/"+pagereturn;  
       String currentpagewithpage =  (String)session.getAttribute("currentpagewithpage");              
           if (currentpagewithpage == null)   currentpagewithpage = "index";
      return "redirect:"+currentpagewithpage;   
    }

    

    
        @RequestMapping(value = "/compare-bearings-del-{id}", method = RequestMethod.GET)
    public String delfromcompare(@PathVariable("id") String id, HttpSession session) {
   
    CompareCartBearings compareCartBearings = (CompareCartBearings) session.getAttribute("compareCartBearings");
    if (compareCartBearings==null)  compareCartBearings = new CompareCartBearings();
    BearingsIndustrial bearingsIndustrial =  new BearingsIndustrial();
    bearingsIndustrial.setId(id);

    compareCartBearings.update(bearingsIndustrial, "0"); // delete from compare
    session.setAttribute("compareCartBearings", compareCartBearings);

    return "redirect:/"+COMPARE_BEARINGS+""; 
    }
  
    
    


    
}
