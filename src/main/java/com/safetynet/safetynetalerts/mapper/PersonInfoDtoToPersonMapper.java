package com.safetynet.safetynetalerts.mapper;

import com.safetynet.safetynetalerts.dto.PersonInfoDTO;
import com.safetynet.safetynetalerts.entity.Person;

public interface PersonInfoDtoToPersonMapper {

    Iterable<PersonInfoDTO> entityToDto(Iterable<Person> personList);

    PersonInfoDTO entityToDto(Person entity);

}
