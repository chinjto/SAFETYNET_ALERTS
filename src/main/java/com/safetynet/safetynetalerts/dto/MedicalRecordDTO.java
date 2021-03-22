package com.safetynet.safetynetalerts.dto;

import lombok.Data;

import java.util.List;

@Data
public class MedicalRecordDTO {

    private List<String> medications;

    private String dosage;

    private List<String> allergies;


}
