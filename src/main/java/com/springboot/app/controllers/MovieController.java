package com.springboot.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Movie;
import services.MovieService;



@RestController
@RequestMapping(path="/")
public class MovieController {
    private final MovieService movieService = new MovieService();
    

	@GetMapping
	public List<Movie> getMovies() {
		return this.movieService.getMovies();
	}
}
