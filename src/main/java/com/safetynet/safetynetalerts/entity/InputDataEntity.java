package com.safetynet.safetynetalerts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InputDataEntity {

    private PersonEntity[] persons;

    private FireStationEntity[] firestations;

    private MedicalRecordEntity[] medicalrecords;

}
