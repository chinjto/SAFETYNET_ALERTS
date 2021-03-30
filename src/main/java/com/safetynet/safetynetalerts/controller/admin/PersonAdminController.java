package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.dto.admin.PersonAdminDTO;
import com.safetynet.safetynetalerts.entity.PersonEntity;
import com.safetynet.safetynetalerts.mapper.PersonMapper;
import com.safetynet.safetynetalerts.repository.PersonsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonAdminController {

//    @NonNull
//    private PersonServiceAdmin service;
//
//    @GetMapping()
//    public Iterable<PersonAdminDTO> readAllPerson() {
//        return service.readAll();
//    }
//
//    @PostMapping()
//    public PersonAdminDTO createPerson(@RequestBody PersonAdminDTO item) {
//        return service.create(item);
//    }
//
//    @PutMapping("/{id}")
//    public PersonAdminDTO updatePerson(@PathVariable Long id, @RequestBody PersonAdminDTO item) {
//        return service.update(id, item);
//    }
//
//    @DeleteMapping("/{id}")
//    public Boolean deletePerson(@PathVariable Long id) {
//        return service.delete(id);
//    }

    @Autowired
    PersonsRepository personsRepository;

    @Autowired
    PersonMapper personMapper;

    @GetMapping("/findAll")
    public List<PersonAdminDTO> findAll() {

        List<PersonEntity> findAll = personsRepository.findAll();
        return personMapper.entityToDto(findAll);

    }
    @GetMapping("/find/{ID}")
    public PersonAdminDTO getById(@PathVariable(value = "ID") Long id) {

        PersonEntity orElse = personsRepository.findAll(id).orElse();
        return personMapper.entityToDto(orElse);

    }
    @PostMapping("/save")
    public PersonAdminDTO save(@RequestBody PersonAdminDTO personAdminDTO) {

        PersonEntity personEntity = personMapper.dtoToEntity(personAdminDTO);
        personEntity = personsRepository.save(personEntity);
        return personMapper.entityToDto(personEntity);

    }

}
