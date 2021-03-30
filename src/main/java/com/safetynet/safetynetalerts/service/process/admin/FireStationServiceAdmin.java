package com.safetynet.safetynetalerts.service.process.admin;

import com.safetynet.safetynetalerts.dto.admin.FireStationAdminDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Services for {@link FireStationAdminDTO fire stations} ressources.
 */
public interface FireStationServiceAdmin {

    /**
     * Service for {@link FireStationAdminDTO fire stations} creations.
     *
     * @param dto the {@link FireStationAdminDTO fire station} to create.
     * @return true if process succeeded, else false
     */
    Boolean create(final FireStationAdminDTO dto);

    /**
     * Service for {@link FireStationAdminDTO fire stations} updates.
     *
     * @param dto the {@link FireStationAdminDTO fire station} to update.
     * @return true if process succeeded, else false
     */
    Boolean update(final FireStationAdminDTO dto);

    /**
     * Service for {@link FireStationAdminDTO fire stations} deletes.
     *
     * @param dto the {@link FireStationAdminDTO fire station} to delete.
     * @return true if process succeeded, else false
     */
    Boolean delete(final FireStationAdminDTO dto);

}
