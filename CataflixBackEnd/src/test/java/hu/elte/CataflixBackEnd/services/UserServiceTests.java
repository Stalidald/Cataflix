package hu.elte.CataflixBackEnd.services;

import hu.elte.CataflixBackEnd.entities.UserEntity;
import hu.elte.CataflixBackEnd.repositories.UserRepository;
import hu.elte.CataflixBackEnd.services.exceptions.EmailNotFoundException;
import hu.elte.CataflixBackEnd.services.exceptions.NameNotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
        @Bean
        public UserService userService(UserRepository userRepository) {
            return new UserService(userRepository);
        }
    }

    @MockBean
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    private List<UserEntity> userEntities;

    @BeforeAll
    public void setup() {

        userEntities = Arrays.asList(
                new UserEntity("Feri", "stalidald@gmail.com", "alma123"),
                new UserEntity("Tomi", "tomi19990314@gmail.com", "asd1234"),
                new UserEntity("Patrik", "patrik@gmail.com", "hahahah10"));

        Mockito.when(userRepository.findAll()).thenReturn(userEntities);

        Mockito.when(userRepository.findByName("Tomi")).thenReturn(Optional.of(userEntities.get(1)));
        Mockito.when(userRepository.findByName("Alma")).thenReturn(Optional.empty());

        userEntities.get(0).setId(1L);
        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(userEntities.get(0)));
        Mockito.when(userRepository.findById(5L)).thenReturn(Optional.empty());

        Mockito.when(userRepository.findByEmail("Alma@alma.hu")).thenReturn(Optional.empty());
        Mockito.when(userRepository.findByEmail("patrik@gmail.com")).thenReturn(Optional.of(userEntities.get(2)));

        Mockito.when(userRepository.save(new UserEntity("Peti", "pev@gmail.com", "aaaaa4444")))
                .thenReturn(new UserEntity("Peti", "pev@gmail.com", "aaaaa4444"));
    }

    @Test
    public void test_ListAllData() {
        assertEquals(userService.listAllData(),
                userEntities);
    }

    @Test
    public void test_loadDataById() {
        assertEquals(userService.loadDataById(1L), userEntities.get(0));
    }

    @Test(expected = EntityNotFoundException.class)
    public void test_loadDataByWrongId() {
        userService.loadDataById(5L);
    }

    @Test
    public void test_save() {
        assertEquals(userService.save(new UserEntity("Peti", "pev@gmail.com", "aaaaa4444"))
                , new UserEntity("Peti", "pev@gmail.com", "aaaaa4444"));
    }

    @Test
    public void test_loadUserByEmail() throws EmailNotFoundException {
        assertEquals(userService.loadUserByEmail("patrik@gmail.com"), userEntities.get(2));
    }

    @Test(expected = EmailNotFoundException.class)
    public void test_loadUserByWrongEmail() throws EmailNotFoundException {
        userService.loadUserByEmail("Alma@alma.com");
    }

    @Test
    public void test_loadUserByName() throws NameNotFoundException {
        assertEquals(userService.loadUserByName("Tomi"), userEntities.get(1));
    }

    @Test(expected = NameNotFoundException.class)
    public void test_loadUserByWrongName() throws NameNotFoundException {
        userService.loadUserByName("Alma");
    }


}
