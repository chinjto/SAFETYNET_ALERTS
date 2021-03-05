package com.safetynet.safetynetalerts.mapper;

import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.Person;

public interface CommunityEmailToPersonMapper {

    Iterable<CommunityEmailDTO> entityToDto(Iterable<Person> personList);

    CommunityEmailDTO entityToDto(Person entity);

}
