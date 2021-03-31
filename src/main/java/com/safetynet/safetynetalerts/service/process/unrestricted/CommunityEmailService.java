package com.safetynet.safetynetalerts.service.process.unrestricted;

import com.safetynet.safetynetalerts.dto.unrestricted.CommunityEmailDTO;
import com.safetynet.safetynetalerts.mapper.CommunityEmailDtoToPersonMapper;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class CommunityEmailService {

    @NonNull
    private final CommunityEmailDtoToPersonMapper mapper;

    // FIXME le DAO a été supprimé, à remplacer par un repository
    //@NonNull
    //private final DataDAO dao;

    public Iterable<CommunityEmailDTO> getAll(String city) throws IOException {
        // FIXME le DAO a été supprimé, à remplacer par un repository
        //Iterable<PersonEntity> personList = dao.getPersons();
        //Iterable<CommunityEmailDTO> communityEmailDTOList = mapper.entityToDto(personList);
        //return communityEmailDTOList;
        return null;
    }

}
