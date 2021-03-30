package com.safetynet.safetynetalerts.poc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.safetynet.safetynetalerts.entity.InputDataEntity;
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
        final File inFile = Paths.get("src/main/resources/data.json").toFile();
        final InputDataEntity data = objectMapper.readValue(inFile, InputDataEntity.class);
        System.out.println(data);

        // test sur l'écriture
        final File outFile = Paths.get("src/test/resources/data2.json").toFile();
        objectMapper.writeValue(outFile, data);
        //*/

        // fin du programme
        System.exit(0);

    }

}
