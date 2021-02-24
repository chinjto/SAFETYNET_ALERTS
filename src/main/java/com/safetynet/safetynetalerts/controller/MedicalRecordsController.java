package com.safetynet.safetynetalerts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicalRecordsController{

    @GetMapping("/medical_records/firstname")
    public String firstname(@RequestParam String firstname){
        return firstname();
    }

    @GetMapping("/medical_records/lastname")
    public String lastName(@RequestParam String lastName){
        return lastName();
    }

    @GetMapping("/medical_records/birthdate")
    public String birthDate(@RequestParam String birthDate){
        return birthDate();
    }

    @GetMapping("/medical_records/medications")
    public String medications(@RequestParam String medications){
        return medications();
    }
}
