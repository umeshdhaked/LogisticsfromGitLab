package com.techprimers.security.jwtsecurity.services;

import com.techprimers.security.jwtsecurity.model.Retailer;
import com.techprimers.security.jwtsecurity.repository.RetailerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetailerService {

    RetailerRepository retailerRepository;

    @Autowired
    public RetailerService(RetailerRepository retailerRepository) {
        this.retailerRepository = retailerRepository;
    }

    public Retailer getRetailerFromEmail(String email){

       return retailerRepository.findRetailerByEmail(email);
    }


    public boolean checkValidateDb(Retailer retailer){

        Retailer retailer1 = retailerRepository.findRetailerByEmail(retailer.getEmail());


        if(retailer.getEmail().equals(retailer1.getEmail()) && retailer.getPass().equals(retailer1.getPass())){
            return true;
        }
        else {
            return false;
        }

    }


    public void saveDummyRetailer(Retailer retailer){
//        Retailer retailer = new Retailer();
//        retailer.setEmail("umdk456@gmail.com");
//        retailer.setPass("12345678");
//        retailer.setRole("admin");
//        retailer.setId(25);

        retailerRepository.save(retailer);
    }

}
