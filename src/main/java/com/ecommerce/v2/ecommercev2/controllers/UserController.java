package com.ecommerce.v2.ecommercev2.controllers;

import com.ecommerce.v2.ecommercev2.entities.User;
import com.ecommerce.v2.ecommercev2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping({"/create-user"})
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping({"/for-admin"})
    @PreAuthorize("hasRole('ADMIN')")
    public String forAdmin(){
        return "this url is for admins";
    }

    @GetMapping({"/for-user"}) 
    @PreAuthorize("hasRole('USER')")
    public String forUser(){
        return "this url is for users";
    }
}
