package com.springboot.moviemoon.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.moviemoon.model.Movie;
import com.springboot.moviemoon.requesthttp.*;
import com.springboot.moviemoon.services.MovieService;

@RestController
public class MovieController {
	private ClientHttp client=new ClientHttp();
    private MovieService movieService=new MovieService();
    @GetMapping("/movies")
    public List<Movie> getMovies(){
		return this.movieService.getMovies();
	}
    @GetMapping("/request")
    public List<ModelData> getRequest() {
    	 return this.client.getDataJson();
    	//return "ojala ande";
    }
}
