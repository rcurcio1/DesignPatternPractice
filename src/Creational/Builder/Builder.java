package Creational.Builder;

public interface Builder {
    void buildMake();
    void buildModel();
    void buildYear();
    Car getResult();
}
