package com.safetynet.safetynetalerts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FireStationController {

    @GetMapping("/firestations/adress")
    public String adress(){
        return adress();
    }

    @GetMapping("/firestations/station_number")
    public int stationNumber(){
        return stationNumber();
    }
}
