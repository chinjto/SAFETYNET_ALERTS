package com.safetynet.safetynetalerts.dao;

import com.safetynet.safetynetalerts.entity.InputData;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class DataDAOTest {

    private static final Logger log = (Logger) LoggerFactory.getLogger(DataDAOTest.class);

    @Mock
    InputData inputData;

    @Transactional
    public void getAllOutput() {

        assertThat(inputData.getPersons());
    }

}