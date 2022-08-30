package com.project.moviebookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.moviebookingsystem.model.movie;
import com.project.moviebookingsystem.model.moviebooking;
import com.project.moviebookingsystem.movierepository.moviebookingrepository;
import com.project.moviebookingsystem.movierepository.movierepository;

@Service
public class movieservice {

	@Autowired
	movierepository movieRepository;

	
	@Autowired
	moviebookingrepository movieBookingRepository;
	
	public List<movie> getAllMovies() {
		return movieRepository.findAll();
	}

	

	public List<movie> getAllMoviesById(int movieId) {
		return movieRepository.getAllMoviesById(movieId);
	}



	public moviebooking addTicket(moviebooking moviebooking) {
		movieRepository.updateSeat(moviebooking);
		return movieBookingRepository.save(moviebooking);
	}



}


