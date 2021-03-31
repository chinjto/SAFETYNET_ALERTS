package com.safetynet.safetynetalerts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSourceEntity {

    private List<PersonEntity> persons;

    private List<FireStationEntity> firestations;

    private List<MedicalRecordEntity> medicalrecords;

}
