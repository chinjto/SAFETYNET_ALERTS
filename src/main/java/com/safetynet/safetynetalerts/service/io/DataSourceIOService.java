package com.safetynet.safetynetalerts.service.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.safetynet.safetynetalerts.entity.DataSourceEntity;
import com.safetynet.safetynetalerts.property.DataSourceProperties;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Services for {@link DataSourceEntity data source}.
 */
@Service
@RequiredArgsConstructor
public class DataSourceIOService {

    @NonNull
    DataSourceProperties dataSourceProperties;

    public DataSourceEntity pull() throws IOException {

        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        final File inFile = Paths.get(dataSourceProperties.getIn()).toFile();
        final DataSourceEntity dataSource = objectMapper.readValue(inFile, DataSourceEntity.class);
        return dataSource;

    }

    public void push(DataSourceEntity dataSource) throws IOException {

        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        final File outFile = Paths.get(dataSourceProperties.getOut()).toFile();
        objectMapper.writeValue(outFile, dataSource);

    }

}
