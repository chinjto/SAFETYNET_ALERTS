package com.safetynet.safetynetalerts.repository;

import com.safetynet.safetynetalerts.entity.Person;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface PersonRepository {

    List<Person> findAll();

}
