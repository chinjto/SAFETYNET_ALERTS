package com.safetynet.safetynetalerts.dto;

import lombok.Data;

/**
 * Utilise cette url : http://localhost:8080/flood/stations?stations=<a list of station_numbers>
 *
 * Cette url doit retourner une liste de tous les foyers desservis par la caserne. Cette liste doit regrouper les
 * personnes par adresse. Elle doit aussi inclure le nom, le numéro de téléphone et l'âge des habitants, et
 * faire figurer leurs antécédents médicaux (médicaments, posologie et allergies) à côté de chaque nom.
 **/
@Data
public class FloodStationsDTO {

    private String lastname;
    private String phone;
    private String age;
    private String medications;
    private String allergies;

}
