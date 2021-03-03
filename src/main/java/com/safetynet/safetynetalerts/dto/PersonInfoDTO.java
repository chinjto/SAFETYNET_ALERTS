package com.safetynet.safetynetalerts.dto;

import lombok.Data;

@Data
public class PersonInfoDTO {

    private String firstName;
    private String lastname;
    private String address;
    private int age;
    private String email;
    private String medications;
    private String allergies;
}
