package com.joshuaogwang.mobileappws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public String createUser() {
        return "Create User was called.";
    }

    @PutMapping
    public String updateUser() {
        return "Update User was called.";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Update User was called.";
    }
}