package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.entity.MedicalRecord;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicalRecords")
public class MedicalRecordAdminController {

    @PostMapping
    public MedicalRecord createMedicalRecord(@RequestBody MedicalRecord medicalRecord){
        // TODO
        return medicalRecord;
    }

    @PutMapping("/{id}")
    public MedicalRecord updateMedicalRecord(@PathVariable Long id,@RequestBody MedicalRecord medicalRecord){
        // TODO
        return medicalRecord;
    }

    @DeleteMapping("/{id}")
    public Boolean deleteMedicalRecord(@PathVariable Long id){
        // TODO
        return false;
    }



}
