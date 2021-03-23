package com.springboot.moviemoon.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.moviemoon.dtos.MovieData;
import com.springboot.moviemoon.model.Movie;
import com.springboot.moviemoon.requesthttp.*;
import com.springboot.moviemoon.services.MovieService;

@RestController
@CrossOrigin
public class MovieController {
	private ClientHttp client=new ClientHttp();
	@Autowired
    private MovieService movieService;
	
    @GetMapping("/movies")
    public List<Movie> getMovies(){
		return this.movieService.getMovies();
	}
    @GetMapping("/request")
    public List<ModelData> getRequest() {
    	 return this.client.getDataJson();
    }
    @PostMapping("/movies")
    public String createMovie(@RequestBody MovieData body) {
          this.movieService.createMovie(body.getTitulo(),body.getImagen(),body.getTrailer(),body.getEstreno());;
          return "create succesfull"; 	  

    }
    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable(value = "id") Long id) {
    	return this.movieService.getMovie(id);
    	
    }
    @GetMapping("/movies/search/{titulo}")
    public Movie getMovie(@PathVariable(value = "titulo") String titulo) {
    	return this.movieService.getMovieByTitle(titulo);
    	
    }
}
