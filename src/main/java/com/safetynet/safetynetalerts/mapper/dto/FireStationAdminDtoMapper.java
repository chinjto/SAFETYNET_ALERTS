package com.safetynet.safetynetalerts.mapper.dto;

import com.safetynet.safetynetalerts.dto.admin.FireStationAdminDTO;
import com.safetynet.safetynetalerts.dto.unrestricted.CommunityEmailDTO;
import com.safetynet.safetynetalerts.io.entity.FireStationEntity;
import com.safetynet.safetynetalerts.io.entity.PersonEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
    public Iterable<FireStationEntity> dtoToEntity(Iterable<FireStationAdminDTO> dtoList) {
        return dtoList == null ? null : StreamSupport.stream(dtoList.spliterator(), false)
                .map(dto -> this.dtoToEntity(dto))
                .collect(Collectors.toList());
    }

    @Override
    public FireStationAdminDTO entityToDto(FireStationEntity entity) {
        return new FireStationAdminDTO(
                entity.getAddress(),
                entity.getStation()
        );
    }

    @Override
    public Iterable<FireStationAdminDTO> entityToDto(Iterable<FireStationEntity> entityList) {
        return entityList == null ? null : StreamSupport.stream(entityList.spliterator(), false)
                .map(entity -> this.entityToDto(entity))
                .collect(Collectors.toList());
    }

}
