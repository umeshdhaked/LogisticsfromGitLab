package com.example.neo4j.services;

import com.example.neo4j.model.User;
import com.example.neo4j.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public Collection<User> getAll() {
        return userRepo.getAllUsers();
    }
}
