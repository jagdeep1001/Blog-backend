package com.casestudy2.blog.controller;

import com.casestudy2.blog.model.users;
import com.casestudy2.blog.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

@RestController
@CrossOrigin(origins= "http://localhost:4200", allowedHeaders = "*")
public class UserController {
    @Autowired
    userService UserService;

    @GetMapping(path ="/validateLogin", produces ="application/json")
    public String validateLogin() {
        //System.out.println("Hello");
        return "\"valid\"";
    }

    @PostMapping(value="/addUser")
   public users addUser(@RequestBody users user){
        System.out.println("hello");
    System.out.println(UserService.addUser(user));
    return UserService.addUser(user);
    }
    @RequestMapping(value="/logout", method=RequestMethod.GET)
    public String logout (HttpServletRequest request, HttpServletResponse response)
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth);
        if(auth!=null)
        {
            new SecurityContextLogoutHandler().logout(request,response,auth);
            request.getSession().invalidate();
        }
        return "/home";


    }
    @GetMapping("/callUser")
    public users callUsers(Principal principal)
    {
        return UserService.callUser(principal);
    }

    @PostMapping("/editUser")
    public users editUsers(@RequestBody users user)
    {
        return UserService.changeUserDetails(user);
    }
    @GetMapping(value="/callUser/{id}")
    public users getOneUser(@PathVariable("id") Long id) {
        return UserService.getOneUser(id);
    }


}
