package com.springboot.moviemoon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.moviemoon.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
    @Query("select m from Movie m where lower(m.title) like %:titulo%")
	public Movie getMovieByTitle(String titulo);

}
