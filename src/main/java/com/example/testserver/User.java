package com.example.testserver;

import lombok.Data;


import java.text.DecimalFormat;

@Data
public class User {

    private  Long id;
    private  String name;
    private  DecimalFormat phone;
    private  String email;
    private  String gender;
    private  int age;

    private String login;
    private String password;


}
