package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String tittle;
    private boolean inStock = true;
    private float averageRating = 0;
    private int timesRented = 0;
    private int totalRating = 0;

    public Video(String tittle, float averageRating) {
        this.tittle = tittle;
        this.averageRating = averageRating;
    }

    public String getTittle() {
        return tittle;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public boolean isInStock() {
        return inStock;
    }

    public boolean checkOutVideo() {
        if (inStock) {
            this.inStock = false;
            return true;
        }
        return false;
    }

    public boolean returnVideo() {
        if (!inStock) {
            this.inStock = true;
            return true;
        }
        return false;
    }

    public void rateVideo(float rating) {
        this.totalRating += rating;
        this.timesRented++;
        this.averageRating = totalRating / timesRented;
    }

}
