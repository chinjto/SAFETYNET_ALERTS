package com.safetynet.safetynetalerts.dto.admin;

import com.safetynet.safetynetalerts.io.entity.PersonEntity;
import com.safetynet.safetynetalerts.service.process.admin.PersonServiceAdmin;
import lombok.Data;

@Data
public class PersonAdminDTO {

    private String firstName;

    private String lastName;

    private String address;

    private String city;

    private String zip;

    private String phone;

    private String email;

    public static PersonServiceAdmin create(final PersonEntity item) {
        return null;
    }

    public static PersonServiceAdmin update() {
        return null;
    }

}
