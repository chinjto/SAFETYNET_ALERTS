package com.safetynet.safetynetalerts.service.io.entity;

import java.io.IOException;

public interface EntityService<E> {

    Boolean create (E entity) throws IOException;

    Boolean update (E entity) throws IOException;

    Boolean delete (E entity) throws IOException;

    Iterable<E> readAll() throws IOException;

    Iterable<E> readAllFilteredByCriteria(E criteria) throws IOException;
}
