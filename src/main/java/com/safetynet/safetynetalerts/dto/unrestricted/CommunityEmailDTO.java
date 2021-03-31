package com.safetynet.safetynetalerts.dto.unrestricted;

import lombok.Data;

/**
 * Utilise cette url : http://localhost:8080/communityEmail?city=<city>
 *
 * Cette url doit retourner les adresses mail de tous les habitants de la ville.
 **/

@Data
public class CommunityEmailDTO {

    private String email;

}
