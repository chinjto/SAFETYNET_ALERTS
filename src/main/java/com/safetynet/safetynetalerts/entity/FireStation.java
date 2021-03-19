package com.safetynet.safetynetalerts.entity;

import lombok.Data;

import java.util.List;

@Data
public class FireStation {

    private String address;

    private String station;

    private List<Person> persons;

}
