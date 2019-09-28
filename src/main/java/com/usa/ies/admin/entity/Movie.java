package com.usa.ies.admin.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private int mid;
	private String movieName;
	private int tprice;
	@ManyToMany(mappedBy="movieList")
	private List<Theatre> theatreList;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getTprice() {
		return tprice;
	}

	public void setTprice(int tprice) {
		this.tprice = tprice;
	}

	public List<Theatre> getTheatreList() {
		return theatreList;
	}

	public void setTheatreList(List<Theatre> theatreList) {
		this.theatreList = theatreList;
	}
	
	

}
