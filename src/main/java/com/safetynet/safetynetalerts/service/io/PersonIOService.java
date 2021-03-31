package com.safetynet.safetynetalerts.service.io;

import com.safetynet.safetynetalerts.entity.DataSourceEntity;
import com.safetynet.safetynetalerts.entity.FireStationEntity;
import com.safetynet.safetynetalerts.entity.PersonEntity;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PersonIOService implements EntityIOService<PersonEntity> {

    @NonNull
    DataSourceIOService dataSourceService;

    @Override
    public Boolean create(PersonEntity entity) throws IOException {
        final DataSourceEntity dataSource = dataSourceService.pull();
        final List<PersonEntity> list = dataSource.getPersons();
        list.add(entity);
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean update(PersonEntity entity) throws IOException {
        final DataSourceEntity dataSource = dataSourceService.pull();
        final List<PersonEntity> list = dataSource.getPersons();
        // TODO find and update into data source
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean delete(PersonEntity entity) throws IOException {
        final DataSourceEntity dataSource = dataSourceService.pull();
        final List<PersonEntity> list = dataSource.getPersons();
        // TODO find and delete into data source
        dataSourceService.push(dataSource);
        return true;
    }

}
