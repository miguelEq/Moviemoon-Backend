package com.springboot.moviemoon.model;

import java.util.List;

public class Movie {
	private String title;
	private List<String> genres;
    
	public Movie() {
		this.title="Titanic";
		this.genres=List.of("accion","comedia","romance");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
   
}
