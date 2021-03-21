package services;

import java.util.Arrays;
import java.util.List;


import model.Movie;

public class MovieService {
    public MovieService() {}
    
	public List<Movie> getMovies() {
		return Arrays.asList(new Movie(),new Movie(),new Movie());
	}

}
