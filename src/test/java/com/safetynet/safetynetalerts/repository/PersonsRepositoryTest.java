package com.safetynet.safetynetalerts.repository;

import com.safetynet.safetynetalerts.entity.PersonEntity;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonsRepositoryTest {

    @Autowired
    TestEntityManager entityManager;

    @Autowired
    PersonsRepository repo;

    @Test
    public void it_should_save_user() {
        PersonEntity person = new PersonEntity();
        person.setLastName("test user");
        person = entityManager.persistAndFlush(person);
        Assertions.assertEquals(person, repo.findById(person.getId()).get());
    }

}
