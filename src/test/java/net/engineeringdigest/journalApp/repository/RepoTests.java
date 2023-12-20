package net.engineeringdigest.journalApp.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class RepoTests {

    @Autowired
    private UserRepositoryOkImpl userRepository;

    @Test
    public void testSaveNewUser() {
        userRepository.getUsersForSA();
    }

}
