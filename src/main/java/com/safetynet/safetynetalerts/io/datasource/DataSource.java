package com.safetynet.safetynetalerts.io.datasource;

import com.safetynet.safetynetalerts.io.entity.FireStationEntity;
import com.safetynet.safetynetalerts.io.entity.MedicalRecordEntity;
import com.safetynet.safetynetalerts.io.entity.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSource {

    private List<PersonEntity> persons;

    private List<FireStationEntity> firestations;

    private List<MedicalRecordEntity> medicalrecords;

}
