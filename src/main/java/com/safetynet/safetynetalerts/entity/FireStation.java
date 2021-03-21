package com.safetynet.safetynetalerts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FireStation {

    private String address;

    private String station;

    private List<Person> persons;

}
