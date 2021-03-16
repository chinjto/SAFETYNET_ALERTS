package com.safetynet.safetynetalerts.controller.admin;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonAdminControllerTest {

    @Autowired
    private PersonAdminController controller;

    @Test
    public void controllerInitializedCorrectly(){
        assertNotNull(controller);
    }

}