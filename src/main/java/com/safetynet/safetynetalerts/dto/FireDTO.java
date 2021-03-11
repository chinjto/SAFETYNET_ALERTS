package com.safetynet.safetynetalerts.dto;

import lombok.Data;

/**
 * Utilise cette url : http://localhost:8080/fire?address=<address>
 *
 * Cette url doit retourner la liste des habitants vivant à l’adresse donnée ainsi que le numéro de la caserne
 * de pompiers la desservant. La liste doit inclure le nom, le numéro de téléphone, l'âge et les antécédents
 * médicaux (médicaments, posologie et allergies) de chaque personne.
 **/

@Data
public class FireDTO {


    private String lastname;
    private String age;
    private String phone;
    private String medications;
    private String allergies;
}
