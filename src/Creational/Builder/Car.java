package Creational.Builder;

public class Car {
    private String model;
    private String make;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printCar() {
        System.out.println("Model: " + this.model + "\nMake: " + this.make + "\nYear: " + this.year);
    }
}
