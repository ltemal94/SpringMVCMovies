package com.sfeir.springmvcmovies.controllers;

import com.sfeir.springmvcmovies.model.domaine.Movie;

import com.sfeir.springmvcmovies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ltemal on 17/03/14.
 */

@Controller
@RequestMapping("/server/api/movies")
public class MovieController {

@Autowired
private MovieService movieService;



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    List<Movie> getMoviesList() {
        return movieService.fetchMoviesList();
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody void addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
    }


    @RequestMapping(value="/{movieId}", method = RequestMethod.DELETE)
    public @ResponseBody void deleteMovie(@PathVariable("movieId") int movieId) {
        movieService.removeMovie(movieId);

    }



    @RequestMapping(value = "/{movieId}", method = RequestMethod.GET)
    public @ResponseBody Movie fetchOneMovie(@PathVariable ("movieId") int movieId) {
        return movieService.fetchOneMovie(movieId);
    }



    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public @ResponseBody void updateMovie(@RequestBody  Movie aMovie) {
        movieService.updateMovie(aMovie) ;

    }

}


