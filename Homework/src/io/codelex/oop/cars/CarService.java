package io.codelex.oop.cars;


import java.util.List;

public class CarService {
    List<Car> cars;

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public void addToCarService(Car car){
        this.cars.add(car);
    }

    public void removeForList(Car car){
        if (cars.contains(car)){
            cars.remove(car);
        } else {
            System.out.println("No car like that in the list");
        }
    }

    public List<Car> getCars(){
        return cars;
    }

    public List<Car> getByEngine(EngineType engineType){

    }

}
