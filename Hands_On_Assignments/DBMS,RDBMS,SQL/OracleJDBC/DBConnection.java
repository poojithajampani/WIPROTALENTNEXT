import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
            String username = "hr";
            String password = "hr";

            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {

            System.out.println(e);

        }

        return con;

    }

}
