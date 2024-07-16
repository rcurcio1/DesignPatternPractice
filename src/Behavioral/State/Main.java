package Behavioral.State;

public class Main {
    public static void main(String[] args) {
        CarContext car = new CarContext(new ParkState());
        car.request();
        car.setState(new ReverseState());
        car.request();
        car.setState(new DriveState());
        car.request();
    }
    
}
