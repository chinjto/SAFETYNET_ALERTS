package com.safetynet.safetynetalerts.entity;

import lombok.Data;

@Data
public class InputData {

    private Person[] persons;

    private FireStation[] firestations;

    private MedicalRecord[] medicalrecords;

}
