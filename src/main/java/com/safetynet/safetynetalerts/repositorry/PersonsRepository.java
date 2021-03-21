package com.safetynet.safetynetalerts.repositorry;

import com.safetynet.safetynetalerts.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends JpaRepository<Person,String> {


    

}
