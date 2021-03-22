package com.safetynet.safetynetalerts.dto.admin;

import com.safetynet.safetynetalerts.entity.MedicalRecordEntity;
import com.safetynet.safetynetalerts.service.admin.MedicalRecordServiceAdmin;
import lombok.Data;

@Data
public class MedicalRecordAdminDTO {

    private String firstName;

    private String lastName;

    private String birthdate;

    private String[] medications;

    private String[] allergies;

}
