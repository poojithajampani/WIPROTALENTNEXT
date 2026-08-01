import java.sql.*;

public class StudentUpdate {

    public static void main(String args[]) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "hr";
        String password = "hr";

        if (args.length != 2) {
            System.out.println("Usage: java StudentUpdate <RollNo> <NewFee>");
            return;
        }

        int rollno = Integer.parseInt(args[0]);
        double fee = Double.parseDouble(args[1]);

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "UPDATE Student SET Fees = ? WHERE RollNo = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, fee);
            ps.setInt(2, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student fee updated successfully.");
            else
                System.out.println("Student not found.");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
