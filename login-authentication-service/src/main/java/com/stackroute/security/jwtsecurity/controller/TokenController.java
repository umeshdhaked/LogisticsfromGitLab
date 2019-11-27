package com.stackroute.security.jwtsecurity.controller;

import com.stackroute.security.jwtsecurity.model.Retailer;
import com.stackroute.security.jwtsecurity.security.JwtGenerator;
import com.stackroute.security.jwtsecurity.security.JwtValidator;
import com.stackroute.security.jwtsecurity.services.RetailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    RetailerService retailerService;

    private JwtValidator jwtValidator;

    private JwtGenerator jwtGenerator;



    public TokenController(JwtGenerator jwtGenerator, JwtValidator jwtValidator) {
        this.jwtGenerator = jwtGenerator;
        this.jwtValidator = jwtValidator;
    }

    @CrossOrigin
    @PostMapping("/generate")
    public String generate(@RequestBody final Retailer retailer) {

        String generatedToken="";
        boolean check = retailerService.checkValidateDb(retailer);

        if(check) {
           // System.out.println("retailer Exist");
            generatedToken = jwtGenerator.generate(retailer);

           String tokenStr = "{\"token\":"+"\""+generatedToken+"\"}";

          //  System.out.println(tokenStr);

            return tokenStr;
        }
        else {
           // return "{\"token\":\"null\"}";
            return null;
        }



    }

    @CrossOrigin
    @PostMapping("/validate")
    public String validate(@RequestParam("token") String token, @RequestParam("email") String email){

        System.out.println("token from front = " + token);
        System.out.println("email from front = "+email);


        Retailer retailer1 = jwtValidator.validate(token);  //It will return the retailer using generated token

        System.out.println("retailer1 = "+retailer1.toString());

        if(email.equals(retailer1.getEmail())){
            return "validate successfully";
        }
        else {
            return "not validated";
        }


    }





    @PostMapping("/saveDummy")
    public void saveDummyRetailer(@RequestBody Retailer retailer){
        System.out.println("saving dummy");
        retailerService.saveDummyRetailer(retailer);
    }



}
