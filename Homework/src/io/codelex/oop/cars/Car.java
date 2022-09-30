package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    String name;
    String model;
    BigDecimal price;
    int yearOfManufacture;

    EngineType engineType;

    static List<Manufacturer> manufacturers = new ArrayList<>();

    public Car(String name, String model, double price, int yearOfManufacture, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = BigDecimal.valueOf(price);
        this.yearOfManufacture = yearOfManufacture;
        this.engineType = engineType;
    }

    public static void addToList(Manufacturer manufacturer) {
        manufacturers.add(manufacturer);
    }

    public static List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(manufacturers, car.manufacturers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturers);
    }

  }
