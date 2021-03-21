package com.safetynet.safetynetalerts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.TemporalType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecord {

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private String birthdate;

    private String[] medications;

    private String[] allergies;

    private Person person;

}
