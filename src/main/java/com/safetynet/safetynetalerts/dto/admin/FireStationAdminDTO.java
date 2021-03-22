package com.safetynet.safetynetalerts.dto.admin;

import com.safetynet.safetynetalerts.service.admin.FireStationServiceAdmin;
import lombok.Data;

@Data
public class FireStationAdminDTO {

    private String address;

    private String station;

    public static Iterable<FireStationServiceAdmin> readAll() {
        return null;
    }

    public static FireStationAdminDTO create(final FireStationAdminDTO fireStation) {
        return null;
    }

    public static FireStationAdminDTO update(final String address, final FireStationAdminDTO fireStation) {
        return null;
    }

    public static Boolean delete(final String address) {
        return null;
    }

}
