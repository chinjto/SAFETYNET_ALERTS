package com.safetynet.safetynetalerts.mapper.impl;

import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.Person;
import com.safetynet.safetynetalerts.mapper.CommunityEmailToPersonMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CommunityEmailToPersonMapperImpl implements CommunityEmailToPersonMapper {

    @Override
    public List<CommunityEmailDTO> entityToDto(List<Person> personList) {
        return personList == null ? null : personList.stream().map(entity -> this.entityToDto(entity)).collect(Collectors.toList());
    }

    @Override
    public CommunityEmailDTO entityToDto(Person entity) {
        CommunityEmailDTO dto = new CommunityEmailDTO();
        dto.setEmail(entity.getEmail());
        return dto;
    }

}
