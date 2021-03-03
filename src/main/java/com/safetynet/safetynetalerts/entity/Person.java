package com.safetynet.safetynetalerts.entity;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class Person {

    @Size(max = 20)
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private int zip;
    private String phone;
    private String email;

}
