package com.safetynet.safetynetalerts.dto;

import com.safetynet.safetynetalerts.entity.Person;
import lombok.Data;

import java.util.List;

/**
 * Utilise cette url : http://localhost:8080/childAlert?address=<address>
 * <p>
 * Cette url doit retourner une liste d'enfants (tout individu âgé de 18 ans ou moins) habitant à cette adresse.
 * La liste doit comprendre le prénom et le nom de famille de chaque enfant, son âge et une liste des autres
 * membres du foyer. S'il n'y a pas d'enfant, cette url peut renvoyer une chaîne vide.
 **/

@Data
public class ChildAlertDTO {

    private List<Person> childrens;

    private String address;

}
