package com.safetynet.safetynetalerts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonsController {

    @GetMapping("/persons/firstname")
    public String firstname(){
        return firstname();
    }

    @GetMapping("/persons/lastname")
    public String lastName(){
        return lastName();
    }

    @GetMapping("/persons/adress")
    public String adress(){
        return adress();
    }

    @GetMapping("/persons/city")
    public String city(){
        return city();
    }

    @GetMapping("/persons/zip")
    public int zip(){
        return zip();
    }

    @GetMapping("/persons/phone")
    public String phone(){
        return phone();
    }

    @GetMapping("/persons/email")
    public String email(){
        return email();
    }
}
