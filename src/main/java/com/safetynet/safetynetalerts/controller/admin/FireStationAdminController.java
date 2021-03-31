package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.dto.admin.FireStationAdminDTO;
import com.safetynet.safetynetalerts.service.process.admin.FireStationServiceAdmin;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Controller for {@link FireStationAdminDTO fire firestations} resources.
 */
@Slf4j
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
        try {
            return service.create(data);
        } catch (Exception e) {
            log.error("Error in FireStationAdminController#create process", e);
            return false;
        }
    }

    /**
     * Webservice for {@link FireStationAdminDTO fire stations} updates.
     *
     * @param data the {@link FireStationAdminDTO fire station} to update.
     * @return true if process succeeded, else false
     */
    @PutMapping
    public Boolean update(@RequestBody FireStationAdminDTO data) throws IOException {
        try {
            return service.update(data);
        } catch (Exception e) {
            log.error("Error in FireStationAdminController#update process", e);
            return false;
        }
    }

    /**
     * Webservice for {@link FireStationAdminDTO fire stations} deletes.
     *
     * @param data the {@link FireStationAdminDTO fire station} to delete.
     * @return true if process succeeded, else false
     */
    @DeleteMapping
    public Boolean delete(@RequestBody FireStationAdminDTO data) throws IOException {
        try {
            return service.delete(data);
        } catch (Exception e) {
            log.error("Error in FireStationAdminController#delete process", e);
            return false;
        }
    }

}
