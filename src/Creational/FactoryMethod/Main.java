package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        BuildingFactory apartmentFactory = new ApartmentFactory();
        BuildingFactory houseFactory = new HouseFactory();
        Building apartment = apartmentFactory.createBuilding();
        Building house = houseFactory.createBuilding();
        apartment.printBuilding();
        house.printBuilding();
    }
}
