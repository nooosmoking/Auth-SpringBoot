package com.example.Auth.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class AuthController {

//    private final PetService petService;

    @GetMapping("/login")
    public String loginGet(){
        return "login.html";
    }

    @PostMapping("/login")
    public String addPet(@RequestParam String username, @RequestParam String password, Model page){
        boolean isLoggedIn = false;
        String message = isLoggedIn? "You are now logged in" : "Login failed!";
        page.addAttribute("message", message);
        return "login.html";
    }

}
