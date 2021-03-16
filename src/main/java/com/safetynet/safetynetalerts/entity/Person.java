package com.safetynet.safetynetalerts.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
public class Person {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String firstName;

    private String lastName;

    private String address;

    private String city;

    private String zip;

    private String phone;

    private String email;

}
