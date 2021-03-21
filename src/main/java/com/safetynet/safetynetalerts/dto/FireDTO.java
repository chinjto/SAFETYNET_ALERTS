package com.safetynet.safetynetalerts.dto;

import com.safetynet.safetynetalerts.entity.Person;
import lombok.Data;

import java.util.List;

/**
 * Utilise cette url : http://localhost:8080/fire?address=<address>
 * <p>
 * Cette url doit retourner la liste des habitants vivant à l’adresse donnée ainsi que le numéro de la caserne
 * de pompiers la desservant. La liste doit inclure le nom, le numéro de téléphone, l'âge et les antécédents
 * médicaux (médicaments, posologie et allergies) de chaque personne.
 **/

@Data
public class FireDTO {

    private List<Person> address;

    private Integer numberStation;

}
