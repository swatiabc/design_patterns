package builder.builder;

import builder.product.Car;

public interface BuilderInterface{
    void reset();
    int setSeats();
    int setWheels();
    boolean setGPS();
}
