package structural.decorator;

import structural.decorator.decorators.DataSourceDecorator;
import structural.decorator.decorators.DecryptionDecorator;
import structural.decorator.decorators.EncryptionDecorator;

public class Client {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("swati");
        source = new DecryptionDecorator(source);
        source = new EncryptionDecorator(source);

        Manager manager = new Manager(source);
        manager.write("swati");
        manager.read();

    }
}
