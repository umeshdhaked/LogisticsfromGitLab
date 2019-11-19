package com.stackroute.controller;

import com.stackroute.domain.RetailerProfile;
import com.stackroute.domain.RetailerRegistrationDetail;
import com.stackroute.service.Services;
import com.sun.net.httpserver.Headers;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
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

    @PostMapping("/saveDetailOfRetailer")
    public void updateRetailer(@RequestBody RetailerProfile retailerProfile) //we will be getting retailerEmailDetail in this object
    {
        RetailerRegistrationDetail [] retailerRegistrationDetail = getDetailRegistrationAPI(retailerProfile);

        retailerProfile.setMobileNo(retailerRegistrationDetail[0].getMobileNum());

        service.updateRetailer(retailerProfile);
    }

    @GetMapping("/getAllRetailersProfileList")
    public List<RetailerProfile> getUser()
    {
        return service.getAllUser();
    }

    @GetMapping("/findRetailerProfilebyEmail")
    public RetailerProfile getByEmail(@RequestBody RetailerProfile retailerProfile)
    {

        RetailerRegistrationDetail [] retailerRegistrationDetail = getDetailRegistrationAPI(retailerProfile);

        retailerProfile.setMobileNo(retailerRegistrationDetail[0].getMobileNum());


        return service.getRetailerByEmail(retailerProfile.getEmailId());
    }

    @GetMapping("/getMobileNoFromEmail")
    public RetailerRegistrationDetail[] getDetailRegistrationAPI(@RequestBody RetailerProfile retailerProfile)
    {

        final String uri = "http://172.23.234.99:8080/api/v1/getDetail/"+retailerProfile.getEmailId();

        //  final String uri1 = "http://172.23.234.99:8080/api/v1/getMobileNo/"+retailerProfile.getEmailId();

        RestTemplate restTemplate = new RestTemplate();
            RetailerRegistrationDetail[] result = null;

        try {
            result = restTemplate.getForObject(uri, RetailerRegistrationDetail[].class);

        }
        catch ( Exception e ){
            System.out.println("Exception : "+e);
        }
        return result;
    }

      @PostMapping("/updateMobileNumber")
      public void mobileNoUpdateHandler(@RequestBody RetailerProfile retailerProfile)
      {

          RetailerRegistrationDetail [] oldData = getDetailRegistrationAPI(retailerProfile);
          String url  = "http://172.23.234.99:8080/api/v1/updateMobileNo";



          RestTemplate restTemplate = new RestTemplate();
          HttpHeaders headers = new HttpHeaders();
          headers.setContentType(MediaType.APPLICATION_JSON);

          RetailerRegistrationDetail retailerRegistrationDetail;
          retailerRegistrationDetail = new RetailerRegistrationDetail();

          retailerRegistrationDetail.setEmail(oldData[0].getEmail());
          retailerRegistrationDetail.setMobileNum(retailerProfile.getMobileNo());
          retailerRegistrationDetail.setPassword(oldData[0].getPassword());

          RetailerRegistrationDetail[] newData;

          try {
              newData = restTemplate.postForObject(url,retailerRegistrationDetail,RetailerRegistrationDetail[].class);
          }
          catch (Exception e){
              System.out.println("Mobile No. Update Exception is : " + e );
          }

      }

}

