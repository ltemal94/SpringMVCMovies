package com.sfeir.springmvcmovies.services;

import com.sfeir.springmvcmovies.model.domaine.LoadMovieModel;
import com.sfeir.springmvcmovies.model.domaine.Movie;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by ltemal on 13/03/14.
 */

@Service("movieService")
public class MovieServiceImpl implements MovieService {


    private List<Movie> movies = LoadMovieModel.getInstance().getMovies();

    @Override
    public List<Movie> fetchMoviesList() {
        return movies;
    }

    @Override
    public boolean addMovie(Movie movie) {

        if(ifTheTitleMovieAlreadyExist(movie)){
           return false;
        }
        else{
            return movies.add(movie);
        }

    }


    @Override
    public Movie fetchOneMovie(int id) {
        for (Movie iMovie : movies){
            if(iMovie.getId() == id){
                return iMovie;
            }
        }
        return null;
    }

    @Override
    public Movie updateMovie(Movie movie) {
        int index = 0;
        for(Movie imovie: movies){
            if(imovie.getId() == movie.getId()){
                movies.remove(index);
                movies.add(index, movie);
                return movies.get(index);
            }
            index++;

        }
        return null;
    }


    @Override
    public boolean removeMovie(int id) {

        for (Movie iMovie : movies){
            if(iMovie.getId() == id){
               return movies.remove(iMovie) ;
            }
        }
        return false ;

    }

    public boolean ifTheTitleMovieAlreadyExist(Movie movie) {
        boolean isExist =false;
        for (Movie iMovie : movies){
            if(iMovie.getTitle().equals( movie.getTitle())){
                isExist = true;
                break;
            }

        }
        return isExist;
    }
}
