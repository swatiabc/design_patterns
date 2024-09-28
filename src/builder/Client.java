package builder;

import builder.builder.CarBuilder;
import builder.builder.ManualBuilder;
import builder.director.Director;
import builder.product.Car;
import builder.product.Manual;

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
