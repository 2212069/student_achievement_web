import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:derby://localhost:1527/mydatabse"; // Update with your database URL
        String user = "app"; // Update with your database username
        String password ="app"; // Update with your database password
        return DriverManager.getConnection(url, user, password);
    }
}
