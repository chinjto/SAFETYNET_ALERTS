package com.safetynet.safetynetalerts.poc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.safetynet.safetynetalerts.entity.DataSourceEntity;
import com.safetynet.safetynetalerts.service.io.DataSourceIOService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * POC pour l'utilisation de Jackson pour lire / écrire un fichier json.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JacksonApplicationPOC {

    @Autowired
    DataSourceIOService dataSourceIOService;

    @Test
    public void readAndWriteTest() throws Exception {

        // initialisation du mapper json
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        // test sur la lecture
        final DataSourceEntity dataSource = dataSourceIOService.pull();

        Assert.assertEquals(23, dataSource.getPersons().size());
        Assert.assertEquals(13, dataSource.getFirestations().size());
        Assert.assertEquals(23, dataSource.getMedicalrecords().size());

        // test sur l'écriture
        dataSourceIOService.push(dataSource);

    }

}
