package com.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import com.sqa.lab.api.*;

public class MovieServiceStub implements MoiveService {

	public List<String> getMovie(String username, String playlist) {
        if (playlist.equals("action")) {
            return Arrays.asList("F1", "Mission Impossible", "How to Train Your Dragon");
        } else if (playlist.equals("comedy")) {
            return Arrays.asList("The Hangover", "Mr. Bean's Holiday", "Ted");
        }
        return Arrays.asList();
    }

}
