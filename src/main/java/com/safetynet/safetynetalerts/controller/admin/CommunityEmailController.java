package com.safetynet.safetynetalerts.controller.admin;


import com.safetynet.safetynetalerts.entity.CommunityEmail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/communytyEmail")
public class CommunityEmailController {

    @GetMapping
    public CommunityEmail communityEmail(@RequestBody CommunityEmail communityEmail){
        // TODO
        return communityEmail;
    }
}
