package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements Services
{


    private UserRepo repo;


    @Autowired
    public ServiceImpl(UserRepo myMusicRepo) {
        this.repo = myMusicRepo;
    }

    @Override
    public User saveUser(User user) {
        System.out.println(user);
        this.repo.save(user);
        return user;

    }



    @Override
    public List<User> getAllUser() {
        List<User> list;
        list = (List<User>) this.repo.findAll();
        return list;
    }

    @Override
    public User getPass(String s) {
        User newUser = this.repo.findByEmail(s);
        newUser.setEmail("null");
        return newUser;
    }

    @Override
    public boolean getUser(String name) {
        return this.repo.existsByEmail(name);
    }
}
