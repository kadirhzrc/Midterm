package com.example.Midterm.controller;

import com.example.Midterm.service.UserCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    public AdminController(UserCService userCService) {
        this.userCService = userCService;
    }
    private final UserCService userCService;


    // implement http session
    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession httpSession) {
        if (httpSession.getAttribute("userLoggedIn") != null && httpSession.getAttribute("userLoggedIn").equals("yes")) {
            model.addAttribute("users" , /*add model var */);

            return "dashboard";
        }
       return "unauthorized";
    }

}
