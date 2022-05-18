package com.example.Midterm.controller;

import com.example.Midterm.entity.User;
import com.example.Midterm.service.UserCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserCService userCService;

    @GetMapping("/")
    public String defaultPage() {
        return "default page";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerDB(@Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("registerForm", user);
            return "register";
        }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "loginPage";
    }


    }

// resume upload here

}
