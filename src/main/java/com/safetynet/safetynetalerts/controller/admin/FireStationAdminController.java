package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.dto.admin.FireStationAdminDTO;
import com.safetynet.safetynetalerts.service.process.admin.FireStationServiceAdmin;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Controller for {@link FireStationAdminDTO fire firestations} resources.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/firestation")
public class FireStationAdminController {

    /**
     * Service for {@link FireStationAdminDTO fire firestations} resources.
     */
    @NonNull
    private FireStationServiceAdmin service;

    /**
     * Webservice for {@link FireStationAdminDTO fire stations} creations.
     *
     * @param data the {@link FireStationAdminDTO fire station} to create.
     * @return true if process succeeded, else false
     */
    @PostMapping
    public Boolean create(@RequestBody FireStationAdminDTO data) throws IOException {
        return service.create(data);
    }

    /**
     * Webservice for {@link FireStationAdminDTO fire stations} updates.
     *
     * @param data the {@link FireStationAdminDTO fire station} to update.
     * @return true if process succeeded, else false
     */
    @PutMapping
    public Boolean update(@RequestBody FireStationAdminDTO data) throws IOException {
        return service.update(data);
    }

    /**
     * Webservice for {@link FireStationAdminDTO fire stations} deletes.
     *
     * @param data the {@link FireStationAdminDTO fire station} to delete.
     * @return true if process succeeded, else false
     */
    @DeleteMapping
    public Boolean delete(@RequestBody FireStationAdminDTO data) throws IOException {
        return service.delete(data);
    }

}
