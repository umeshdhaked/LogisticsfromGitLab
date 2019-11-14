package com.stackroute.service;

import com.stackroute.domain.UserProfile;

import java.util.List;



public interface Services
{
    public UserProfile saveUser(UserProfile userProfile);
    public List<UserProfile> getAllUser();

}
