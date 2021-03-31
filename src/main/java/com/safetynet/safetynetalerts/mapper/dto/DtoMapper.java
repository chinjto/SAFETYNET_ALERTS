package com.safetynet.safetynetalerts.mapper.dto;

public interface DtoMapper<D, E> {

    E dtoToEntity(D dto);

    D entityToDto(E entity);

}
