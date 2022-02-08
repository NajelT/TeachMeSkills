package com.TMS.Lesson10;

public class Address {

    private String street;

    public Address(boolean isY){
        street = isY ? "young street" : "old street";
    }

    public String getStreet() {
        return street;
    }
}
