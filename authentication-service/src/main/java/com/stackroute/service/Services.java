package com.stackroute.service;

import com.stackroute.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface Services
{
    public User saveUser(User user);
    public List<User> getAllUser();
    public boolean getUser(String s);
    public User getPass(String s);
}
