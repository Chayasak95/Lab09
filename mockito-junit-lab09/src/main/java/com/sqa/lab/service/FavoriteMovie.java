package com.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import com.sqa.lab.api.MoiveService;

public class FavoriteMovie {
	
	private MoiveService movieservice;
	
	
	public FavoriteMovie(MoiveService movieservice) {
		super();
		this.movieservice = movieservice;
	}


	 public List<String> showMovies(String username, String playlist) {
	        
	        return movieservice.getMovie(username, playlist);
	    }

}
