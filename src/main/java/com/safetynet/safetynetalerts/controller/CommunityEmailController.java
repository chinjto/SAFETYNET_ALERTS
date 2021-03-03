package com.safetynet.safetynetalerts.controller;


import com.safetynet.safetynetalerts.dto.CommunityEmailDTO;
import com.safetynet.safetynetalerts.service.CommunityEmailService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/communityEmail")
public class CommunityEmailController {


    private CommunityEmailService service;

    public CommunityEmailController( CommunityEmailService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommunityEmailDTO> getAll(@RequestParam(required = false) String city){
        return service.getAll(city);
    }

}
