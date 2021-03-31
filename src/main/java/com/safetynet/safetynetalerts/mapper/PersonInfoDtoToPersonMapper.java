package com.safetynet.safetynetalerts.mapper;

import com.safetynet.safetynetalerts.dto.unrestricted.PersonInfoDTO;
import com.safetynet.safetynetalerts.io.entity.PersonEntity;

public interface PersonInfoDtoToPersonMapper {

    Iterable<PersonInfoDTO> entityToDto(Iterable<PersonEntity> personList);

    PersonInfoDTO entityToDto(PersonEntity entity);

}
