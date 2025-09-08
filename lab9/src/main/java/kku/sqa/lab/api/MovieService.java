package kku.sqa.lab.api;

import java.util.List;

//Interface to External service, e.g., KKU library


public interface MovieService {
	
	public List<String> getMovieCatalogue(String username);

}
