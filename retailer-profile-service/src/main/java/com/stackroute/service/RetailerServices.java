package com.stackroute.service;

import com.stackroute.domain.RetailerProfile;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface RetailerServices {


    public void updateRetailer(RetailerProfile retailerProfile);

    public List<RetailerProfile> getAllUser();

    public RetailerProfile getRetailerByEmail(String email);


}
