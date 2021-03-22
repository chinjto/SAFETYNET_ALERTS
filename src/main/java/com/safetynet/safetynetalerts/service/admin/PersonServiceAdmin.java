package com.safetynet.safetynetalerts.service.admin;

import com.safetynet.safetynetalerts.dto.admin.PersonAdminDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceAdmin {

    public Iterable<PersonAdminDTO> readAll() {
        return null;
    }

    public PersonAdminDTO create(final PersonAdminDTO item) {
        return null;
    }

    public PersonAdminDTO update(final Long id, final PersonAdminDTO item) {
        return null;
    }

    public Boolean delete(final Long id) {
        return null;
    }

}
