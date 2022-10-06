package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner userInput = new Scanner(System.in);
        boolean running = true;
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> text = Files.readAllLines(path, charset);

        Map<String, List<String>> travelMap = getMap(text);

        while (running) {
            System.out.println("What would you like to do: ");
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit program press #");
            String choice = userInput.nextLine();

            switch (choice) {
                case "#":
                    running = false;
                    break;
                case "1":
                    System.out.println("Cities to start form are: " + getCities(text));
                    String userChoice = userInput.nextLine();

                    if (travelMap.containsKey(userChoice)) {
                        String pointZero = userChoice;
                        String flightPath = "";
                        List<String> startingPoint = travelMap.get(userChoice);
                        System.out.println("From this point you can go to: " + startingPoint);
                        System.out.println("Chose where you want to travel to");
                        String destination = userInput.nextLine();
                        flightPath += pointZero + " -> " + destination;

                        while (!pointZero.equals(destination)) {
                            startingPoint = travelMap.get(destination);
                            System.out.println("From this point you can go to: " + startingPoint);
                            destination = userInput.nextLine();
                            flightPath += " -> " + destination;
                        }

                        System.out.println("Round trip. The path you tok is : " + flightPath);

                    }
            }
        }
    }

    public static Map<String, List<String>> getMap(List<String> text) {
        Map<String, List<String>> travelMap = new HashMap<>();
        List<String> destinationList = new ArrayList<>();
        String tempOrigin = "";

        for (String entry : text) {
            String[] splitEntry = entry.split("->");
            String origin = splitEntry[0].trim();
            String destination = splitEntry[1].trim();

            if (tempOrigin.equals("")) {
                tempOrigin = origin;
            }

            if (origin.equals(tempOrigin)) {
                destinationList.add(destination);
            } else {
                travelMap.put(tempOrigin, destinationList);
                tempOrigin = origin;
                destinationList = new ArrayList<>();
                destinationList.add(destination);
            }
        }
        travelMap.put(tempOrigin, destinationList);
        return travelMap;
    }

    public static HashSet<String> getCities(List<String> text) {
        HashSet<String> cities = new HashSet<>();
        for (String entry : text) {
            String[] splitEntry = entry.split("->");
            String origin = splitEntry[0].trim();
            cities.add(origin);
        }
        return cities;
    }
}