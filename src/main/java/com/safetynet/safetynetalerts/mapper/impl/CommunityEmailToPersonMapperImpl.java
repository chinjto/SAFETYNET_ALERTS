package com.safetynet.safetynetalerts.mapper.impl;

import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.Person;
import com.safetynet.safetynetalerts.mapper.CommunityEmailToPersonMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class CommunityEmailToPersonMapperImpl implements CommunityEmailToPersonMapper {

    @Override
    public Iterable<CommunityEmailDTO> entityToDto(Iterable<Person> personList) {
        return personList == null ? null : StreamSupport.stream(personList.spliterator(), false)
                .map(entity -> this.entityToDto(entity))
                .collect(Collectors.toList());
    }

    @Override
    public CommunityEmailDTO entityToDto(Person entity) {
        CommunityEmailDTO dto = new CommunityEmailDTO();
        dto.setEmail(entity.getEmail());
        return dto;
    }

}
