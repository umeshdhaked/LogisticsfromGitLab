package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
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
        public void saveUsers(@RequestBody User user)
        {
            System.out.printf("saved");

            service.saveUser(user);
        }

        @GetMapping("/get")
        @CrossOrigin
        public List<User> getUser()
        {
            return service.getAllUser();
        }

        @GetMapping("/get/{names}")
        @CrossOrigin
        public boolean getUserByName(@PathVariable String names)
        {
            return service.getUser(names);
        }

        @GetMapping("/getpass/{names}")
        @CrossOrigin
        public ResponseEntity<?> getPassByName(@PathVariable String names)
        {
            System.out.println(names);
//     String s =service.getPass(names);
            // System.out.println(s);

            ResponseEntity responseEntity = new ResponseEntity(service.getPass(names), HttpStatus.OK);
            System.out.println(responseEntity);
            return responseEntity;
        }

    }

