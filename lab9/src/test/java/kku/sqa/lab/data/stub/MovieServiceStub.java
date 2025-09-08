
package kku.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;
import kku.sqa.lab.api.MovieService;

public class MovieServiceStub implements MovieService {

    @Override
    public List<String> getMovieCatalogue(String username) {
        return Arrays.asList(
            "The Notebook - datenight",
            "50 First Dates - datenight",
            "A Walk to Remember - datenight",
            "First Love - datenight",
            "The Lucky One - datenight",
            "Tusk - horror",
            "Human centeped - horror",
            "IT - horror"
        );
    }
}
