package com.example.Auth.processors;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Data
public class AuthProcessor {
    private String username;
    private String password;

    public boolean login(){
        return username.equals("annette")&&password.equals("password");
    }
}
