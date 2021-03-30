package com.safetynet.safetynetalerts.repository;

import com.safetynet.safetynetalerts.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;
import java.util.OptionalLong;

@Repository
public interface PersonsRepository extends JpaRepository<PersonEntity, Long> {

    OptionalLong findAll(Long id);

}
