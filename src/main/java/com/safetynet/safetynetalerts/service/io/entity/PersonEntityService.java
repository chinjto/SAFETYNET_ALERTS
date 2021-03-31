package com.safetynet.safetynetalerts.service.io.entity;

import com.safetynet.safetynetalerts.io.datasource.DataSource;
import com.safetynet.safetynetalerts.io.entity.PersonEntity;
import com.safetynet.safetynetalerts.service.io.datasource.DataSourceService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonEntityService implements EntityService<PersonEntity> {

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

    @Override
    public Iterable<PersonEntity> readAll() throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        return dataSource.getPersons();
    }

    @Override
    public Iterable<PersonEntity> readAllFilteredByCriteria(PersonEntity criteria) throws IOException {
        final DataSource dataSource = dataSourceService.pull();
        return dataSource.getPersons().stream().filter(person -> {
            Boolean selected = true;
            selected &= criteria.getFirstName() != null ? criteria.getFirstName().equals(person.getFirstName()) : true;
            selected &= criteria.getLastName() != null ? criteria.getLastName().equals(person.getLastName()) : true;
            selected &= criteria.getAddress() != null ? criteria.getAddress().equals(person.getAddress()) : true;
            selected &= criteria.getCity() != null ? criteria.getCity().equals(person.getCity()) : true;
            selected &= criteria.getZip() != null ? criteria.getZip().equals(person.getZip()) : true;
            selected &= criteria.getPhone() != null ? criteria.getPhone().equals(person.getPhone()) : true;
            selected &= criteria.getEmail() != null ? criteria.getEmail().equals(person.getEmail()) : true;
            return selected;
        }).collect(Collectors.toList());
    }

}
