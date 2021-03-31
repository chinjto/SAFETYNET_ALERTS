package com.safetynet.safetynetalerts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity implements Serializable {

    private String firstName;

    private String lastName;

    private String address;

    private String city;

    private String zip;

    private String phone;

    private String email;

}
