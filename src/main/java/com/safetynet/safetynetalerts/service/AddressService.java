package com.safetynet.safetynetalerts.service;


import com.safetynet.safetynetalerts.entity.Person;
import com.safetynet.safetynetalerts.repository.PersonRepository;
import com.safetynet.safetynetalerts.repository.impl.PersonRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private PersonRepository repository;
    private AddressToMapper mapper;


    public AddressService() {
        // FIXME à améliorer en passant par des beans.
        repository = new PersonRepositoryImpl();
        mapper = new AddressToPersonMapperImpl();
    }

    // TODO Cette url doit retourner une liste d'enfants (tout individu âgé de 18 ans ou moins) habitant à cette adresse
    public List<AddressDTO> getAll(String city) {
        List<Person> personList = repository.findAll();
        List<> =;
        return null;
    }
}
