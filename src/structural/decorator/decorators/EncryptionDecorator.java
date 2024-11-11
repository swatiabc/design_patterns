package structural.decorator.decorators;

import structural.decorator.DataSource;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        System.out.println("writeData EncryptionDecorator: "+data);
        super.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("readData EncryptionDecorator");
        return super.readData();
    }
}
