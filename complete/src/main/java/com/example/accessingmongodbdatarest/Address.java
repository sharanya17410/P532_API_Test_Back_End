package com.example.accessingmongodbdatarest;

import org.springframework.data.annotation.Id;


public class Address{
//    @Id private String id;
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    String street;
    public Address(String street){
        this.street=street;
    }

}