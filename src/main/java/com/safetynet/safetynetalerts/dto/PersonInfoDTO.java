package com.safetynet.safetynetalerts.dto;

import lombok.Data;

/**
 * Utilise cette url : http://localhost:8080/personInfo?firstName=<firstName>&lastName=<lastName>
 *
 * Cette url doit retourner le nom, l'adresse, l'âge, l'adresse mail et les antécédents médicaux (médicaments,
 * posologie, allergies) de chaque habitant. Si plusieurs personnes portent le même nom, elles doivent
 * toutes apparaître
 **/

@Data
public class PersonInfoDTO {

    private String firstName;
    private String lastname;
    private String address;
    private int age;
    private String email;
    private String medications;
    private String allergies;
}
