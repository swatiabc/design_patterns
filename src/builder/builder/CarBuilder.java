package builder.builder;

import builder.product.Car;

public class CarBuilder implements BuilderInterface{
    private Car car;

    public CarBuilder() {
        reset();
    }

    @Override
    public void reset ( ) {
        car = new Car();
    }

    @Override
    public int setSeats ( ) {
        return 0;
    }

    @Override
    public int setWheels ( ) {
        return 0;
    }

    @Override
    public boolean setGPS ( ) {
        return false;
    }

    public Car getCar() {
        return car;
    }
}
