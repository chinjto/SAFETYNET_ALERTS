package com.safetynet.safetynetalerts.dto;

import lombok.Data;

/**
 * Utilise cette url : http://localhost:8080/phoneAlert?firestation=<firestation_number>
 *
 *Cette url doit retourner une liste des numéros de téléphone des résidents desservis par la caserne de
 * pompiers. Nous l'utiliserons pour envoyer des messages texte d'urgence à des foyers spécifiques.
 **/

@Data
public class PhoneAlertDTO {

    private List<String> phone;
}
