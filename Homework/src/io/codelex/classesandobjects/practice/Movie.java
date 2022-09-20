package io.codelex.classesandobjects.practice;

import java.util.Arrays;
import java.util.Objects;

public class Movie {
    String title;
    String studio;
    String rating;

    Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] Movie) {
        int arrSize = 0;
        for (int i = 0; i < Movie.length; i++) {
            if (Movie[i].rating.equals("PG")){
                arrSize++;
            }
        }
        Movie[] moviesPG = new Movie[arrSize];
        int indexCounter = 0;
        for (int i = 0; i < Movie.length; i++) {
            if (Movie[i].rating.equals("PG")){
                moviesPG[indexCounter] = Movie[i];
                indexCounter++;
                }
            }
        return moviesPG;
    }
}
