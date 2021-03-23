package com.springboot.moviemoon.services;

import java.time.LocalDate;
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
    	 return this.movieRepository.findAll();
     }
     public void createMovie(String title,String imageUrl, String trailerUrl,LocalDate fechaEstreno) {
    	 this.movieRepository.save(new Movie(title,imageUrl,trailerUrl,fechaEstreno));
     }
	public Movie getMovie(Long id) {
		return this.movieRepository.getOne(id);
	}
}
