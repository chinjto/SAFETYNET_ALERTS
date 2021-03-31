package com.safetynet.safetynetalerts.service.process.admin;

import com.safetynet.safetynetalerts.dto.admin.FireStationAdminDTO;
import com.safetynet.safetynetalerts.io.entity.FireStationEntity;
import com.safetynet.safetynetalerts.mapper.dto.DtoMapper;
import com.safetynet.safetynetalerts.service.io.entity.EntityService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Services for {@link FireStationAdminDTO fire stations} ressources.
 */
@Service
@RequiredArgsConstructor
public class FireStationServiceAdmin {

    @NonNull
    private EntityService<FireStationEntity> entityService;

    @NonNull
    private DtoMapper<FireStationAdminDTO, FireStationEntity> mapper;

    /**
     * Service for {@link FireStationAdminDTO fire stations} creations.
     *
     * @param dto the {@link FireStationAdminDTO fire station} to create.
     * @return true if process succeeded, else false
     */
    public Boolean create(final FireStationAdminDTO dto) throws IOException {
        final FireStationEntity entity = mapper.dtoToEntity(dto);
        return entityService.create(entity);
    }

    /**
     * Service for {@link FireStationAdminDTO fire stations} updates.
     *
     * @param dto the {@link FireStationAdminDTO fire station} to update.
     * @return true if process succeeded, else false
     */
    public Boolean update(final FireStationAdminDTO dto) throws IOException {
        final FireStationEntity entity = mapper.dtoToEntity(dto);
        return entityService.update(entity);
    }

    /**
     * Service for {@link FireStationAdminDTO fire stations} deletes.
     *
     * @param dto the {@link FireStationAdminDTO fire station} to delete.
     * @return true if process succeeded, else false
     */
    public Boolean delete(final FireStationAdminDTO dto) throws IOException {
        final FireStationEntity entity = mapper.dtoToEntity(dto);
        return entityService.delete(entity);
    }

}
