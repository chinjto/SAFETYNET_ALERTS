package com.safetynet.safetynetalerts.mapper.impl;

import com.safetynet.safetynetalerts.dto.unrestricted.PersonInfoDTO;
import com.safetynet.safetynetalerts.io.entity.PersonEntity;
import com.safetynet.safetynetalerts.mapper.PersonInfoDtoToPersonMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class PersonInfoToPersonMapperImp implements PersonInfoDtoToPersonMapper {

    @Override
    public Iterable<PersonInfoDTO> entityToDto(final Iterable<PersonEntity> entityList) {
        return entityList == null ? null : StreamSupport.stream(entityList.spliterator(), false)
                .map(entity -> this.entityToDto(entity))
                .collect(Collectors.toList());
    }

    @Override
    public PersonInfoDTO entityToDto(final PersonEntity entity) {
        PersonInfoDTO dto = new PersonInfoDTO();
        dto.setLastname(entity.getLastName());
        dto.setEmail(entity.getEmail());
        dto.setAddress(entity.getAddress());
        // FIXME problème de cast lors du mapping
        //dto.setAge(entity.getMedicalRecords().get(0).getBirthdate());
        // FIXME manque la donnée à enregistrer dans le DTO
        //dto.setMedicalRecords();
        return dto;
    }

}
