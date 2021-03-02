package com.safetynet.safetynetalerts.mapper;

import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public interface CommunityEmailToPersonMapper {

    List<CommunityEmailDTO> entityToDto(List<Person> personList);

    CommunityEmailDTO entityToDto(Person entity);

}
