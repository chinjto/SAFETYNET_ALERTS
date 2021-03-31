package com.safetynet.safetynetalerts.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "safetynet.datasource")
public class DataSourceProperties {

    private String in;

    private String out;

}
