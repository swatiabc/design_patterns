package creational.builder.director;

import creational.builder.builder.BuilderInterface;

public class Director{
    public BuilderInterface constructSportsCar(BuilderInterface builderInterface) {
        builderInterface.reset();
        builderInterface.setGPS();
        builderInterface.setSeats();
        builderInterface.setWheels();
        return builderInterface;
    }

    public BuilderInterface constructSUV(BuilderInterface builderInterface) {
        builderInterface.reset();
        builderInterface.setWheels();
        builderInterface.setSeats();
        builderInterface.setGPS();
        return builderInterface;
    }
}
