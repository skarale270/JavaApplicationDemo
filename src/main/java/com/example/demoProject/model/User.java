package com.example.demoProject.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
