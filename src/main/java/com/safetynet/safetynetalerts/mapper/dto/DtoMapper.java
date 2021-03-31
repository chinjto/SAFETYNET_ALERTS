package com.safetynet.safetynetalerts.mapper.dto;

public interface DtoMapper<D, E> {

    E dtoToEntity(D dto);
    Iterable<E> dtoToEntity(Iterable<D> dto);

    D entityToDto(E entity);
    Iterable<D> entityToDto(Iterable<E> entity);

}
