package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Builder celicaBuilder = new CelicaBuilder();
        Director director = new Director();
        director.construct(celicaBuilder);
        Car celica = celicaBuilder.getResult();
        celica.printCar();
    }
}
