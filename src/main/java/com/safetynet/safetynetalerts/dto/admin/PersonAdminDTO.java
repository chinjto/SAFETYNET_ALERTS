package com.safetynet.safetynetalerts.dto.admin;

import com.safetynet.safetynetalerts.entity.PersonEntity;
import com.safetynet.safetynetalerts.service.admin.PersonServiceAdmin;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class PersonAdminDTO {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String city;

    private String zip;

    private String phone;

    private String email;

}
