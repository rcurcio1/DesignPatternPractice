package Creational.FactoryMethod;

public class ApartmentFactory implements BuildingFactory {
    @Override
    public Building createBuilding() {
        return new Apartment();
    }
}
