package com.springboot.moviemoon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.moviemoon.model.Movie;
import com.springboot.moviemoon.repositories.MovieRepository;
//@Transactional
//@Service
@Component
public class MovieService {
    @Autowired
	private MovieRepository movieRepository;
     public List<Movie> getMovies(){
    	 return List.of(new Movie(),new Movie(),new Movie());
     }
     public void savaMovie() {
    	 this.movieRepository.save(new Movie());
     }
}
