package com.safetynet.safetynetalerts.service;


import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.entity.Person;
import com.safetynet.safetynetalerts.mapper.CommunityEmailToPersonMapper;
import com.safetynet.safetynetalerts.mapper.impl.CommunityEmailToPersonMapperImpl;
import com.safetynet.safetynetalerts.repository.PersonRepository;
import com.safetynet.safetynetalerts.repository.impl.PersonRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityEmailService {

    private PersonRepository repository;
    private CommunityEmailToPersonMapper mapper;


    public CommunityEmailService(){
        // FIXME à améliorer en passant par des beans.
        repository = new PersonRepositoryImpl();
        mapper = new CommunityEmailToPersonMapperImpl();
    }

    public List<CommunityEmailDTO> getAll(String city) {
        List<Person> personList = repository.findAll();
        List<CommunityEmailDTO> communityEmailDTOList = mapper.entityToDto(personList);
        return communityEmailDTOList;
    }

}
