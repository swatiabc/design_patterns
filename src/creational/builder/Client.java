package creational.builder;

import creational.builder.builder.CarBuilder;
import creational.builder.builder.ManualBuilder;
import creational.builder.director.Director;
import creational.builder.product.Car;
import creational.builder.product.Manual;

public class Client{

    public void main() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        carBuilder = (CarBuilder) director.constructSportsCar(carBuilder);
        Car car = carBuilder.getCar();

        ManualBuilder manualBuilder = new ManualBuilder();

        manualBuilder = (ManualBuilder) director.constructSUV(manualBuilder);
        Manual manual = manualBuilder.getManual();

    }

}
