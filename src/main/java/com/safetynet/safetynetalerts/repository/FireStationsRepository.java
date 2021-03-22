package com.safetynet.safetynetalerts.repository;

import com.safetynet.safetynetalerts.entity.FireStationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FireStationsRepository extends JpaRepository<FireStationEntity, String> {

}
