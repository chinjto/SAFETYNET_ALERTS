package com.safetynet.safetynetalerts.service.io.entity;

import com.safetynet.safetynetalerts.io.datasource.DataSource;
import com.safetynet.safetynetalerts.io.entity.MedicalRecordEntity;
import com.safetynet.safetynetalerts.service.io.datasource.DataSourceService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalRecordIOService implements EntityService<MedicalRecordEntity> {

    @NonNull
    DataSourceService dataSourceService;

    @Override
    public Boolean create(MedicalRecordEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<MedicalRecordEntity> list = dataSource.getMedicalrecords();
        list.add(entity);
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean update(MedicalRecordEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<MedicalRecordEntity> list = dataSource.getMedicalrecords();
        // TODO find and update into data source
        dataSourceService.push(dataSource);
        return true;
    }

    @Override
    public Boolean delete(MedicalRecordEntity entity) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        final List<MedicalRecordEntity> list = dataSource.getMedicalrecords();
        // TODO find and delete into data source
        dataSourceService.push(dataSource);
        return true;
    }

}
