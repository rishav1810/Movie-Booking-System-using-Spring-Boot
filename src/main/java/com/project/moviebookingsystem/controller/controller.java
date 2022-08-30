package com.project.moviebookingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.moviebookingsystem.model.movie;
import com.project.moviebookingsystem.model.moviebooking;
import com.project.moviebookingsystem.service.movieservice;



@RestController
@RequestMapping("/")
public class controller {
	@Autowired
	movieservice movieService;
	
	@GetMapping("/movie")
	public List<movie> getAllMovies(){
		return movieService.getAllMovies();
		
	}
	@GetMapping("/listById")
	public List<movie> getAllMoviesById(int movieId){
		return movieService.getAllMoviesById(movieId);
		
	}
	
	@PostMapping("/bookticket")
	public moviebooking addTicket(@RequestBody moviebooking moviebooking) {
		return movieService.addTicket(moviebooking);
	}

	
}
