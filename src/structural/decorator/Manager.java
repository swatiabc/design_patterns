package structural.decorator;

public class Manager {
    DataSource dataSource;

    Manager(DataSource source) {
        dataSource=source;
    }

    public void write(String data) {
        dataSource.writeData(data);
    }

    public String read() {
        return dataSource.readData();
    }
}
