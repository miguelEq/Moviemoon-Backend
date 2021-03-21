package com.springboot.moviemoon.services;

import java.util.List;

import com.springboot.moviemoon.model.Movie;

public class MovieService {
     public List<Movie> getMovies(){
    	 return List.of(new Movie(),new Movie(),new Movie());
     }
}
