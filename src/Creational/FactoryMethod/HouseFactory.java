package Creational.FactoryMethod;

public class HouseFactory implements BuildingFactory {
    @Override
    public Building createBuilding() {
        return new House();
    }
}
