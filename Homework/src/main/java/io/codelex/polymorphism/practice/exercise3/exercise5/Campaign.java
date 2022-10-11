package io.codelex.polymorphism.practice.exercise3.exercise5;

import java.util.ArrayList;

public class Campaign {
    private ArrayList<Advert> campaign;

    public Campaign() {
        campaign = new ArrayList<>();
    }

    public void addAdvert(Advert a) {
        campaign.add(a);
    }

    public int getCost() {
        return campaign.stream()
                .mapToInt(Advert::cost)
                .sum();
    }

    public String toString() {
        return "Advert Campaign" + campaign + "\nTotal Cost = " + getCost();
    }
}
