package com.project.moviebookingsystem.movierepository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.project.moviebookingsystem.model.moviebooking;


@Repository
public class moviebookingrepository extends SimpleJpaRepository<moviebooking, Integer> {

	@Autowired
	private EntityManager entityManager;
	
	public moviebookingrepository(EntityManager em) {
		super(moviebooking.class, em);
	
	}
}
