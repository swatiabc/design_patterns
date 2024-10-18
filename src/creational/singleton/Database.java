package creational.singleton;


public class Database {
    private static Database database;

    private Database() {

    }

    public static Database getInstance() {
        if (Database.database == null) {
            Database.database = new Database();
        }
        return Database.database;
    }

    public String query(String sql) {
        return sql;
    }
}
