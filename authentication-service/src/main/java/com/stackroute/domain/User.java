package com.stackroute.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User
{
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String mobileNum;
    private String password;

    public User(String email, String mobileNum, String password) {
        this.email = email;
        this.mobileNum = mobileNum;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "UserLoginDetails{" +
                "email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
