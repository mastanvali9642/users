package com.usa.ies.admin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Theatre {
	@Id
	@GeneratedValue
	private int tid;
	private String tname;
	private String tplace;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="mov_theatre",joinColumns=@JoinColumn(name="movId"),
			inverseJoinColumns=@JoinColumn(name="theId"))
	private List<Movie> movieList;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTplace() {
		return tplace;
	}

	public void setTplace(String tplace) {
		this.tplace = tplace;
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	

}
