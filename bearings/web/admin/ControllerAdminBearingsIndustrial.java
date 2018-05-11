package com.springapp.bearings.web.admin;

import com.springapp.bearings.service.BearingsIndustrialService;
import com.springapp.mvc.web.admin.*;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.security.access.annotation.Secured;

@Controller
@RequestMapping(value = "/admin")
public class ControllerAdminBearingsIndustrial {

    final private String BEARINGS_URL = "bearings";
    
    @Autowired  BearingsIndustrialService bearingsIndustrialService;
//    @Autowired  WorkWithFilesService workWithFilesService;

    
        
//        @RequestMapping(value = "/light_office/renewFiltersLightOffice", method = RequestMethod.GET)
            @RequestMapping(value = "/bearings/renewFiltersBearingsIndustrial", method = RequestMethod.GET)
    public String renewFiltersBearingsIndustrial(){
        bearingsIndustrialService.renewFiltersBearings();
        return "redirect:/admin/"+BEARINGS_URL;
    }
    

//    @Secured(value =  "ROLE_ADMIN_LIGHT") //   ???
    @RequestMapping(value = "/"+BEARINGS_URL, method = RequestMethod.GET)
    public ModelAndView adminWesold() {
    ModelAndView mv = new ModelAndView("admin/bearings_industrial_admin");
        mv.addObject("listBearingsIndustrial", bearingsIndustrialService.getListBearingsIndustrial());
        return mv;
    }
 

     
    @RequestMapping(value = "/bearings/add", method = RequestMethod.POST)
    public String adminWesold_Add_POST(@RequestParam("textFile") MultipartFile[] wesoldinf, HttpServletRequest request){
        if (wesoldinf != null && wesoldinf.length > 0) {
            String path = request.getServletContext().getRealPath("") + "/resources/";
            bearingsIndustrialService.uploadBearingsIndustrial(path, wesoldinf);
        }
        return "redirect:/admin/"+BEARINGS_URL;
    }
    
    
    
    
     ///       --------     Add pictures   ----------
      @RequestMapping(value = "/bearings/photos", method = RequestMethod.GET)
    public ModelAndView galleryBearings(HttpServletRequest request, Map<String,Object> map){
        ModelAndView mv = new ModelAndView("admin/gallerybearings");
        String path = request.getServletContext().getRealPath("") + "/resources/assets/images/products/bearings/industrial";
        mv.addObject("imageListBearings", bearingsIndustrialService.listImage(path));
        return mv;
    }
    
    
    @RequestMapping(value = "/bearings/photos/upload", method = RequestMethod.POST)
    public String adminUploadImagesBearings(@RequestParam("imageBearings") MultipartFile[] images, HttpServletRequest request){
        if (images != null && images.length > 0) {
            String path = request.getServletContext().getRealPath("") + "/resources/assets/images/products/bearings/industrial";
//            lighOfficeService.uploadImagesLathe(path, images);
            bearingsIndustrialService.uploadImagesBearings(path, images);
        }
        return "redirect:/admin/bearings/photos";
    }

//        @RequestMapping(value = "/gallerylathes/remove", method = RequestMethod.GET)
//    public String removeImageLathe(@RequestParam("image") String image, HttpServletRequest request) {
//        String path = request.getServletContext().getRealPath("") + "/resources/images/products/lathes";
//        workWithFilesService.removeImage(path,image);
//        return "redirect:/admin/gallerylathes";
//    }
  
}
