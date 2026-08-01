import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentInsert {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO student VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            // Record 1
            ps.setInt(1, 1001);
            ps.setString(2, "RAHUL");
            ps.setString(3, "X");
            ps.setDate(4, java.sql.Date.valueOf("2010-05-12"));
            ps.setDouble(5, 25000);

            ps.executeUpdate();

            // Record 2
            ps.setInt(1, 1002);
            ps.setString(2, "SNEHA");
            ps.setString(3, "IX");
            ps.setDate(4, java.sql.Date.valueOf("2011-08-20"));
            ps.setDouble(5, 22000);

            ps.executeUpdate();

            // Record 3
            ps.setInt(1, 1003);
            ps.setString(2, "ARJUN");
            ps.setString(3, "VIII");
            ps.setDate(4, java.sql.Date.valueOf("2012-03-15"));
            ps.setDouble(5, 20000);

            ps.executeUpdate();

            System.out.println("Records inserted successfully.");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error while inserting records.");
            System.out.println(e);
        }
    }
}
