package com.stackroute.controller;

import com.google.gson.Gson;
import com.stackroute.domain.RetailerProfile;
import com.stackroute.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/retailerProfile")
public class RetailerController
{

    private Services service;

    @Autowired
    public RetailerController(Services services)
    {
        this.service = services;
    }


    @CrossOrigin
    @GetMapping("/getAllRetailersProfileList")
    public List<RetailerProfile> getUser()
    {
        return service.getAllUser();
    }


    @CrossOrigin
    @PostMapping("/saveDetailOfRetailer")
    public void updateRetailer(@RequestParam("docPic")MultipartFile file1,@RequestParam("profilePic")MultipartFile  file2,@RequestParam("retailer")String jstring) throws IOException //we will be getting retailerEmailDetail in this object with other details
    {


        Gson g = new Gson();
        RetailerProfile profileData = g.fromJson(jstring, RetailerProfile.class);

        RetailerProfile existRetailer = service.getRetailerByEmail(profileData.getEmail()); //checking if user exist

        if(existRetailer != null)
        {
            profileData.setId(existRetailer.getId());
        }

        profileData.setDocPic(file1.getBytes());
        profileData.setDocPicType(file1.getContentType());
        profileData.setProfilePic(file2.getBytes());
        profileData.setProfilePicType(file2.getContentType());
        service.updateRetailer(profileData);

    }



    @CrossOrigin
    @GetMapping("/getRetailerFromEmail")
    public RetailerProfile picHandler(@RequestParam("email") String email){
      //  System.out.println("email = "+email);
//        System.out.println();

     return service.getRetailerByEmail(email);

    }






//
//    // Trash for Rest Template
//    @CrossOrigin
//    @GetMapping("/findRetailerProfilebyEmail")
//    public RetailerProfile getByEmail(@RequestBody RetailerProfile retailerProfile)
//    {
//
//        String  retailerRegistrationDetail = getDetailRegistrationAPI(retailerProfile);
//
//        retailerProfile.setMobileNo(retailerRegistrationDetail);
//
//
//        return service.getRetailerByEmail(retailerProfile.getEmailId());
//    }
//
//    @CrossOrigin
//    @GetMapping("/getMobileNoFromEmail")
//    public String getDetailRegistrationAPI(@RequestBody RetailerProfile retailerProfile)
//    {
//
//        final String uri = "http://172.23.234.99:8080/api/v1/getDetail/"+retailerProfile.getEmailId();
//
//        RestTemplate restTemplate = new RestTemplate();
//
//
////            RetailerRegistrationDetail[] result = null;
//
//
//        String result="";
//
//        try {
//            result = restTemplate.getForObject(uri, String.class);
//
//        }
//        catch ( Exception e ){
//            System.out.println("Exception : "+e);
//        }
//        return result;
//    }


}

