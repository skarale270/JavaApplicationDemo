package com.example.demoProject.service;

import com.example.demoProject.model.User;
import com.example.demoProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private  UserRepository userRepository;


    //create
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    //get

    //update

    //get all
}
