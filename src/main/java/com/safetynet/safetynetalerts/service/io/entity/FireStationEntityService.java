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
public class FireStationEntityService implements EntityService<FireStationEntity> {

    @NonNull
    DataSourceService dataSourceService;

    @Override
    public Boolean create(FireStationEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<FireStationEntity> list = dataSource.getFirestations();
        if (list.indexOf(entity) < 0) {
            list.add(entity);
            dataSourceService.push(dataSource);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean update(FireStationEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<FireStationEntity> list = dataSource.getFirestations();
        list.set(list.indexOf(entity), entity);
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean delete(FireStationEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<FireStationEntity> list = dataSource.getFirestations();
        final Boolean result = list.remove(entity);
        dataSourceService.push(dataSource);
        return result;
    }

    @Override
    public Iterable<FireStationEntity> readAll() throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        return dataSource.getFirestations();
    }

    @Override
    public Iterable<FireStationEntity> readAllFilteredByCriteria(FireStationEntity criteria) {
        // TODO
        return null;
    }

}
