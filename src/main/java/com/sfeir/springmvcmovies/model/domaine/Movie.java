package com.sfeir.springmvcmovies.model.domaine;

import java.util.Date;


/**
 * Created by ltemal on 13/03/14.
 */


public class Movie {


    private  int id;
    private String title;
    private String category;
    private int releaseYear;
    private String poster ;
    private String directors;
    private String actors;
    private String synopsis;
    private int rate;
    private Date lastViewDate;
    private float price;


    public Movie() {

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPoster(String poster){
        this.poster = poster;
    }
    public String getPoster(){
        return this.poster;

    }

    public String getDirectors() {
        return directors;
    }
    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getActors() {
        return actors;
    }
    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;

    }

    public void setLastViewDate(Date lastViewDate){
        this.lastViewDate = lastViewDate;
    }
    public Date getLastViewDate(){
     return this.lastViewDate;
    }

    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return this.price;
    }
}




