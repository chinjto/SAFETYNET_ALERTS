package com.safetynet.safetynetalerts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecordEntity implements Serializable {

    public Long getId() {
        return id;
    }

    private String firstName;

    private String lastName;

    private String birthdate;

    private String medications;

    private String allergies;

    @ManyToOne
    private PersonEntity person;

    @Id
    private Long id;

    public void setId(final Long id) {
        this.id = id;
    }

}
