package com.safetynet.safetynetalerts.service;


import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.Person;
import com.safetynet.safetynetalerts.mapper.CommunityEmailToPersonMapper;
import com.safetynet.safetynetalerts.mapper.impl.CommunityEmailToPersonMapperImpl;
import com.safetynet.safetynetalerts.repository.PersonRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunityEmailService {

    @NonNull
    private PersonRepository repository;

    @NonNull
    private CommunityEmailToPersonMapper mapper;

    public Iterable<CommunityEmailDTO> getAll(String city) {
        Iterable<Person> personList = repository.findAll();
        Iterable<CommunityEmailDTO> communityEmailDTOList = mapper.entityToDto(personList);
        return communityEmailDTOList;
    }

}
