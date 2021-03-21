package com.springboot.moviemoon.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.moviemoon.model.Movie;
import com.springboot.moviemoon.services.MovieService;

@RestController
public class MovieController {
    private MovieService movieService=new MovieService();
    @GetMapping("/movies")
    public List<Movie> getMovies(){
		return this.movieService.getMovies();
	}
}
