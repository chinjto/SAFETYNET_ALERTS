package com.safetynet.safetynetalerts.controller.admin;

import com.safetynet.safetynetalerts.repository.PersonsRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.match.ContentRequestMatchers;
import org.springframework.test.web.reactive.server.StatusAssertions;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RequiredArgsConstructor
public class PersonAdminControllerTest {

    @NonNull
    private final MockMvc mvc;

    @NonNull
    private final PersonsRepository personsRepository;

    @Test
    public void itShouldReturnCreatedPersonWithId24()
            throws Exception {

        createTestPerson("bob");

        mvc.perform((RequestBuilder) get("/person")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect((ResultMatcher) status().isOk())
                .andExpect((ResultMatcher) content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect((ResultMatcher) jsonPath("$[0].name", is("bob")));
    }
    private Object is(final String bob) {
        return null;
    }
    private ContentRequestMatchers content() {
        return null;
    }
    private StatusAssertions status() {
        return null;
    }
    private ContentRequestMatchers get(final String s) {
        return null;
    }
    private void createTestPerson(final String bob) {
    }

}