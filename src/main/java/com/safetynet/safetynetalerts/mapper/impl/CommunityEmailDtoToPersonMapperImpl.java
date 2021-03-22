package com.safetynet.safetynetalerts.mapper.impl;

import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.PersonEntity;
import com.safetynet.safetynetalerts.mapper.CommunityEmailDtoToPersonMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class CommunityEmailDtoToPersonMapperImpl implements CommunityEmailDtoToPersonMapper {

    @Override
    public Iterable<CommunityEmailDTO> entityToDto(Iterable<PersonEntity> entityList) {
        return entityList == null ? null : StreamSupport.stream(entityList.spliterator(), false)
                .map(entity -> this.entityToDto(entity))
                .collect(Collectors.toList());
    }

    @Override
    public CommunityEmailDTO entityToDto(PersonEntity entity) {
        CommunityEmailDTO dto = new CommunityEmailDTO();
        dto.setEmail(entity.getEmail());
        return dto;
    }

}
