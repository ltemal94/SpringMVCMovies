package com.sfeir.springmvcmovies.model.domaine;

import com.sfeir.springmvcmovies.model.domaine.util.JsonToJava;

import java.util.List;

/**
 * Created by ltemal on 13/03/14.
 */
public class LoadMovieModel {

    private static final LoadMovieModel INSTANCE = new LoadMovieModel();
    public static final String JSON_MOVIES_FILE_PATH = "/home/ltemal/workspace/SpringMVCMovies/src/main/resources/movies.json";


    private List<Movie> movies;

    private LoadMovieModel(){

             movies = JsonToJava.convertJsonToMoviesList(JSON_MOVIES_FILE_PATH);
    }



    public static LoadMovieModel getInstance() {
        return INSTANCE;
    }

    public List<Movie> getMovies(){
        return movies;
    }

}
