package com.safetynet.safetynetalerts.service.io.entity;

import com.safetynet.safetynetalerts.io.datasource.DataSource;
import com.safetynet.safetynetalerts.io.entity.FireStationEntity;
import com.safetynet.safetynetalerts.service.io.datasource.DataSourceService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FireStationIOService implements EntityService<FireStationEntity> {

    @NonNull
    DataSourceService dataSourceService;

    @Override
    public Boolean create(FireStationEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<FireStationEntity> list = dataSource.getFirestations();
        list.add(entity);
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean update(FireStationEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<FireStationEntity> list = dataSource.getFirestations();
        // TODO find and update into data source
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean delete(FireStationEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<FireStationEntity> list = dataSource.getFirestations();
        // TODO find and delete into data source
        dataSourceService.push(dataSource);
        return true;
    }

}
