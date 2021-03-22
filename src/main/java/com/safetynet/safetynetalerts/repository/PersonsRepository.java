package com.safetynet.safetynetalerts.repository;

import com.safetynet.safetynetalerts.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends JpaRepository<PersonEntity,String> {


    

}
