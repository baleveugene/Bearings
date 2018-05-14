package com.springapp.bearings.web.bearings;


import com.springapp.bearings.domain.BearingsIndustrial;
import com.springapp.bearings.service.BearingsIndustrialService;
import com.springapp.bearings.util.pdf.BearingsPdf;
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
public class ControllerBearings extends PrintInFile {

    @Autowired  BearingsIndustrialService bearingsIndustrialService;
 
    
        @RequestMapping(value="/bearings", method = RequestMethod.GET)
    public ModelAndView bearings_all(  
                                    @RequestParam(value = "size", required = false) String size,
                                    @RequestParam(value = "type", required = false) String type,
                                    HttpSession session ) {
        
        ModelAndView mv = new ModelAndView("bearings/bearings_all"); 
        if(size ==null && type ==null) {
            mv.addObject("listBearingsIndustrial", bearingsIndustrialService.getListBearingsIndustrial());
        }else{
            mv.addObject("listBearingsIndustrial", bearingsIndustrialService.getListBearingsIndustrial(size, type));
        }               
        mv.addObject("listBearingsSize", bearingsIndustrialService.getListBearingsIndustrialSize()); 
        mv.addObject("listBearingsType", bearingsIndustrialService.getListBearingsIndustrialType()); //  for   filter
        
         mv.addObject("size", size); // it is need for feed back !!!!!!
         mv.addObject("type", type); // it is need for feed back !!!!!!
         
  
         mv.addObject("message", new Message()); // it is need for feed back !!!!!!
         session.setAttribute("search", "bearings"); // for search


          String str = "" ;
          
          if (size!=null && !size.equals("")) str += "&size="+size;
          if (type!=null && !type.equals("")) str += "&type="+type;
            session.setAttribute("currentpagewithpage", "/bearings?"+str);
          
        
            return mv;
    }
    
    
/*    
    @RequestMapping(value = "/bearings-{url}", method = RequestMethod.GET)
    public ModelAndView bearings_all(@PathVariable ("url") String url, HttpSession session) {
    
        ModelAndView mv = new ModelAndView("bearings/bearings_one");
        BearingsIndustrial bearingsIndustrial = bearingsIndustrial.getBearingsByUrl(url);
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
   */ 
}
