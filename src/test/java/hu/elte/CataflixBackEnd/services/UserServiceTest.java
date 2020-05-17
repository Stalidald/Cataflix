package hu.elte.CataflixBackEnd.services;

import hu.elte.CataflixBackEnd.entities.UserEntity;
import hu.elte.CataflixBackEnd.services.exceptions.EmailNotFoundException;
import hu.elte.CataflixBackEnd.services.exceptions.NameNotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @MockBean
    private UserService userService;

    private List<UserEntity> userEntities;

    @Before
    public void setup() {
        userEntities = Arrays.asList(
                new UserEntity("Feri", "stalidald@gmail.com", "alma123"),
                new UserEntity("Tomi", "tomi19990314@gmail.com", "asd1234"),
                new UserEntity("Patrik", "patrik@gmail.com", "hahahah10"));
    }

    @Test
    public void test_ListAllData() {
        userService = Mockito.mock(UserService.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(userService.listAllData()).thenReturn(userEntities);
        assertEquals(userService.listAllData(), userEntities);
    }

    @Test
    public void test_loadDataById() {
        userService = Mockito.mock(UserService.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(userService.loadDataById(1L)).thenReturn(userEntities.get(0));
        assertEquals(userService.loadDataById(1L), userEntities.get(0));
    }


    @Test
    public void test_loadUserByEmail() throws EmailNotFoundException {
        userService = Mockito.mock(UserService.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(userService.loadUserByEmail("patrik@gmail.com")).thenReturn(userEntities.get(2));
        assertEquals(userService.loadUserByEmail("patrik@gmail.com"), userEntities.get(2));
    }


    @Test
    public void test_loadUserByName() throws NameNotFoundException {
        userService = Mockito.mock(UserService.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(userService.loadUserByName("Tomi")).thenReturn(userEntities.get(1));
        assertEquals(userService.loadUserByName("Tomi"), userEntities.get(1));
    }


}
