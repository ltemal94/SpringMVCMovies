package com.sfeir.springmvcmovies.model.domaine;

import com.sfeir.springmvcmovies.model.domaine.util.JsonToJava;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by ltemal on 13/03/14.
 */
public class JsonToJavaTest {


    @Test
    public void shouldReturnRightNumber(){

        List<Movie> movies = JsonToJava.convertJsonToMoviesList("file:src/main/resources/movies.json");

        assertTrue("the size movies file is exact", movies.size() == 9);

    }
}
