import java.sql.*;

public class StudentDelete {

    public static void main(String args[]) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        if (args.length == 0) {
            System.out.println("Please provide Roll Number.");
            return;
        }

        int roll = Integer.parseInt(args[0]);

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            // Read Student Details
            String selectQuery = "SELECT * FROM Student WHERE RollNo=?";

            PreparedStatement ps1 = con.prepareStatement(selectQuery);
            ps1.setInt(1, roll);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {

                String name = rs.getString("StudentName");
                String standard = rs.getString("Standard");

                // Insert into StudentLog
                String insertQuery =
                        "INSERT INTO StudentLog VALUES(?,?,?,?)";

                PreparedStatement ps2 =
                        con.prepareStatement(insertQuery);

                ps2.setInt(1, roll);
                ps2.setString(2, name);
                ps2.setString(3, standard);
                ps2.setDate(4,
                        new java.sql.Date(System.currentTimeMillis()));

                ps2.executeUpdate();

                // Delete from Student table
                String deleteQuery =
                        "DELETE FROM Student WHERE RollNo=?";

                PreparedStatement ps3 =
                        con.prepareStatement(deleteQuery);

                ps3.setInt(1, roll);

                ps3.executeUpdate();

                System.out.println("Student deleted successfully.");

                ps2.close();
                ps3.close();

            } else {

                System.out.println("Student not found.");

            }

            rs.close();
            ps1.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}