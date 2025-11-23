package com.example.demo.controllers;

import com.example.demo.dto.ShowUserInfoDto;
import com.example.demo.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public String listUsers(Model model) {
        List<ShowUserInfoDto> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "user-list";
    }
}


