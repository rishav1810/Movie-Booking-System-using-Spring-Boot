package com.project.moviebookingsystem.movierepository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.project.moviebookingsystem.model.movie;
import com.project.moviebookingsystem.model.moviebooking;
@Repository
public class movierepository extends SimpleJpaRepository<movie, Integer>{

	@Autowired
	private EntityManager entitymanager;
	public movierepository(EntityManager em) {
		super(movie.class, em);
	
	}
	public List<movie> getAllMoviesById(int movieId){
		Query q= entitymanager.createNativeQuery("SELECT * FROM MOVIE AS M WHERE M.MOVIE_ID= "+movieId,movie.class);
		List<movie> allMovies = q.getResultList();
		return allMovies;
	}
	public void updateSeat(moviebooking moviebooking) {
		Query q = entitymanager.createNativeQuery("SELECT SEATS FROM MOVIE WHERE movie_id=" + moviebooking.getMovieId());
		int count = ((Number) q.getSingleResult()).intValue();
		
		System.out.println(count);
		System.out.println(moviebooking.getSeatsBooked());
		
		int updatedseat = count-moviebooking.getSeatsBooked();
		System.out.println(updatedseat);
		Query p=entitymanager.createNativeQuery("SELECT PRICE FROM MOVIE WHERE movie_id="+moviebooking.getMovieId());
		int pr=((Number) p.getSingleResult()).intValue();
		moviebooking.setPrice(pr);
	

}
}
