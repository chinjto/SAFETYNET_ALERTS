package com.safetynet.safetynetalerts.repository;

import com.safetynet.safetynetalerts.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
