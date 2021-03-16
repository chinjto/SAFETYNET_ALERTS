package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.entity.FireStation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/firestation")
public class FireStationAdminController {

    @PostMapping
    public FireStation createFireStation(@RequestBody FireStation fireStation){
        // TODO
        return fireStation;
    }

    @PutMapping
    public FireStation updateFireStation(@RequestParam String adress, @RequestBody FireStation fireStation){
        // TODO
        return fireStation;
    }

    @DeleteMapping
    public Boolean deleteFireStationByAdress(@RequestParam String adress) {
        // TODO
        return false;
    }

}
