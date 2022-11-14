package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> stock = new ArrayList<>();

    public void addNewVideo(String title, float rating) {
        stock.add(new Video(title, rating));
    }

    private Video findVideo(String title) {
        for (Video video : stock) {
            if (video.getTittle().equals(title)) {
                return video;
            }
        }
        return null;
    }

    public boolean checkOutVideo(String title) {
        Video video = findVideo(title);
        if (video != null) {
            return video.checkOutVideo();
        }
        return false;
    }

    public boolean returnVideo(String title) {
        Video video = findVideo(title);
        if (video != null) {
            return video.returnVideo();
        }
        return false;
    }

    public void rateVideo(String title, float rating) {
        Video video = findVideo(title);
        if (video != null) {
            video.rateVideo(rating);
        }
    }

    public void listStock() {
        if (stock.size() < 1) {
            System.out.println("Sorry but we dont have anything in stock right now.");
        } else {
            System.out.println("Right now in stock we have: ");
            for (int i = 0; i < stock.size(); i++) {
                if (stock.get(i).isInStock()) {
                    System.out.println(stock.get(i).getTittle() + " With a rating of " + stock.get(i).getAverageRating());
                }
            }
            System.out.println("These titles should be returned soon: ");
            for (int i = 0; i < stock.size(); i++) {
                if (!stock.get(i).isInStock()) {
                    System.out.println(stock.get(i).getTittle() + " With a rating of " + stock.get(i).getAverageRating());
                }
            }
        }
    }
}

