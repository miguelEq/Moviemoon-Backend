package com.springboot.moviemoon.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String title;
    @ElementCollection
	private List<String> genres;
    
	public Movie() {
		this.title="Titanic";
		this.genres=List.of("accion","comedia","romance");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
