package com.safetynet.safetynetalerts.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonsController {

    @RequestMapping(value = "persons/firstname", method = RequestMethod.GET)
    Person getPersonByFirstname(@PathVariable final String firstname){
        final Person person = new Person();

        return person;


    }





    @GetMapping("/persons/firstname")
    public String firstname(@RequestParam String firstname){
        return firstname();
    }

    @GetMapping("/persons/lastname")
    public String lastName(@RequestParam String lastName){
        return lastName();
    }

    @GetMapping("/persons/adress")
    public String adress(@RequestParam String adress){
        return adress(adress);
    }

    @GetMapping("/persons/city")
    public String city(@RequestParam String city){
        return city();
    }

    @GetMapping("/persons/zip")
    public int zip(@RequestParam int zip){
        return zip();
    }

    @GetMapping("/persons/phone")
    public String phone(@RequestParam String phone){
        return phone();
    }

    @GetMapping("/persons/email")
    public String email(@RequestParam String email){
        return email();
    }
}
