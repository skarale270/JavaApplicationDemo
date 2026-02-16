package com.example.demoProject.service;

import com.example.demoProject.model.Task;
import com.example.demoProject.model.User;
import com.example.demoProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private  UserRepository userRepository;


    //create
    public void saveUser(User user) {
        userRepository.save(user);
    }

    //get
    public List<User> getAllUserDetails() {
        return userRepository.findAll();
    }
    //update

    //get by id
    public User getUserById(String userId) {
        System.out.printf("userId", userId);
        return userRepository.findById(userId).get();
    }

    public User updateUser(User userRequest){
        //get the existing document from DB
        // populate new value from request to existing object/entity/document
        User existingUser = userRepository.findById(userRequest.getUserId()).get();
        existingUser.setFirstName(userRequest.getFirstName());
        existingUser.setLastName(userRequest.getLastName());
        existingUser.setEmail(userRequest.getEmail());
        existingUser.setAge(userRequest.getAge());
        return userRepository.save(userRequest);
    }

    public String deleteUser(String userId){
        userRepository.deleteById(userId);
        return userId+" user deleted from dashboard ";
    }
}
