package com.safetynet.safetynetalerts.repository;

import com.safetynet.safetynetalerts.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface PersonsRepository extends CrudRepository<PersonEntity, Id> {


    

}
