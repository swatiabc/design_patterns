package builder.builder;

import builder.product.Manual;

public class ManualBuilder implements BuilderInterface{
    Manual manual;

    public ManualBuilder() {
        reset();
    }

    @Override
    public void reset ( ) {
        manual = new Manual();
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

    public Manual getManual() {
        return manual;
    }
}
