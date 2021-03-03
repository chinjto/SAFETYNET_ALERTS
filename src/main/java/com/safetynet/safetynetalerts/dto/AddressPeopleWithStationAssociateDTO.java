package com.safetynet.safetynetalerts.dto;

import lombok.Data;

@Data
public class AddressPeopleWithStationAssociateDTO {


    private String lastname;
    private int age;
    private String phone;
    private int station;
    private String medications;
    private String allergies;
}
