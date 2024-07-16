package Structural.Facade;

public class ViaKeeperImpl implements ViaKeeper {
    @Override
    public int getRoadLength() {
        Road road = new Road();
        int roadLength = road.getLength();
        return roadLength;
    }

    @Override
    public int getStreetLength() {
        Street street = new Street();
        int streetLength = street.getLength();
        return streetLength;
    }

    @Override
    public int getBoulevardLength() {
        Boulevard boulevard = new Boulevard();
        int boulevardLength = boulevard.getLength();
        return boulevardLength;
    }
}
