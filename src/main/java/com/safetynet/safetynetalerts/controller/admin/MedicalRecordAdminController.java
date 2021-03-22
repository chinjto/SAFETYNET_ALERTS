package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.dto.admin.MedicalRecordAdminDTO;
import com.safetynet.safetynetalerts.entity.MedicalRecordEntity;
import com.safetynet.safetynetalerts.service.admin.MedicalRecordServiceAdmin;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicalRecord")
public class MedicalRecordAdminController {

    @NonNull
    private MedicalRecordServiceAdmin service;


    @GetMapping()
    public Iterable<MedicalRecordAdminDTO> readAllPerson() {
        return service.readAll();
    }

    @PostMapping()
    public MedicalRecordAdminDTO createPerson(@RequestBody MedicalRecordAdminDTO item) {
        return service.create(item);
    }

    @PutMapping("/{id}")
    public MedicalRecordAdminDTO updatePerson(@PathVariable Long id, @RequestBody MedicalRecordAdminDTO item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteMedicalRecord(@PathVariable Long id) {
        return service.delete(id);
    }

}
