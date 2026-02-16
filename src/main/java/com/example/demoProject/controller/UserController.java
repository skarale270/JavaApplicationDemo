package com.example.demoProject.controller;

import com.example.demoProject.dto.UserIdRequest;
import com.example.demoProject.model.User;
import com.example.demoProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private  UserService userService;

    @GetMapping(value = "/welcome")
    public String getWelcomeMessage() {
        return "Welcome to Java";
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUserDetails();
    }

    @PostMapping("/userById")
    public User getUser(@RequestBody UserIdRequest userRequest) {
        return userService.getUserById(userRequest.getUserId());
    }

    @PostMapping(value = "/save")
    public void saveUser(@RequestBody User user) {
         userService.saveUser(user);
    }

    @PostMapping("/update")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
            return userService.deleteUser(userId);
    }
}
