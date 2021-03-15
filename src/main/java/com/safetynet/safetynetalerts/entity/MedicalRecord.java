package com.safetynet.safetynetalerts.entity;

import lombok.Data;

import java.util.Map;

@Data
public class MedicalRecord {
    private String firstName;
    private String lastName;
    private String birthdate;
    private String[] medications;
    private String[] allergies;
}
