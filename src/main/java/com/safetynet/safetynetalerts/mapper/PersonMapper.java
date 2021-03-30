package com.safetynet.safetynetalerts.mapper;

import com.safetynet.safetynetalerts.dto.admin.PersonAdminDTO;
import com.safetynet.safetynetalerts.entity.PersonEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public PersonAdminDTO entityToDto(PersonEntity personEntity) {

        PersonAdminDTO personAdminDTO = new PersonAdminDTO();
        personAdminDTO.setId(personEntity.getId());
        personAdminDTO.setFirstName(personEntity.getFirstName());
        personAdminDTO.setLastName(personEntity.getLastName());
        personAdminDTO.setAddress(personEntity.getAddress());
        personAdminDTO.setCity(personEntity.getCity());
        personAdminDTO.setZip(personEntity.getZip());
        personAdminDTO.setPhone(personEntity.getPhone());
        personAdminDTO.setEmail(personEntity.getEmail());
        return personAdminDTO;
    }
    public List<PersonAdminDTO> entityToDto(List<PersonEntity> personEntity) {

        return personEntity.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public PersonEntity dtoToEntity(PersonAdminDTO personAdminDTO) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(personAdminDTO.getId());
        personEntity.setFirstName(personAdminDTO.getFirstName());
        personEntity.setLastName(personAdminDTO.getLastName());
        personEntity.setAddress(personAdminDTO.getAddress());
        personEntity.setCity(personAdminDTO.getCity());
        personEntity.setCity(personAdminDTO.getZip());
        personEntity.setPhone(personAdminDTO.getPhone());
        personEntity.setEmail(personAdminDTO.getEmail());
        return personEntity;
    }
    public List<PersonEntity> dtoToEntity(List<PersonAdminDTO> personAdminDTO) {

        return personAdminDTO.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
