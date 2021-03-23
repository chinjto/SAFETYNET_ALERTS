package com.safetynet.safetynetalerts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity implements Serializable {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String city;

    private String zip;

    private String phone;

    private String email;

    @OneToMany
    private List<MedicalRecordEntity> medicalRecords;

    @ManyToOne
    private FireStationEntity fireStation;

}
