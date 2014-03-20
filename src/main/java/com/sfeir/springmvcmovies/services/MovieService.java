package com.sfeir.springmvcmovies.services;

import com.sfeir.springmvcmovies.model.domaine.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ltemal on 13/03/14.
 */
public interface MovieService {

    public boolean addMovie(Movie movie);
    public boolean removeMovie (int id);
    public Movie fetchOneMovie (int id);
    public Movie updateMovie (Movie movie);
    public List<Movie> fetchMoviesList();
}
