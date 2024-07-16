package Creational.Builder;

public class CelicaBuilder implements Builder {
    private Car car;
    
    public CelicaBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildMake() {
        this.car.setMake("Toyota");
    }

    @Override
    public void buildModel() {
        this.car.setModel("Celica");
    }

    @Override
    public void buildYear() {
        this.car.setYear(1988);
    }

    @Override
    public Car getResult() {
        return this.car;
    }
    
}
