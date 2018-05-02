package com.springapp.light.web.light;


import com.springapp.light.domain.LightOffice;
import com.springapp.light.service.LighOfficeService;
import com.springapp.light.util.pdf.LightPdf;
import com.springapp.mvc.domain.message.Message;

import com.springapp.mvc.util.PrintInFile;

import java.io.File;
import java.io.FileInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerLight extends PrintInFile {

    @Autowired  LighOfficeService lighOfficeService;
 
    
        @RequestMapping(value = "/light", method = RequestMethod.GET)
    public ModelAndView light_all(  @RequestParam(value = "emergency", required = false) String emergency,
                                    @RequestParam(value = "powers", required = false) String powers,
                                    @RequestParam(value = "size", required = false) String size,
                                    @RequestParam(value = "type", defaultValue = "office") String type,
                                    HttpSession session ) {
        
        ModelAndView mv = new ModelAndView("light/light_all"); 
        
        if(emergency == null && powers==null && size ==null && type ==null) {
            mv.addObject("listLightOffice", lighOfficeService.getListLightOffice());
        }else{
            mv.addObject("listLightOffice", lighOfficeService.getListLightOffice(emergency, powers, size, type));
        }
        
        
        
        switch (type) {
            case "office": 
            case "Office": 
                mv.addObject("listLightPower", lighOfficeService.getListLightOfficePower()); //  for  filter
                mv.addObject("listLightSize", lighOfficeService.getListLightOfficeSize()); //   for   filter
                break;    
            
            
            default:   
                break;
        }
        
         mv.addObject("listLightType", lighOfficeService.getListLightOfficeType()); //  for   filter
        
         mv.addObject("emergency", emergency); // it is need for feed back !!!!!!
         mv.addObject("powers", powers); // it is need for feed back !!!!!!
         mv.addObject("size", size); // it is need for feed back !!!!!!
         mv.addObject("type", type); // it is need for feed back !!!!!!
         
  
         mv.addObject("message", new Message()); // it is need for feed back !!!!!!
         session.setAttribute("search", "light"); // for search


          String str = "" ;
          if (emergency!=null) str += "&emergency="+emergency;
          if (powers!=null) str += "&powers="+powers;
          if (size!=null && !size.equals("")) str += "&size="+size;
          if (type!=null && !type.equals("")) str += "&type="+type;
            session.setAttribute("currentpagewithpage", "/light?"+str);
          
        return mv;
    }
    
    
    
    @RequestMapping(value = "/light-{url}", method = RequestMethod.GET)
    public ModelAndView light_all(@PathVariable ("url") String url, HttpSession session) {
    
        ModelAndView mv = new ModelAndView("light/light_one");
        LightOffice lightOffice = lighOfficeService.getLightByUrl(url);
        mv.addObject("lightOffice", lightOffice);
        
        mv.addObject("message", new Message("Light " +lightOffice.getType() , lightOffice.getModel())); // it is need for feed back !!!!!!
        session.setAttribute("search", "light"); // for search
        session.setAttribute("currentpagewithpage", "/light-" + url);
        return mv;
    }
 


    @RequestMapping(value =  "/light/pdf/{url}", method = RequestMethod.GET)
public ResponseEntity<byte[]> getPdfSingle(HttpServletRequest request, @PathVariable ("url") String url )throws Exception {
//    public ResponseEntity<byte[]> getPdfSingle(@RequestParam("productId") String productId,
//                                               @RequestParam(value = "company", required = false) String company,
//                                               @RequestParam(value = "director", required = false) String director,
//                                               @RequestParam("showPrice") String showPrice,
//                                               HttpServletRequest request) throws Exception {

        String path = request.getServletContext().getRealPath("") + "/resources";
//        return getPDFOfferSingle(path, productId, company, "director", Boolean.getBoolean("true"));
        return getPDFOfferSingle(path, url, "company", "director", Boolean.getBoolean("true"));
      }
    
    
    

    public ResponseEntity<byte[]> getPDFOfferSingle(String path, String url, String company, String director, boolean showPrice) throws Exception {
//        Hmc machine = hmcDAO.getMachine(productId);
LightOffice light = lighOfficeService.getLightByUrl(url);
        String pathPdf = LightPdf.createPdfLight(path, light, company, director, showPrice);

        File file = new File(pathPdf);
        byte[] contents = new byte[(int) file.length()];
        new FileInputStream(file).read(contents);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        String filename = "Light-" + light.getModel() + ".pdf";
        headers.setContentDispositionFormData(filename, filename);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        return new ResponseEntity<byte[]>(contents, headers, HttpStatus.OK);
    }
    
}
