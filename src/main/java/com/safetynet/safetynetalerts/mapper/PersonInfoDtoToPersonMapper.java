package com.safetynet.safetynetalerts.mapper;

import com.safetynet.safetynetalerts.dto.PersonInfoDTO;
import com.safetynet.safetynetalerts.entity.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public interface PersonInfoDtoToPersonMapper {

    Iterable<PersonInfoDTO> entityToDto(Iterable<PersonEntity> personList);

    PersonInfoDTO entityToDto(PersonEntity entity);

}
