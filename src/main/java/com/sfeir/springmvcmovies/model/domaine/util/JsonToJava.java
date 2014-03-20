package com.sfeir.springmvcmovies.model.domaine.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.sfeir.springmvcmovies.model.domaine.Movie;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;


/**
 * Created by ltemal on 13/03/14.
 */
public class JsonToJava {

    public static List<Movie> convertJsonToMoviesList(String jsonMoviesFilePath){


            try {
                // obtained a file object from json file
                File file = new File(jsonMoviesFilePath);

                // get json as buffer
                BufferedReader br = new BufferedReader(new FileReader(file));


                JsonElement json = new JsonParser().parse(br);
                JsonArray array= json.getAsJsonArray();

                Iterator iterator = array.iterator();

                List<Movie> movies = new ArrayList<Movie>();

                while(iterator.hasNext()){
                    JsonElement json2 = (JsonElement)iterator.next();
                    Gson gson = new Gson();
                    Movie movie = gson.fromJson(json2, Movie.class);

                    movies.add(movie);
                }

                return movies;

            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            return null;
        }

    }

