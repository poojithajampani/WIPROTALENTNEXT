import java.sql.*;

public class StudentDisplay {

    public static void main(String args[]) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps;

            if (args.length == 0) {

                ps = con.prepareStatement("SELECT * FROM Student");

            } else {

                ps = con.prepareStatement("SELECT * FROM Student WHERE RollNo = ?");
                ps.setInt(1, Integer.parseInt(args[0]));

            }

            ResultSet rs = ps.executeQuery();

            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-8s %-20s %-10s %-15s %-10s%n",
                    "RollNo", "StudentName", "Standard", "DOB", "Fees");
            System.out.println("---------------------------------------------------------------");

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.printf("%-8d %-20s %-10s %-15s %-10.2f%n",
                        rs.getInt("RollNo"),
                        rs.getString("StudentName"),
                        rs.getString("Standard"),
                        rs.getDate("Date_Of_Birth"),
                        rs.getDouble("Fees"));
            }

            if (!found) {
                System.out.println("No student record found.");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
