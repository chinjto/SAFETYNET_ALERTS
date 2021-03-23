package com.safetynet.safetynetalerts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FireStationEntity {

    @Id
    private String address;

    private String station;

    @OneToMany
    private List<PersonEntity> persons;

}
