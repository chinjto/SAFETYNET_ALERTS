package com.safetynet.safetynetalerts.dto.admin;

import com.safetynet.safetynetalerts.entity.FireStationEntity;
import com.safetynet.safetynetalerts.service.admin.FireStationServiceAdmin;
import lombok.Data;

@Data
public class FireStationAdminDTO {

    private String address;

    private String station;

    public static Iterable<FireStationServiceAdmin> readAll() {
        return null;
    }

    public static FireStationServiceAdmin create(final FireStationAdminDTO fireStation) {
        return null;
    }

    public static FireStationServiceAdmin update(final FireStationAdminDTO fireStation) {
        return null;
    }

    public static Boolean delete(final String address) {
        return null;
    }

}
