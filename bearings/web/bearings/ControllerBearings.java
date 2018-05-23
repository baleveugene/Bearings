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
                                    @RequestParam(value = "innerdiameter", required = false) String innerDiameter,
                                    @RequestParam(value = "outerdiameter", required = false) String outerDiameter,
                                    @RequestParam(value = "width", required = false) String width,
                                    @RequestParam(value = "type", required = false) String[] type,
                                    @RequestParam(value = "subtype", required = false) String[] subtype,
                                    @RequestParam(value = "manufacturer", required = false) String manufacturer,
                                    @RequestParam(value = "country", required = false) String country,
                                    HttpSession session ) {
        
        ModelAndView mv = new ModelAndView("bearings/bearings_all"); 
        if(innerDiameter==null && outerDiameter==null && width==null && type==null && subtype==null && manufacturer==null && country==null) {
            mv.addObject("listBearingsIndustrial", bearingsIndustrialService.getListBearingsIndustrial());
        }else{
            mv.addObject("listBearingsIndustrial", bearingsIndustrialService.getListBearingsIndustrial(
                    innerDiameter, outerDiameter, width, type, subtype, manufacturer, country));
        }               
        mv.addObject("listBearingsInnerDiameter", bearingsIndustrialService.getListBearingsIndustrialInnerDiameter());
        mv.addObject("listBearingsOuterDiameter", bearingsIndustrialService.getListBearingsIndustrialOuterDiameter());
        mv.addObject("listBearingsWidth", bearingsIndustrialService.getListBearingsIndustrialWidth());
        mv.addObject("listBearingsType", bearingsIndustrialService.getListBearingsIndustrialType()); //  for   filter
        mv.addObject("listBearingsSubType", bearingsIndustrialService.getListBearingsIndustrialSubType());
        mv.addObject("listBearingsManufacturer", bearingsIndustrialService.getListBearingsIndustrialManufacturer());
        mv.addObject("listBearingsCountry", bearingsIndustrialService.getListBearingsIndustrialCountry());
        
        
         mv.addObject("innerDiameter", innerDiameter); // it is need for feed back !!!!!!
         mv.addObject("outerDiameter", outerDiameter);
         mv.addObject("width", width);
         mv.addObject("type", type);
         mv.addObject("subtype", subtype);
         mv.addObject("manufacturer", manufacturer);
         mv.addObject("country", country); // it is need for feed back !!!!!!
         
  
         mv.addObject("message", new Message()); // it is need for feed back !!!!!!
         session.setAttribute("search", "bearings"); // for search


          String str = "" ;
          
          if (innerDiameter!=null && !innerDiameter.equals("")) str += "&innerdiameter="+innerDiameter;
          if (outerDiameter!=null && !outerDiameter.equals("")) str += "&outerdiameter="+outerDiameter;
          if (width!=null && !width.equals("")) str += "&width="+width;
          if (type!=null && !type.equals("")) str += "&type="+type[0];
          if (subtype!=null && !subtype.equals("")) str += "&subtype="+subtype[0];
          if (manufacturer!=null && !manufacturer.equals("")) str += "&manufacturer="+manufacturer;
          if (country!=null && !country.equals("")) str += "&country="+country;
            session.setAttribute("currentpagewithpage", "/bearings?"+str);
          
        
            return mv;
    }
        
    @RequestMapping(value = "/bearings-{url}", method = RequestMethod.GET)
    public ModelAndView bearings_one(@PathVariable ("url") String url, HttpSession session) {
    
        ModelAndView mv = new ModelAndView("bearings/bearings_one");
        BearingsIndustrial bearingsIndustrial = bearingsIndustrialService.getBearingsByUrl(url);
        mv.addObject("bearingsIndustrial", bearingsIndustrial);
        
        mv.addObject("message", new Message("Bearings " +bearingsIndustrial.getTypeEn() , bearingsIndustrial.getModel())); // it is need for feed back !!!!!!
        session.setAttribute("search", "bearings"); // for search
        session.setAttribute("currentpagewithpage", "/bearings-" + url);
        return mv;
    }
 


    @RequestMapping(value =  "/bearings/pdf/{url}", method = RequestMethod.GET)
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
BearingsIndustrial bearings = bearingsIndustrialService.getBearingsByUrl(url);
        String pathPdf = BearingsPdf.createPdfBearings(path, bearings, company, director, showPrice);

        File file = new File(pathPdf);
        byte[] contents = new byte[(int) file.length()];
        new FileInputStream(file).read(contents);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        String filename = "Bearings-" + bearings.getModel() + ".pdf";
        headers.setContentDispositionFormData(filename, filename);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        return new ResponseEntity<byte[]>(contents, headers, HttpStatus.OK);
    } 
}
