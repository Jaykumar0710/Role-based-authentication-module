package com.jay.SecurityModuleRoleBased.controller;

import com.jay.SecurityModuleRoleBased.model.User;
import com.jay.SecurityModuleRoleBased.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private UserService userService;

    @GetMapping("/dashboard")
    public String showDashboard(Model model, Principal principal){
        String username = principal.getName();
        User user = userService.findByUsername(username);
        model.addAttribute("user", new User());
        model.addAttribute("user", userService.findByUsername(username));
        return "studentDashboard";
    }
}
