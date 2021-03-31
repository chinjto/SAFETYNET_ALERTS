package com.safetynet.safetynetalerts.controller.unrestricted;

import com.safetynet.safetynetalerts.dto.unrestricted.CommunityEmailDTO;
import com.safetynet.safetynetalerts.service.process.unrestricted.CommunityEmailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/communityEmail")
public class CommunityEmailController {

    private CommunityEmailService service;

    public CommunityEmailController(CommunityEmailService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<CommunityEmailDTO> getAll(@RequestParam(required = false) String city) throws IOException {
        return service.getAll(city);
    }

}
