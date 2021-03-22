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

    public static MedicalRecordServiceAdmin create(final MedicalRecordAdminDTO medicalRecord) {
        return null;
    }

    public static Iterable<MedicalRecordServiceAdmin> readAll() {
        return null;
    }

    public static MedicalRecordEntity update(final MedicalRecordAdminDTO medicalRecord) {
        return null;
    }

    public void delete() {
        return null;
    }

}
