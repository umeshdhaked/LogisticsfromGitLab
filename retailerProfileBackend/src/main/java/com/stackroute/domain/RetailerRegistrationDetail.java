package com.stackroute.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

public class RetailerRegistrationDetail {

    private String email;
    private String mobileNum;
    private String password;

    public RetailerRegistrationDetail() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
