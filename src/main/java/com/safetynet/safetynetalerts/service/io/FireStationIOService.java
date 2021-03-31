package com.safetynet.safetynetalerts.service.io;

import com.safetynet.safetynetalerts.entity.DataSourceEntity;
import com.safetynet.safetynetalerts.entity.FireStationEntity;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FireStationIOService implements EntityIOService<FireStationEntity> {

    @NonNull
    DataSourceIOService dataSourceService;

    @Override
    public Boolean create(FireStationEntity entity) throws IOException {
        final DataSourceEntity dataSource = dataSourceService.pull();
        final List<FireStationEntity> list = dataSource.getFirestations();
        list.add(entity);
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean update(FireStationEntity entity) throws IOException {
        final DataSourceEntity dataSource = dataSourceService.pull();
        final List<FireStationEntity> list = dataSource.getFirestations();
        // TODO find and update into data source
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean delete(FireStationEntity entity) throws IOException {
        final DataSourceEntity dataSource = dataSourceService.pull();
        final List<FireStationEntity> list = dataSource.getFirestations();
        // TODO find and delete into data source
        dataSourceService.push(dataSource);
        return true;
    }

}
