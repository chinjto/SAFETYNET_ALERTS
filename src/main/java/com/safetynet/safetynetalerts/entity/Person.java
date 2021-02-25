package com.safetynet.safetynetalerts.entity;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class Person {

    @Size(max = 20)
    private String lastName;

}
