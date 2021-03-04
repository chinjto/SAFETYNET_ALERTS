package com.safetynet.safetynetalerts.controller;

import com.safetynet.safetynetalerts.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {

    private AddressService service ;

    public AddressController(AdressService service) {
    }
    @GetMapping
    public List<> getAll(@RequestParam){
        return service.getAll(city);
    }
}
