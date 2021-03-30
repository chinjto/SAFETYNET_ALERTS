package com.safetynet.safetynetalerts.poc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.safetynet.safetynetalerts.entity.FireStationEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.nio.file.Paths;

/**
 * POC pour l'utilisation de Jackson pour lire / écrire un fichier json.
 */
@SpringBootApplication
public class JacksonApplicationPOC implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JacksonApplicationPOC.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // initialisation du mapper json
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        // test sur la lecture
        final File inFile = Paths.get("src/test/resources/firestation.json").toFile();
        final FireStationEntity storedFireStation = objectMapper.readValue(inFile, FireStationEntity.class);
        System.out.println(storedFireStation);

        // test sur l'écriture
        final FireStationEntity newFireStation = new FireStationEntity(
                "123 Test St",
                "3"
        );
        final File outFile = Paths.get("src/test/resources/firestation2.json").toFile();
        objectMapper.writeValue(outFile, newFireStation);

        // fin du programme
        System.exit(0);

    }

}
