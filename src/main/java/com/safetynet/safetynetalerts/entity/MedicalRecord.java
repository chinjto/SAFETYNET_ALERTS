package com.safetynet.safetynetalerts.entity;

import lombok.Data;

@Data
public class MedicalRecord {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String medications;
    private String allergies;
}
