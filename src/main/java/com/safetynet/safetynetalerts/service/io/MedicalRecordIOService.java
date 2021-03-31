package com.safetynet.safetynetalerts.service.io;

import com.safetynet.safetynetalerts.entity.DataSourceEntity;
import com.safetynet.safetynetalerts.entity.FireStationEntity;
import com.safetynet.safetynetalerts.entity.MedicalRecordEntity;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class MedicalRecordIOService implements EntityIOService<MedicalRecordEntity> {

    @NonNull
    DataSourceIOService dataSourceService;

    @Override
    public Boolean create(MedicalRecordEntity entity) throws IOException {
        final DataSourceEntity dataSource = dataSourceService.pull();
        final List<MedicalRecordEntity> list = dataSource.getMedicalrecords();
        list.add(entity);
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean update(MedicalRecordEntity entity) throws IOException {
        final DataSourceEntity dataSource = dataSourceService.pull();
        final List<MedicalRecordEntity> list = dataSource.getMedicalrecords();
        // TODO find and update into data source
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean delete(MedicalRecordEntity entity) throws IOException {
        final DataSourceEntity dataSource = dataSourceService.pull();
        final List<MedicalRecordEntity> list = dataSource.getMedicalrecords();
        // TODO find and delete into data source
        dataSourceService.push(dataSource);
        return true;
    }

}
