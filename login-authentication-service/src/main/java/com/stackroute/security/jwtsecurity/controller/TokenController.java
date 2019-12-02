package com.stackroute.security.jwtsecurity.controller;

import com.stackroute.security.jwtsecurity.model.User;
import com.stackroute.security.jwtsecurity.security.JwtGenerator;
import com.stackroute.security.jwtsecurity.security.JwtValidator;
import com.stackroute.security.jwtsecurity.services.RetailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@CrossOrigin
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
    public String generate(@RequestBody final User user) throws ParseException {

        System.out.println(user);
        String generatedToken = "";
        long userId = retailerService.checkValidateDb(user);

        if (userId != -1) {
             System.out.println("userID = "+userId);
            user.setId(userId);

            generatedToken = jwtGenerator.generate(user);

            String tokenStr = "{\"token\":" + "\"" + generatedToken + "\"}";

            //  System.out.println(tokenStr);

            return tokenStr;
        } else {
            // return "{\"token\":\"null\"}";
            return null;
        }


    }

    @CrossOrigin
    @PostMapping("/validate")
    public String validate(@RequestParam("token") String token, @RequestParam("email") String email) {

        System.out.println("token from front = " + token);
        System.out.println("email from front = " + email);


        User user1 = jwtValidator.validate(token);  //It will return the retailer using generated token

        System.out.println("retailer1 = "+ user1.toString());

        if (user1 != null) {
            if (email.equals(user1.getEmail())) {
                return "validate successfully";
            } else {
                return "emails not equals";
            }
        } else {
            return "not validate";
        }

    }


    @PostMapping("/saveDummy")
    public void saveDummyRetailer(@RequestBody User user) {
        System.out.println("saving dummy");
        retailerService.saveDummyRetailer(user);
    }


}
