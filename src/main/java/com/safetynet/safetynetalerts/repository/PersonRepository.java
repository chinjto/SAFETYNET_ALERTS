package com.safetynet.safetynetalerts.repository;

import com.safetynet.safetynetalerts.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
