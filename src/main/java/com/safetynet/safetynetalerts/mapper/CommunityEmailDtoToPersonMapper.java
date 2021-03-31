package com.safetynet.safetynetalerts.mapper;

import com.safetynet.safetynetalerts.dto.unrestricted.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.PersonEntity;

public interface CommunityEmailDtoToPersonMapper {

    Iterable<CommunityEmailDTO> entityToDto(Iterable<PersonEntity> personList);

    CommunityEmailDTO entityToDto(PersonEntity entity);

}
