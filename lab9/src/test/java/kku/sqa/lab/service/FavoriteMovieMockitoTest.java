package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import kku.sqa.lab.api.MovieService;

@ExtendWith(MockitoExtension.class)
class FavoriteMovieMockitoTest {

    @Mock
    private MovieService movieService;   
    @InjectMocks
    private FavoriteMovie favoriteMovie; 
    @Test
    void whenPlaylistIsAction_shouldReturnOnlyActionMovies() {
                List<String> fakeCatalogue = Arrays.asList(
            "The Notebook - datenight",
            "50 First Dates - datenight",
            "karate kid - action",
            "John Wick - action",
            "blade - action",
            "The Conjuring - horror"
        );

        when(movieService.getMovieCatalogue("user1")).thenReturn(fakeCatalogue);

               List<String> result = favoriteMovie.getMoviesByPlaylist("user1", "action");

               assertEquals(3, result.size());
        assertTrue(result.stream().allMatch(m -> m.toLowerCase().contains("action")));

      
        verify(movieService, times(1)).getMovieCatalogue("user1");
    }
}
