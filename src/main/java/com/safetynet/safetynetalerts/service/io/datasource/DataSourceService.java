package com.safetynet.safetynetalerts.service.io.datasource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.safetynet.safetynetalerts.io.datasource.DataSource;
import com.safetynet.safetynetalerts.property.DataSourceProperties;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Services for {@link DataSource data source}.
 */
@Service
@RequiredArgsConstructor
public class DataSourceService {

    @NonNull
    DataSourceProperties dataSourceProperties;

    public DataSource pull() throws IOException {

        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        final File inFile = Paths.get(dataSourceProperties.getIn()).toFile();
        final DataSource dataSource = objectMapper.readValue(inFile, DataSource.class);
        return dataSource;

    }

    public void push(DataSource dataSource) throws IOException {

        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        final File outFile = Paths.get(dataSourceProperties.getOut()).toFile();
        objectMapper.writeValue(outFile, dataSource);

    }

}
