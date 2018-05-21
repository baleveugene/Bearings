package com.springapp.mvc.web;



import com.springapp.mvc.domain.User;


import com.springapp.mvc.service.interfaces.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
  


    @Autowired
    private UserService userService;



    @RequestMapping(value="/", method = RequestMethod.GET)
    public String admin(HttpServletRequest request) {
        if(request.isUserInRole("ROLE_ADMIN")){
            return "redirect:/admin/hmc";
        }
        return "redirect:/admin/adminEntry";
    }

    @RequestMapping(value = "/adminEntry", method = RequestMethod.GET)
    public void adminEntry(@RequestParam(value = "error", required = false) String error,
                           @RequestParam(value = "logout", required = false) String logout,
                           Map<String,Object> map) {
        if (error != null) {
            map.put("error", "Invalid username or password!");
        }
        if (logout != null) {
            map.put("msg", "You've been logged out successfully.");
        }
    }


    
    

     

    

}
