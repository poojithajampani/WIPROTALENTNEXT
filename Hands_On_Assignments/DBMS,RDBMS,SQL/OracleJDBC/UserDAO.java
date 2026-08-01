import java.sql.*;

public class UserDAO {

    public String getUserType(String userID) {

        String userType = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT UserType FROM Users WHERE UserID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                userType = rs.getString("UserType");

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

        return userType;

    }

}
