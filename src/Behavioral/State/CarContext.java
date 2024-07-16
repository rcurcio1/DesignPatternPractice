package Behavioral.State;

public class CarContext {
    private CarState state;

    public CarContext(CarState state) {
        this.state = state;
    }

    public void setState(CarState state) {
        this.state = state;
    }

    public void request() {
        this.state.handleRequest();
    }
}
