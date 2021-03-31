package com.safetynet.safetynetalerts.mapper.dto;

import com.safetynet.safetynetalerts.dto.unrestricted.CommunityEmailDTO;
import com.safetynet.safetynetalerts.io.entity.PersonEntity;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class CommunityEmailDtoToPersonMapperImpl implements DtoMapper<CommunityEmailDTO, PersonEntity> {

    @Override
    public PersonEntity dtoToEntity(CommunityEmailDTO dto) {
        PersonEntity entity = new PersonEntity();
        entity.setEmail(dto.getEmail());
        return entity;
    }

    @Override
    public Iterable<PersonEntity> dtoToEntity(Iterable<CommunityEmailDTO> dtoList) {
        return dtoList == null ? null : StreamSupport.stream(dtoList.spliterator(), false)
                .map(dto -> this.dtoToEntity(dto))
                .collect(Collectors.toList());
    }

    @Override
    public CommunityEmailDTO entityToDto(PersonEntity entity) {
        CommunityEmailDTO dto = new CommunityEmailDTO();
        dto.setEmail(entity.getEmail());
        return dto;
    }

    @Override
    public Iterable<CommunityEmailDTO> entityToDto(Iterable<PersonEntity> entityList) {
        return entityList == null ? null : StreamSupport.stream(entityList.spliterator(), false)
                .map(entity -> this.entityToDto(entity))
                .collect(Collectors.toList());
    }

}
