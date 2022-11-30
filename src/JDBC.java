import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  Provided database connector class that includes methods to connect to the database and make statements.
 */
public class JDBC {
    private static final String protocol = "jdbc";
    private static final String vendor = ":mysql:";
    private static final String location = "//localhost:3306/";
    private static final String databaseName = "client_schedule";
    private static final String jdbcUrl = protocol + vendor + location + databaseName + "?connectionTimeZone = SERVER"; // LOCAL
    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Driver reference
    private static final String userName = "sqlUser"; // sqlUser
    private static String password = "Passw0rd!"; // Passw0rd!
    private static Connection connection = null;  // Connection Interface
    private static PreparedStatement preparedStatement;

    public static void makeConnection() {

        try {
            Class.forName(driver); // Locate Driver
            //password = "Passw0rd!"; // Assign password
            connection = DriverManager.getConnection(jdbcUrl, userName, password); // reference Connection object
            System.out.println("Connection successful!");
        }
        catch(ClassNotFoundException e) {
            System.out.println("Error:" + e.getMessage());
        }
        catch(SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static Connection getConnection() {
        return connection;
    }
    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void makePreparedStatement(String sqlStatement, Connection conn) throws SQLException {
        if (conn != null)
            preparedStatement = conn.prepareStatement(sqlStatement);
        else
            System.out.println("Prepared Statement Creation Failed!");
    }
    public static PreparedStatement getPreparedStatement() throws SQLException {
        if (preparedStatement != null)
            return preparedStatement;
        else System.out.println("Null reference to Prepared Statement");
        return null;
    }
}

