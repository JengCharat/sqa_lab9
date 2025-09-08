
package kku.sqa.lab.service;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.data.stub.MovieServiceStub;

class FavoriteMovieTest {

    @Test
    void test_getActionMovies_withStub() {
        MovieService movieService = new MovieServiceStub();
        FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
        
        List<String> actionMovies = favoriteMovie.getMoviesByPlaylist("anyUser", "datenight");
        
        assertEquals(5, actionMovies.size());
        assertTrue(actionMovies.contains("The Notebook - datenight"));
    }
}
