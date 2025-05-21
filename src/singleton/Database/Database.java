package singleton.Database;

public class Database {

    private static volatile Database instance;
    private static int connections;

    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }

        return instance;
    }

    public void connectionsList() {
        int lokalnaLicz = ++connections;
        System.out.println("Connections to database: " + connections);
    }
}
