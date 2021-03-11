package com.safetynet.safetynetalerts.mapper;

import com.safetynet.safetynetalerts.dto.PersonInfoDTO;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonMapper {

    public List<PersonInfoDTO> fetch(String searchFilter) throws Exception {
        List<PersonInfoDTO> allPerson = new ArrayList<PersonInfoDTO>();

        String rawJson = "https://s3-eu-west-1.amazonaws.com/course.oc-static.com/projects/DA+Java+EN/P5+/data.json";

        JSONObject root = new JSONObject(rawJson);

        JSONArray persons = root.getJSONArray("persons");

        for (int i = 0; i < persons.length(); i++) {
            // données Json
            JSONObject jsonPerson = persons.getJSONObject(i);

            // objet person qui est peupler par les données Json
            PersonInfoDTO person = new PersonInfoDTO();
            String firstName = jsonPerson.getString("firstName");
            String lastName = jsonPerson.getString("lastName");
            String address = jsonPerson.getString("address");
            String city = jsonPerson.getString("city");
            String zip = jsonPerson.getString("zip");
            String phone = jsonPerson.getString("phone");
            String email = jsonPerson.getString("email");

            // envoyer l'objet vers le DTO PersonInfoDTO
            person.setFirstName(firstName);
            person.setLastname(lastName);
            person.setAddress(address);
            person.setCity(city);
            person.setZip(zip);
            person.setPhone(phone);
            person.setEmail(email);

        }
        return allPerson;
    }
}
