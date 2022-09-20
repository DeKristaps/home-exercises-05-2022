package io.codelex.classesandobjects.practice;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royal", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");

        Movie[] movies = {movie1, movie2, movie3};

        Movie[] out = Movie.getPG(movies);

        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i].title.toString());
        }


    }
}
