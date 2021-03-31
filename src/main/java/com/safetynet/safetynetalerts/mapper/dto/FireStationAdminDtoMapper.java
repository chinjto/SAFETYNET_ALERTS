package com.safetynet.safetynetalerts.mapper.dto;

import com.safetynet.safetynetalerts.dto.admin.FireStationAdminDTO;
import com.safetynet.safetynetalerts.io.entity.FireStationEntity;
import org.springframework.stereotype.Service;

@Service
public class FireStationAdminDtoMapper implements DtoMapper<FireStationAdminDTO, FireStationEntity> {

    @Override
    public FireStationEntity dtoToEntity(FireStationAdminDTO dto) {
        return new FireStationEntity(
                dto.getAddress(),
                dto.getStation()
        );
    }

    @Override
    public FireStationAdminDTO entityToDto(FireStationEntity entity) {
        return new FireStationAdminDTO(
                entity.getAddress(),
                entity.getStation()
        );
    }

}
