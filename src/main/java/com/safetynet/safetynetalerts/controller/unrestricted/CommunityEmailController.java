package com.safetynet.safetynetalerts.controller.unrestricted;

import com.safetynet.safetynetalerts.dto.unrestricted.CommunityEmailDTO;
import com.safetynet.safetynetalerts.service.process.unrestricted.CommunityEmailService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/communityEmail")
public class CommunityEmailController {

    private CommunityEmailService service;

    public CommunityEmailController(CommunityEmailService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<CommunityEmailDTO> getAll(@RequestBody(required = false) CommunityEmailDTO filter) throws IOException {
        return service.readAll(filter);
    }

}
