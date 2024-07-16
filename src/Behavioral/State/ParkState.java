package Behavioral.State;

public class ParkState implements CarState {
    @Override
    public void handleRequest() {
        System.out.println("Car does not move");
    }
}