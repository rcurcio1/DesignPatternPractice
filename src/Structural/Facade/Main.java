package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        ViaKeeper viaKeeper = new ViaKeeperImpl();
        int streetLength = viaKeeper.getStreetLength();
        int boulevardLength = viaKeeper.getBoulevardLength();
        int roadLength = viaKeeper.getRoadLength();
        System.out.println("Street length: " + streetLength);
        System.out.println("Road length: " + roadLength);
        System.out.println("Boulevard length: " + boulevardLength);
    }    
}
