package com.safetynet.safetynetalerts.service;

import com.safetynet.safetynetalerts.dao.DataDAO;
import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.Person;
import com.safetynet.safetynetalerts.mapper.CommunityEmailToPersonMapper;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class CommunityEmailService {

    @NonNull
    private final CommunityEmailToPersonMapper mapper;

    @NonNull
    private DataDAO dao;

    public Iterable<CommunityEmailDTO> getAll(String city) throws IOException {
        Iterable<Person> personList = dao.getPersons();
        Iterable<CommunityEmailDTO> communityEmailDTOList = mapper.entityToDto(personList);
        return communityEmailDTOList;
    }

}
