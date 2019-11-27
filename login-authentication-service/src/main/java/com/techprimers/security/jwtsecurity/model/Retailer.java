package com.techprimers.security.jwtsecurity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Retailer {

    @Id
    private long id;
    private String email;
    private String pass;
    private String role;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Retailer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
