package com.safetynet.safetynetalerts.controller.unrestricted;

import com.safetynet.safetynetalerts.dto.unrestricted.PhoneAlertDTO;
import com.safetynet.safetynetalerts.service.process.unrestricted.PhoneAlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/phonealert")
public class PhoneAlertController {

    private PhoneAlertService service;

    public PhoneAlertController( PhoneAlertService service){
        this.service = service;
    }

    @GetMapping
    public List<PhoneAlertDTO> getStation(@RequestParam String phone){
        // TODO
        // return service.getStation(phone);
        return null;
    }
}
