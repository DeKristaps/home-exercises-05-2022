package io.codelex.oop.cars;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public void getCarWithEngineType(EngineType engineType){
        carService.stream().filter(cars -> cars.getEngineType() == engineType)
                .toList()
                .forEach(System.out::println);
    }

    public void getCarsProducedBefore(int year){
        carService.stream().filter(cars -> cars.getYearOfManufacture() < year)
                .toList()
                .forEach(System.out::println);
    }

    public void getMostExpensiveCar(){
        String mostExpensive = Collections.max(carService, Comparator.comparing(Car::getPrice)).toString();
        System.out.println(mostExpensive);
    }

    public void getLeastExpensiveCar(){
        String lestExpensive = Collections.min(carService, Comparator.comparing(Car::getPrice)).toString();
        System.out.println(lestExpensive);
    }

    public void getCarsByManufactures(){

    }

//    public ArrayList<Car> getInOrder(String order){
//        //return getCarList().stream().sorted(order);
//    }





}
