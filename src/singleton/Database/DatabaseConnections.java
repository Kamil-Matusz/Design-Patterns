package singleton.Database;

public class DatabaseConnections {

    private DatabaseConnections() {
        Database conn = Database.getInstance();
        conn.connectionsList();

    }

    public static void main(String argv[]) {
        new DatabaseConnections();
        new DatabaseConnections();
    }
}
