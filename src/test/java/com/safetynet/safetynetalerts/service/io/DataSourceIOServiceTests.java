package com.safetynet.safetynetalerts.service.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.safetynet.safetynetalerts.io.datasource.DataSource;
import com.safetynet.safetynetalerts.service.io.datasource.DataSourceService;
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
public class DataSourceIOServiceTests {

    @Autowired
    DataSourceService dataSourceIOService;

    @Test
    public void readTest() throws Exception {

        // initialisation du mapper json
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        // test sur la lecture
        final DataSource dataSource = dataSourceIOService.pull();

        Assert.assertEquals(23, dataSource.getPersons().size());
        Assert.assertEquals(13, dataSource.getFirestations().size());
        Assert.assertEquals(23, dataSource.getMedicalrecords().size());

    }

    @Test
    public void WriteTest() throws Exception {

        // initialisation du mapper json
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        // test sur la lecture
        final DataSource dataSource = dataSourceIOService.pull();

        // test sur l'écriture
        dataSourceIOService.push(dataSource);

        // TODO check que les données sont bien insérées dans le fichier cible

    }

}
