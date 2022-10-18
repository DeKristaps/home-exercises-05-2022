package io.codelex.oop.cars;

public class Exercise3 {
    public static void main(String[] args) {
        Manufacturer cadillac = new Manufacturer("Cadillac", 1901, "USA");
        Manufacturer fiat = new Manufacturer("Fiat", 1899, "IT");
        Manufacturer renault = new Manufacturer("Renault", 1898, "FR");
        Manufacturer landRover = new Manufacturer("Land Rover", 1896, "UK");
        Manufacturer skoda = new Manufacturer("Skoda", 1895, "CR");
        Manufacturer mercedesBenz = new Manufacturer("Mercedes-Benz", 1883, "GR");

        Car xt5 = new Car("Cadillac", "XT5", 44.369, 2020, cadillac, EngineType.V6);
        Car xt6 = new Car("Cadillac", "XT6", 50.500, 2021, cadillac, EngineType.V6);
        Car xt7 = new Car("Cadillac", "XT7", 55.000, 2022, cadillac, EngineType.V8);

        Car palio = new Car("Fiat", "Palio", 20.000, 202, fiat, EngineType.S3);
        Car oggi = new Car("Fiat", "Oggi", 15.000, 1993, fiat, EngineType.S3);

        Car clio = new Car("Renault", "Clio", 20.000, 202, renault, EngineType.S3);
        Car megan = new Car("Renault", "Megan", 15.000, 1993, renault, EngineType.S4);

        Car rangeRover = new Car("Land Rover", "Range Rover", 44.369, 2020, landRover, EngineType.V6);
        Car discovery = new Car("Land Rover", "Discovery", 50.500, 2021, landRover, EngineType.V12);
        Car defender = new Car("Land Rover", "Defender", 55.000, 2022, landRover, EngineType.V8);

        Car octavia = new Car("Skoda", "Octavia", 20.000, 2010, skoda, EngineType.S4);

        Car kompresor = new Car("Mercedes-Benz", "Kompresor", 30.000, 2015, mercedesBenz, EngineType.V8);

        CarService beko = new CarService();

        beko.addCarToService(xt6);
        beko.addCarToService(xt5);
        beko.addCarToService(xt7);


        System.out.println(beko.getCarsByManufactures(cadillac));

//        System.out.println(beko.getCarList());
//        beko.getCarWithEngineType(EngineType.V6);
//        beko.getCarsProducedBefore(2021);
//        System.out.println();
//        beko.getMostExpensiveCar();
//        System.out.println();
//        beko.getLeastExpensiveCar();
//        System.out.println();





    }
}
