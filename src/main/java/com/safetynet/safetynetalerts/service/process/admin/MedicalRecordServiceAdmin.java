package com.safetynet.safetynetalerts.service.process.admin;

import com.safetynet.safetynetalerts.dto.admin.MedicalRecordAdminDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MedicalRecordServiceAdmin {

    public Boolean delete(final Long id) {return null;
    }

    public Iterable<MedicalRecordAdminDTO> readAll() {
        return null;
    }

    public MedicalRecordAdminDTO update(final Long id, final MedicalRecordAdminDTO item) {
        return null;
    }

    public MedicalRecordAdminDTO create(final MedicalRecordAdminDTO item) {
        return null;
    }

}
