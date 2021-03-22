package com.springboot.moviemoon.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.moviemoon.model.Movie;
import com.springboot.moviemoon.requesthttp.*;
import com.springboot.moviemoon.services.MovieService;

@RestController
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
    	//return "ojala ande";
    }
    @GetMapping("/save")
    public String saveMovie() {
          this.movieService.savaMovie();
          return "save succesfull";
    }
}
