package com.springapp.mvc.web.admin;

import com.springapp.mvc.domain.User;
import com.springapp.mvc.service.interfaces.UserService;


import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/admin")
public class ControllerAdminUsers {


    @Autowired private UserService userService;


    @RequestMapping(value="/users", method = RequestMethod.GET)
    public void users(Map<String,Object> map) {
        List<User> userList = userService.listUsers();
        map.put("userList", userList);
        putPagesInfo(map, userList.size(), 20);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String changeUserRole(@RequestParam("userId") String num,
                                 @RequestParam("userRole") String role) {
        userService.setUserRole(num, role);
        return "redirect:/admin/users";
    }

  
    
 //         /admin/user/DmitryPro/1111/6558822@gmail.com/ROLE_ADMIN/add
 //         /admin/user/helets/helets/mr.helets@mail.ru/ROLE_TEST/add
 //         /admin/user/mr.helets@mail.ru/mr.helets@mail.ru/mr.helets@mail.ru/ROLE_TEST/add
       @RequestMapping(value="/user/{username}/{password}/{email}/{role}/add", method = RequestMethod.GET)
    public String usersAdd(
            @PathVariable ("username") String username ,
            @PathVariable ("password") String password ,
            @PathVariable ("email") String email ,
            @PathVariable ("role") String role 
                                                    ) {
        User user = new User();
        user.setUsername(username);
        user.setUserPassword(password);
        user.setEmail(email);
        user.setRole(role);
        userService.saveUser(user);

        return "redirect:/admin/users";
    } 
    
    
    
    private void putPagesInfo(Map<String, Object> map, int itemsNum, int itemsPerPage) {
        int pagesNum = itemsNum / itemsPerPage;
        if (itemsNum % itemsPerPage != 0) {
            pagesNum++;
        }
        map.put("itemsPerPage", itemsPerPage);
        map.put("itemsNum", itemsNum);
        map.put("pagesNum", pagesNum);
    }  
    
}
