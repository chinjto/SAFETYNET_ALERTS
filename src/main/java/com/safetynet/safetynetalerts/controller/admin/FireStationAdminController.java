package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.dto.admin.FireStationAdminDTO;
import com.safetynet.safetynetalerts.service.process.admin.FireStationServiceAdmin;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/firestation")
public class FireStationAdminController {

    @NonNull
    private final FireStationServiceAdmin service;

    @GetMapping
    public Iterable<FireStationServiceAdmin> readAllfireStation() {
        return FireStationAdminDTO.readAll();
    }

    @PostMapping
    public FireStationAdminDTO createFireStation(@RequestBody FireStationAdminDTO fireStation) {
        return FireStationAdminDTO.create(fireStation);
    }

    @PutMapping
    public FireStationAdminDTO updateFireStation(@RequestParam String address, @RequestBody FireStationAdminDTO fireStation) {
        return FireStationAdminDTO.update(address, fireStation);
    }

    @DeleteMapping
    public Boolean delete(@RequestParam String address) {
        return FireStationAdminDTO.delete(address);
    }

}
