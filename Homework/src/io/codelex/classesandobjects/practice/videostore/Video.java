package io.codelex.classesandobjects.practice.videostore;

public class Video {
    String title;
    boolean checkedOut;
    float averageRating;
    int numberOfRates = 0;
    float totalRating;

    public Video(String title, float averageRating) {
        this.title = title;
        this.averageRating = averageRating;
        this.checkedOut = false;
        this.numberOfRates++;
        this.totalRating = averageRating;

    }

    public static void checkOut(Video movie) {
        movie.checkedOut = true;
    }

    public static void returned(Video movie) {
        movie.checkedOut = false;
    }

    public static void rate(Video movie, float rating){
        movie.numberOfRates++;
        movie.totalRating+= rating;
        movie.averageRating = movie.totalRating / movie.numberOfRates;
    }


}
