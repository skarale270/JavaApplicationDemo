package com.example.demoProject.controller;

import com.example.demoProject.model.User;
import com.example.demoProject.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/welcome")
    public String getWelcomeMessage() {
        return "Welcome to Java";
    }

    @PostMapping(value = "/save")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
