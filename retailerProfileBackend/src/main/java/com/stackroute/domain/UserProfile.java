package com.stackroute.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserProfile
{

//    private String email;
//    private String mobileNum;
//    private String password;

    @Id
    private int id;
    private String firstName;
    private String age;
    private String lastName;
    private String emergencyContact;
    private String dateOfBirth;
    private String placeOfBirth;
    private String gstIn;
    private String permanentAddress;
    private String shopAddress;

    public UserProfile() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getGstIn() {
        return gstIn;
    }

    public void setGstIn(String gstIn) {
        this.gstIn = gstIn;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age='" + age + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", gstIn='" + gstIn + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                '}';
    }
}