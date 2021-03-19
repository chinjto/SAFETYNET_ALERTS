package com.safetynet.safetynetalerts.mapper.impl;

import com.safetynet.safetynetalerts.dto.PersonInfoDTO;
import com.safetynet.safetynetalerts.entity.Person;
import com.safetynet.safetynetalerts.mapper.PersonInfoDtoToPersonMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class PersonInfoToPersonMapperImp implements PersonInfoDtoToPersonMapper {

    @Override
    public Iterable<PersonInfoDTO> entityToDto(final Iterable<Person> entityList) {
        return entityList == null ? null : StreamSupport.stream(entityList.spliterator(), false)
                .map(entity -> this.entityToDto(entity))
                .collect(Collectors.toList());
    }

    @Override
    public PersonInfoDTO entityToDto(final Person entity) {
        return null;
    }

}
