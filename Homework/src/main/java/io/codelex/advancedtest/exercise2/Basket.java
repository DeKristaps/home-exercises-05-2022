package io.codelex.advancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public void addToBasket(T item) throws BasketFullException {
        if (basket.size() <= 10) {
            basket.add(item);
        } else {
            throw new BasketFullException("The basket is full");
        }

    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (basket.size() >= 1) {
            basket.remove(item);
        } else {
            throw new BasketEmptyException("The basket is empty");
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                '}';
    }
}
