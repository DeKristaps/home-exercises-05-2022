package io.codelex.oop.cars;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarService {

    private ArrayList<Car> carService = new ArrayList<>();

    public CarService() {

    }

    public void addCarToService(Car car) {
        this.carService.add(car);
    }

    public void removeFromService(Car car) {
        this.carService.remove(car);
    }

    public ArrayList<Car> getCarList() {
        return carService;
    }

    public void getCarWithEngineType(EngineType engineType) {
        carService.stream().filter(cars -> cars.getEngineType() == engineType)
                .toList()
                .forEach(System.out::println);
    }

    public void getCarsProducedBefore(int year) {
        carService.stream().filter(cars -> cars.getYearOfManufacture() < year)
                .toList()
                .forEach(System.out::println);
    }

    public void getMostExpensiveCar() {
        String mostExpensive = Collections.max(carService, Comparator.comparing(Car::getPrice)).toString();
        System.out.println(mostExpensive);
    }

    public void getLeastExpensiveCar() {
        String lestExpensive = Collections.min(carService, Comparator.comparing(Car::getPrice)).toString();
        System.out.println(lestExpensive);
    }

    public List<Car> getCarsByManufactures(Manufacturer manufacturer) {
        return carService.stream().filter(car -> car.getManufacturers().contains(manufacturer)).toList();

    }

    public List<Car> getCarsByYearOfEstablishment(String parameter, int year) {
        switch (parameter) {
            case "<" -> {
                return carService.stream().filter(car -> car.getManufacturers().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() < year)).toList();
            }
            case "<=" -> {
                return carService.stream().filter(car -> car.getManufacturers().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() <= year)).toList();
            }
            case ">" -> {
                return carService.stream().filter(car -> car.getManufacturers().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year)).toList();
            }
            case ">=" -> {
                return carService.stream().filter(car -> car.getManufacturers().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() >= year)).toList();
            }
            case "=" -> {
                return carService.stream().filter(car -> car.getManufacturers().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() == year)).toList();
            }
            case "!=" -> {
                return carService.stream().filter(car -> car.getManufacturers().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() != year)).toList();
            }
        }
        return null;
    }



}
