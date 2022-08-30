package com.project.moviebookingsystem.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class movie {
	@Id
	  private int movieId;
	  private String movie;
	  private int year;
	  private Time time;
	  private int seats;
	  private int price;
	  public movie() {
			super();
			// TODO Auto-generated constructor stub
		}
	  
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	  
}
