package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonAdminController {

    @PostMapping
    public Person createPerson(@RequestBody Person item) {
        // TODO
        return item;
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person item) {
        // TODO
        return item;
    }

    @DeleteMapping("/{id}")
    public Boolean deletePerson(@PathVariable Long id) {
        // TODO
        return false;
    }

}
