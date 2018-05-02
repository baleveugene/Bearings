
package com.springapp.light.web;

import com.springapp.light.domain.LightOffice;
import com.springapp.light.service.LighOfficeService;
import com.springapp.light.util.compare_light.CompareCartItemLight;
import com.springapp.light.util.compare_light.CompareCartLight;
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
public class ConlrollerCompareLight extends PrintInFile{
  
final private String COMPARE_LIGHT = "compare-light";

@Autowired  LighOfficeService lightService;
  
       
    @RequestMapping(value =  "/"+COMPARE_LIGHT+"", method = RequestMethod.GET)
    public String compareLight(HttpSession session) {
        String ids = "";
       CompareCartLight compareCartLight = (CompareCartLight) session.getAttribute("compareCartLight");
       if (compareCartLight==null)  {
           compareCartLight = new CompareCartLight();
       }  else {
           for(CompareCartItemLight cc : compareCartLight.getItems()){
             ids +=  cc.getProduct().getId()+",";
           }
       }
       if (ids.equals(""))  
        return "redirect:/"+COMPARE_LIGHT+"?ids="+null; 
       return "redirect:/"+COMPARE_LIGHT+"?ids="+ids; 
    }
    
    
    @RequestMapping(value =  "/"+COMPARE_LIGHT+"", method = RequestMethod.GET, params = "ids")
    public ModelAndView compareLightWithID( @RequestParam(value = "ids", required = false) String ids,
                                            HttpSession session){
    
    ModelAndView mv = new ModelAndView("light/light_compare");
    List<LightOffice> listLight=null;
    if(ids!=null && !ids.equals("") )  listLight = lightService.getListLighByIds(ids);

    Message mes=new Message(); mes.setMessage(listLight.toString());
        
    mv.addObject("message", mes); // it is need for feed back !!!!!!
    mv.addObject("listLight", listLight);
    session.setAttribute("currentpagewithpage", COMPARE_LIGHT+"?ids="+ids);
    return mv;
    }
   
   
    
//        @RequestMapping(value =  "/compare/light/add" , method = RequestMethod.GET)
        @RequestMapping(value =  "/compare-light-add" , method = RequestMethod.GET)
    public String addProductToCompareList( 
            @RequestParam(value = "id") String id, 
            @RequestParam(value = "pagereturn") String pagereturn, 
            HttpSession session ) {
       
    CompareCartLight compareCartLight = (CompareCartLight) session.getAttribute("compareCartLight");
    if (compareCartLight==null)  compareCartLight = new CompareCartLight();

 
    compareCartLight.addItem(lightService.getLightById(id));
    session.setAttribute("compareCartLight", compareCartLight);  

           
//    if (pagereturn == null)   pagereturn = "index";
//        
//    return "redirect:/"+pagereturn;  
       String currentpagewithpage =  (String)session.getAttribute("currentpagewithpage");              
           if (currentpagewithpage == null)   currentpagewithpage = "index";
      return "redirect:"+currentpagewithpage;   
    }

    

    
        @RequestMapping(value = "/compare-light-del-{id}", method = RequestMethod.GET)
    public String delfromcompare(@PathVariable("id") String id, HttpSession session) {
   
    CompareCartLight compareCartLight = (CompareCartLight) session.getAttribute("compareCartLight");
    if (compareCartLight==null)  compareCartLight = new CompareCartLight();
    LightOffice lighOffice =  new LightOffice();
    lighOffice.setId(id);

    compareCartLight.update(lighOffice, "0"); // delete from compare
    session.setAttribute("compareCartLight", compareCartLight);

    return "redirect:/"+COMPARE_LIGHT+""; 
    }
  
    
    


    
}
