package hu.elte.CataflixBackEnd.services;

import hu.elte.CataflixBackEnd.entities.MovieMembersEntity;
import hu.elte.CataflixBackEnd.services.exceptions.NameNotFoundException;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@RunWith(MockitoJUnitRunner.class)
class MovieMemberServiceTest {
    @MockBean
    private MovieMemberService movieMemberService;

    private List<MovieMembersEntity> movieMemberEntities;

    @Before
    public void setup() {
        movieMemberEntities = Arrays.asList(
                new MovieMembersEntity("Leonardo", "Actor"),
                new MovieMembersEntity("Test", "Director"),
                new MovieMembersEntity("Second_Test", "Stunt"));

    }
    @Test
    void listAllData() {
        movieMemberService = Mockito.mock(MovieMemberService.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(movieMemberService.listAllData()).thenReturn(movieMemberEntities);
        assertEquals(movieMemberService.listAllData(), movieMemberEntities);
    }

    @Test
    void loadDataById() {
        movieMemberEntities = Arrays.asList(
                new MovieMembersEntity("Leonardo", "Actor"),
                new MovieMembersEntity("Test", "Director"),
                new MovieMembersEntity("Second_Test", "Stunt"));
        movieMemberService = Mockito.mock(MovieMemberService.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(movieMemberService.loadDataById(1L)).thenReturn(movieMemberEntities.get(0));
        assertEquals(movieMemberService.loadDataById(1L), movieMemberEntities.get(0));
    }

    @Test
    void loadMovieMemberByName() throws NameNotFoundException {
        movieMemberEntities = Arrays.asList(
                new MovieMembersEntity("Leonardo", "Actor"),
                new MovieMembersEntity("Test", "Director"),
                new MovieMembersEntity("Second_Test", "Stunt"));
        movieMemberService = Mockito.mock(MovieMemberService.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(movieMemberService.loadMovieMemberByName("Test")).thenReturn(movieMemberEntities.get(1));
        assertEquals(movieMemberService.loadMovieMemberByName("Test"), movieMemberEntities.get(1));
    }

}
