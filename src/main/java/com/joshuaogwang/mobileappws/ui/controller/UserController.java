package com.joshuaogwang.mobileappws.ui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.joshuaogwang.mobileappws.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "limit", defaultValue = "50") int limit,
            @RequestParam(value = "limit", required = false, defaultValue = "desc") String sort) {
        return "Get users was called";
    }

    @GetMapping(path = "/{userId}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
        UserRest returnValue = new UserRest();
        returnValue.setFirstName("John");
        returnValue.setFirstName("Doe");
        returnValue.setFirstName("j.doe@email.com");
        returnValue.setFirstName("j.doe@email.com");
        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
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
