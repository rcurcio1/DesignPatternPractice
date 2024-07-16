package Behavioral.State;

public class ReverseState implements CarState {
    @Override
    public void handleRequest() {
        System.out.println("Car moves backwards");
    }
}
