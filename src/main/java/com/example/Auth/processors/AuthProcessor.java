package com.example.Auth.processors;

import com.example.Auth.services.LoggedUserManagementService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Data
public class AuthProcessor {
    private final LoggedUserManagementService loggedUserManagementService;

    private String username;
    private String password;

    @Autowired
    public AuthProcessor(LoggedUserManagementService loggedUserManagementService){
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login(){
        boolean result = username.equals("annette")&&password.equals("password");
        if (result){
            loggedUserManagementService.setUsername(username);
        }
        return result;
    }
}
