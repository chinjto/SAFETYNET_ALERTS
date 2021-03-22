package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.dto.admin.PersonAdminDTO;
import com.safetynet.safetynetalerts.service.admin.PersonServiceAdmin;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonAdminController {

    @NonNull
    private PersonServiceAdmin service;

    @GetMapping()
    public Iterable<PersonAdminDTO> readAllPerson() {
        return service.readAll();
    }

    @PostMapping()
    public PersonAdminDTO createPerson(@RequestBody PersonAdminDTO item) {
        return service.create(item);
    }

    @PutMapping("/{id}")
    public PersonAdminDTO updatePerson(@PathVariable Long id, @RequestBody PersonAdminDTO item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public Boolean deletePerson(@PathVariable Long id) {
        return service.delete(id);
    }

}
