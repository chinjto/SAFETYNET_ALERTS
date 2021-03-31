package com.safetynet.safetynetalerts.dto.unrestricted;

import com.safetynet.safetynetalerts.entity.PersonEntity;
import lombok.Data;

import java.util.List;

/**
 * Utilise cette url : http://localhost:8080/firestation?stationNumber=<station_number>
 * <p>
 * Cette url doit retourner une liste des personnes couvertes par la caserne de pompiers correspondante.
 * Donc, si le numéro de station = 1, elle doit renvoyer les habitants couverts par la station numéro 1. La liste
 * doit inclure les informations spécifiques suivantes : prénom, nom, adresse, numéro de téléphone. De plus,
 * elle doit fournir un décompte du nombre d'adultes et du nombre d'enfants (tout individu âgé de 18 ans ou
 * moins) dans la zone desservie.
 **/

@Data
public class FireStationDTO {

    private List<PersonEntity> persons;

    private Integer adultQuantity;

    private Integer childQuantity;

}
