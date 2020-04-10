package hu.elte.CataflixBackEnd.services;

import hu.elte.CataflixBackEnd.entities.MovieEntity;
import org.junit.Before;
import org.junit.jupiter.api.Test;
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
class MovieServiceTest {
    @MockBean
    private MovieService movieService;

    private List<MovieEntity> movieEntities;

    @Before
    public void setup() {
        movieEntities = Arrays.asList(
                new MovieEntity("Titanic", 8),
                new MovieEntity("Avatar", 9),
                new MovieEntity("Trónok harca", 10));

    }


    @Test
    void loadDataById() {
        movieService = Mockito.mock(MovieService.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(movieService.loadDataById(1L)).thenReturn(new MovieEntity("Test", 1));
        assertEquals("Test", movieService.loadDataById(1L).getTitle());
        assertEquals(1, movieService.loadDataById(1L).getRating());
    }


    @Test
    void listAllData() {
        movieEntities = Arrays.asList(
                new MovieEntity("Titanic", 8),
                new MovieEntity("Avatar", 9),
                new MovieEntity("Trónok harca", 10));
        movieService = Mockito.mock(MovieService.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(movieService.listAllData()).thenReturn(movieEntities);
        assertEquals(movieService.listAllData(), movieEntities);
    }


}


