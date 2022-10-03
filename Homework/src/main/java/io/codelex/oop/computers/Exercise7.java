package io.codelex.oop.computers;

public class Exercise7 {
    public static void main(String[] args) {
        Computer computer = new Computer("i5","Vengace 3500mhz 16gb", "GTX 4090", "Asus", "ROG Zepherus");
        Computer computer1 = new Computer("i9", "Vengace 3500mhz 16gb", "GTX 4070", "Asus", "ROG Zday");
        Laptop laptop = new Laptop("i3","Crucial 16 ddr4", "GTX 2060 Super", "Lenovo", "IDK", "60mgw/h");

        System.out.println(computer.equals(computer1));
        System.out.println(computer);
        System.out.println(laptop.getCompany());



    }
}
