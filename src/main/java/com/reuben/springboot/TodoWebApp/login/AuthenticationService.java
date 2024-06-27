package com.reuben.springboot.TodoWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticateUser(String name, String password){
        boolean isValidName = name.equalsIgnoreCase("Reuben");
        boolean isValidPassword = password.equals("Reuben");
        return isValidName && isValidPassword;
    }
}
