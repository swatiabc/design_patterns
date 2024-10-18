package creational.singleton;

public class Client {
    public void main() {
        Database database = Database.getInstance();
        database.query("dfwd");
        Database database1 = Database.getInstance();
        database1.query("scvs");
    }
}
