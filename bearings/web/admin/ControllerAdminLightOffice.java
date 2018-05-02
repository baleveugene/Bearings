package com.springapp.light.web.admin;

import com.springapp.light.service.LighOfficeService;
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
public class ControllerAdminLightOffice {

    final private String LIGHT_URL = "light";
    
    @Autowired  LighOfficeService lighOfficeService;
//    @Autowired  WorkWithFilesService workWithFilesService;

    
        
//        @RequestMapping(value = "/light_office/renewFiltersLightOffice", method = RequestMethod.GET)
            @RequestMapping(value = "/light/renewFiltersLightOffice", method = RequestMethod.GET)
    public String renewFiltersLightOffice(){
        lighOfficeService.renewFiltersLight();
        return "redirect:/admin/"+LIGHT_URL;
    }
    

//    @Secured(value =  "ROLE_ADMIN_LIGHT") //   ???
    @RequestMapping(value = "/"+LIGHT_URL, method = RequestMethod.GET)
    public ModelAndView adminWesold() {
    ModelAndView mv = new ModelAndView("admin/light_office_admin");
        mv.addObject("listLightOffice", lighOfficeService.getListLightOffice());
        return mv;
    }
 

     
    @RequestMapping(value = "/light/add", method = RequestMethod.POST)
    public String adminWesold_Add_POST(@RequestParam("textFile") MultipartFile[] wesoldinf, HttpServletRequest request){
        if (wesoldinf != null && wesoldinf.length > 0) {
            String path = request.getServletContext().getRealPath("") + "/resources/";
            lighOfficeService.uploadLightOffice(path, wesoldinf);
        }
        return "redirect:/admin/"+LIGHT_URL;
    }
    
    
    
    
     ///       --------     Add pictures   ----------
      @RequestMapping(value = "/light/photos", method = RequestMethod.GET)
    public ModelAndView galleryLight(HttpServletRequest request, Map<String,Object> map){
        ModelAndView mv = new ModelAndView("admin/gallerylight");
        String path = request.getServletContext().getRealPath("") + "/resources/assets/images/products/light/office";
        mv.addObject("imageListLight", lighOfficeService.listImage(path));
        return mv;
    }
    
    
    @RequestMapping(value = "/light/photos/upload", method = RequestMethod.POST)
    public String adminUploadImagesLathe(@RequestParam("imageLathe") MultipartFile[] images, HttpServletRequest request){
        if (images != null && images.length > 0) {
            String path = request.getServletContext().getRealPath("") + "/resources/assets/images/products/light/office";
//            lighOfficeService.uploadImagesLathe(path, images);
            lighOfficeService.uploadImagesLight(path, images);
        }
        return "redirect:/admin/light/photos";
    }

//        @RequestMapping(value = "/gallerylathes/remove", method = RequestMethod.GET)
//    public String removeImageLathe(@RequestParam("image") String image, HttpServletRequest request) {
//        String path = request.getServletContext().getRealPath("") + "/resources/images/products/lathes";
//        workWithFilesService.removeImage(path,image);
//        return "redirect:/admin/gallerylathes";
//    }
  
}
