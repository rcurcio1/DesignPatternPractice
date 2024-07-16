package Behavioral.State;

public class DriveState implements CarState {
    @Override
    public void handleRequest() {
        System.out.println("Car moves forwards");
    }
}