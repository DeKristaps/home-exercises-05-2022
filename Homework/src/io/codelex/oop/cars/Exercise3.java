package io.codelex.oop.cars;

public class Exercise3 {
    public static void main(String[] args) {
        Manufacturer subaru = new Manufacturer("Subaru", 1990,"Japan");
        Car impreza = new Car ("Subaru", "Impreza", 999.99, 1993, EngineType.V8);

        System.out.println(subaru.name.equals(impreza.name));

        Car.addToList(subaru);






    }
}
