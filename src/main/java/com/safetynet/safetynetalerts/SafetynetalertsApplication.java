package com.safetynet.safetynetalerts;

import com.safetynet.safetynetalerts.property.DataSourceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Adresse fichier d'entrée : https://s3-eu-west-1.amazonaws.com/course.oc-static.com/projects/DA+Java+EN/P5+/data.json
 */
@SpringBootApplication
public class SafetynetalertsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SafetynetalertsApplication.class, args);
    }

}


