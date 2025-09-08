package com.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import com.sqa.lab.data.stub.*;
import com.sqa.lab.api.*;

import org.junit.jupiter.api.Test;


public class Favoritemovietest {
	@Test
	void FavoriteMovietest() {
		
		MoiveService service = new MovieServiceStub();
        FavoriteMovie fav = new FavoriteMovie(service);

        List<String> movies = fav.showMovies("user1", "action");

        assertEquals(Arrays.asList("F1", "Mission Impossible", "How to Train Your Dragon"), movies);
    }
}
