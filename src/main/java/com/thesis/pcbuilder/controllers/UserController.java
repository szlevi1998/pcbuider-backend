package com.thesis.pcbuilder.controllers;

import com.thesis.pcbuilder.request.UserLoginRequest;
import com.thesis.pcbuilder.request.UserRequest;
import com.thesis.pcbuilder.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/authenticate")
    public boolean authenticate(@RequestBody UserLoginRequest userLoginRequest){

        return userService.authenticate(userLoginRequest);
    }

    @PostMapping
    public void createUser(@RequestBody UserRequest userRequest){
        userService.createUser(userRequest);
    }

}
