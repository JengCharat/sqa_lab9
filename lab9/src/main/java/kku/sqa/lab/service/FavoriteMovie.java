
package kku.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;
import kku.sqa.lab.api.MovieService;

public class FavoriteMovie {
    
    private MovieService movieService;
    
    public FavoriteMovie(MovieService movieService) {
        this.movieService = movieService;
    }
    
    public List<String> getMoviesByPlaylist(String username, String playlist) {
        List<String> allMovies = movieService.getMovieCatalogue(username);
        List<String> filtered = new ArrayList<>();
        
        for (String movie : allMovies) {
            if (movie.toLowerCase().contains(playlist.toLowerCase())) {
                filtered.add(movie);
            }
        }
        return filtered;
    }
}
