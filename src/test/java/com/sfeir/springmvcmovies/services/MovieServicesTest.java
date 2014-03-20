package com.sfeir.springmvcmovies.services;

import com.sfeir.springmvcmovies.model.domaine.LoadMovieModel;
import com.sfeir.springmvcmovies.model.domaine.Movie;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;


/**
 * Created by ltemal on 14/03/14.
 */
public class MovieServicesTest {

    private MovieServiceImpl movieServices;

    @Before
    public void setup() {

        movieServices = new MovieServiceImpl();

    }

    @Test
    public void fetchMoviesListTest(){

        List <Movie> movies = movieServices.fetchMoviesList();
        assertTrue("movies list size() Should be 9 ", movies.size() == 9);
    }


    @Test
    public void ifMovieAlreadyExistShouldBeTrueTest (){

        Movie movie = new Movie();
        movie.setTitle("Seigneur des Anneaux : les deux Tours");
        boolean isExist = movieServices.ifTheTitleMovieAlreadyExist(movie);
        assertTrue("The movie should exist", isExist == true);
    }

    @Test
    public void ifMovieAlreadyExistShouldBeFalseTest (){
        Movie movie = new Movie();
        movie.setTitle("Seigneur des Anneaux : les deux");
        boolean isExist = movieServices.ifTheTitleMovieAlreadyExist(movie);

        assertTrue("The movie should exist", isExist == false);
    }

    @Test
    public void fetchOnMovieTestShouldBeFound(){
        Movie  movie = movieServices.fetchOneMovie(3);
        assertTrue("test if the movie exist", movie.getTitle().equals("The Grudge"));

    }

    @Test
    public void addMovieTest(){
        Movie movie = new Movie();
        movie.setId(10);
        movie.setTitle("This a new movie");
        movie.setCategory("Thriller");
        boolean added = movieServices.addMovie(movie);
        assertTrue("The movie was added", added == true );
        movie = movieServices.fetchOneMovie(10);
        assertTrue("Test if the movie exist", movie.getTitle().equals("This a new movie"));
        List <Movie> movies = movieServices.fetchMoviesList();
        assertTrue("movies list size() Should be 9 ", movies.size() == 10);


    }

    @Test
    public void updateMovieTest(){
        Movie movie = new Movie();
        movie.setId(10);
        movie.setTitle("This an updated title");
        Movie movieUp = movieServices.updateMovie(movie);
        assertTrue("The movie was updated", movieUp.getTitle().equals("This an updated title") );

    }

    @Test
    public void removeMovieTest(){

        List <Movie> movies = movieServices.fetchMoviesList();
        assertTrue("movies list size() Should be 9 ", movies.size() == 10);
        boolean removed = movieServices.removeMovie(10);
        assertTrue("The movie id 10 is removed", removed ==true);
        movies = movieServices.fetchMoviesList();
        assertTrue("movies list size() Should be 9 ", movies.size() == 9);
    }


}
