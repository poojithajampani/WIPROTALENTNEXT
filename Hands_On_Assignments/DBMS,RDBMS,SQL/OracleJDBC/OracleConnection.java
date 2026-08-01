import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnection {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";   // Replace with your HR password if it's different

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connection Established successfully");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
