package com.stackroute.controller;

import com.stackroute.domain.UserProfile;
import com.stackroute.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/retailerProfile")
public class UserController
{

    private Services service;

        @Autowired
        public UserController(Services service)
        {
            this.service = service;
        }



        @PostMapping("/save")
        @CrossOrigin
        public UserProfile saveUsers(@RequestBody UserProfile userProfile)
        {
            System.out.printf("saved");

            service.saveUser(userProfile);

            return userProfile;
        }

        @GetMapping("/get")
        @CrossOrigin
        public List<UserProfile> getUser()
        {
            return service.getAllUser();
        }


    }

