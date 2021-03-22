package com.safetynet.safetynetalerts.dto;

import com.safetynet.safetynetalerts.entity.PersonEntity;
import lombok.Data;

import java.util.List;

/**
 * Utilise cette url : http://localhost:8080/flood/stations?stations=<a list of station_numbers>
 * <p>
 * Cette url doit retourner une liste de tous les foyers desservis par la caserne. Cette liste doit regrouper les
 * personnes par adresse. Elle doit aussi inclure le nom, le numéro de téléphone et l'âge des habitants, et
 * faire figurer leurs antécédents médicaux (médicaments, posologie et allergies) à côté de chaque nom.
 **/
@Data
public class FloodStationsDTO {

    private List<PersonEntity> address;

}
