package com.example.neo4j.controller;

import com.example.neo4j.model.User;
import com.example.neo4j.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;

@RestController
@RequestMapping("/neo4j/rest")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Collection<User> getAll() {
        return userService.getAll();
    }



}
