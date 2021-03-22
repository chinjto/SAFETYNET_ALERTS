package com.safetynet.safetynetalerts.service.admin;

import com.safetynet.safetynetalerts.entity.FireStationEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FireStationServiceAdmin {

    public FireStationServiceAdmin create(final FireStationEntity fireStation) {
        return null;
    }

    public static Iterable<FireStationServiceAdmin> readAll() {
        return null;
    }

    public FireStationServiceAdmin update(final FireStationEntity fireStation) {
        return null;
    }

    public Boolean delete(final String address) {
        return null;
    }

}
