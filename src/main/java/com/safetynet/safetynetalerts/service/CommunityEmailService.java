package com.safetynet.safetynetalerts.service;

import com.safetynet.safetynetalerts.dao.DataDAO;
import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.PersonEntity;
import com.safetynet.safetynetalerts.mapper.CommunityEmailDtoToPersonMapper;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class CommunityEmailService {

    @NonNull
    private final CommunityEmailDtoToPersonMapper mapper;

    @NonNull
    private final DataDAO dao;

    public Iterable<CommunityEmailDTO> getAll(String city) throws IOException {
        Iterable<PersonEntity> personList = dao.getPersons();
        Iterable<CommunityEmailDTO> communityEmailDTOList = mapper.entityToDto(personList);
        return communityEmailDTOList;
    }

}
