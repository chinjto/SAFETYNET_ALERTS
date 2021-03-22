package com.safetynet.safetynetalerts.dto.admin;

import com.safetynet.safetynetalerts.entity.PersonEntity;
import com.safetynet.safetynetalerts.service.admin.PersonServiceAdmin;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

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
