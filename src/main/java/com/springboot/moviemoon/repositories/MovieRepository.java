package com.springboot.moviemoon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.moviemoon.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
