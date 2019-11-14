package com.stackroute.service;

import com.stackroute.domain.UserProfile;
import com.stackroute.repo.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements Services
{


    private UserProfileRepository userProfileRepository;


    @Autowired
    public ServiceImpl(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public UserProfile saveUser(UserProfile userProfile) {
        System.out.println(userProfile.toString());
        this.userProfileRepository.save(userProfile);
        return userProfile;

    }


    @Override
    public List<UserProfile> getAllUser() {
        List<UserProfile> list;
        list = (List<UserProfile>) this.userProfileRepository.findAll();
        return list;
    }




}
