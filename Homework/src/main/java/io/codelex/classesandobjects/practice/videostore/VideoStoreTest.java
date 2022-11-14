package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static VideoStore videoStore = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to see Stock");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    videoStore.listStock();
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating out of 10");
            float rating = scanner.nextFloat();

            videoStore.addNewVideo(movieName, rating);

        }
    }


    private static void rentVideo(Scanner scanner) {
        System.out.println("Please enter the title of the video");
        String title = scanner.next();
        if (videoStore.checkOutVideo(title)) {
            System.out.println("Here's your video. Have a nice day!");
        } else {
            System.out.println("Sorry we dont have that in stock right now.");
        }

    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Please enter the title of the video");
        String title = scanner.next();
        if (videoStore.returnVideo(title)) {
            System.out.println("Yea, that's one of ours.");
            System.out.println("Could you please leave us a rating?");
            float rating = scanner.nextFloat();
            videoStore.rateVideo(title, rating);
        } else {
            System.out.println("Sorry, that's not one of ours.");
        }


    }
}
