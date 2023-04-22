package com.example.demo;

public class CreateHelloForm {
    private String name;
    private String country;


    public CreateHelloForm(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
