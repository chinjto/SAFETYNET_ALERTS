package com.safetynet.safetynetalerts.service.process.unrestricted;

import com.safetynet.safetynetalerts.dto.unrestricted.CommunityEmailDTO;
import com.safetynet.safetynetalerts.io.entity.PersonEntity;
import com.safetynet.safetynetalerts.mapper.dto.DtoMapper;
import com.safetynet.safetynetalerts.service.io.entity.EntityService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class CommunityEmailService {

    @NonNull
    private final DtoMapper<CommunityEmailDTO, PersonEntity> mapper;

    @NonNull
    private final EntityService<PersonEntity> entityService;

    public Iterable<CommunityEmailDTO> readAll(CommunityEmailDTO filter) throws IOException {
        final Iterable<PersonEntity> entityList;
        if (filter != null) {
            final PersonEntity criteria = mapper.dtoToEntity(filter);
            entityList = entityService.readAllFilteredByCriteria(criteria);
        } else {
            entityList = entityService.readAll();
        }
        return mapper.entityToDto(entityList);
    }

}
