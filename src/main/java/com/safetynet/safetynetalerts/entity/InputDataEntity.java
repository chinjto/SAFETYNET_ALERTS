package com.safetynet.safetynetalerts.entity;

import lombok.Data;

@Data
public class InputDataEntity {

    private PersonEntity[] persons;

    private FireStationEntity[] firestations;

    private MedicalRecordEntity[] medicalrecords;

}
