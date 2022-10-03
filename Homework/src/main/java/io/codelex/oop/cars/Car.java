package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
      private String name;
      private String model;
      private BigDecimal price;
      private int yearOfManufacture;
      private List<Manufacturer> manufacturers = new ArrayList<>();
      private EngineType engineType;

  public Car(String name, String model, double price, int yearOfManufacture, Manufacturer manufacturers, EngineType engineType) {
    this.name = name;
    this.model = model;
    this.price = BigDecimal.valueOf(price);
    this.yearOfManufacture = yearOfManufacture;
    this.manufacturers.add(manufacturers);
    this.engineType = engineType;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getManufacturers() {
        return this.manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && name.equals(car.name) && model.equals(car.model) && price.equals(car.price) && manufacturers.equals(manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturers, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price + " EUR" +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engineType=" + engineType +
                '}';
    }
}
