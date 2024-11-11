package structural.decorator.decorators;

import structural.decorator.DataSource;

public class DecryptionDecorator extends DataSourceDecorator{
    public DecryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        System.out.println("writeData DecryptionDecorator: "+data);
        super.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("readData DecryptionDecorator");
        return super.readData();
    }
}
