package structural.decorator;

public class FileDataSource implements DataSource{
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        System.out.println("writeData FileDataSource: "+data);
    }

    @Override
    public String readData() {
        return "readData FileDataSource"+name;
    }
}
