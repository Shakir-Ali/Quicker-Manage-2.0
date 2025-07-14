package com.shakirali.bakery.controller;

import com.shakirali.bakery.entity.User;
import com.shakirali.bakery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("register")
    public String registerUser(@RequestBody User user) {
        userService.saveUser(user);
        return "User registered successfully";
    }
}
