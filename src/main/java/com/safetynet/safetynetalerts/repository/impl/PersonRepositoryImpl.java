package com.safetynet.safetynetalerts.repository.impl;

import com.safetynet.safetynetalerts.entity.Person;
import com.safetynet.safetynetalerts.reader.DataFileReader;
import com.safetynet.safetynetalerts.reader.impl.DataFileReaderImpl;
import com.safetynet.safetynetalerts.repository.PersonRepository;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {

    private DataFileReader reader;

    public PersonRepositoryImpl(){
        // FIXME
        reader = new DataFileReaderImpl();
    }

    @Override
    public List<Person> findAll() {
        // TODO
        return null;
    }

}
