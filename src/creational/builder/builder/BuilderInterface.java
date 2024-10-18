package creational.builder.builder;

import creational.builder.product.Car;

public interface BuilderInterface{
    void reset();
    int setSeats();
    int setWheels();
    boolean setGPS();
}
