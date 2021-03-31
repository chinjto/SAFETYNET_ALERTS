package com.safetynet.safetynetalerts.controller.unrestricted;

import com.safetynet.safetynetalerts.service.process.unrestricted.ChildAlertService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/childalert")
public class ChildAlertController {
    // TODO
    @NonNull
    private ChildAlertService service;

    //List<ChildAlertDTO>
}
