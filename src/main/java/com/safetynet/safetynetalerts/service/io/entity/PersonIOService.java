package com.safetynet.safetynetalerts.service.io.entity;

import com.safetynet.safetynetalerts.io.datasource.DataSource;
import com.safetynet.safetynetalerts.io.entity.PersonEntity;
import com.safetynet.safetynetalerts.service.io.datasource.DataSourceService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonIOService implements EntityService<PersonEntity> {

    @NonNull
    DataSourceService dataSourceService;

    @Override
    public Boolean create(PersonEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<PersonEntity> list = dataSource.getPersons();
        list.add(entity);
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean update(PersonEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<PersonEntity> list = dataSource.getPersons();
        // TODO find and update into data source
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean delete(PersonEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<PersonEntity> list = dataSource.getPersons();
        // TODO find and delete into data source
        dataSourceService.push(dataSource);
        return true;
    }

}
