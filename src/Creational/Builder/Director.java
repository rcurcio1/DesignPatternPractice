package Creational.Builder;

public class Director {
    public void construct(Builder builder) {
        builder.buildMake();
        builder.buildModel();
        builder.buildYear();
    }
}
