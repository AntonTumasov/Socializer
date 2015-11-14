package model.jdbc_classes;

import model.User;
import play.db.DB;
import java.sql.*;

public class JDBCUsers {
    private static Connection con;
    private static final String tableName = "users";

    public static User findUser(String username) {
        con = DB.getConnection();
        try {
            ResultSet rs;
            User user = new User();
            PreparedStatement stmt = con.prepareStatement("SELECT login, pass FROM " + tableName + " WHERE login=?");

            stmt.setString(1, username);

            rs = stmt.executeQuery();

            //TODO rewrite with ORM using
            rs.next();

            user.login = rs.getString("login");
            user.password = rs.getString("pass");

            con.close();

            return user;

        } catch( SQLException e ) {
            return null;
        }
    }

    public static void addUser(String login, String password) throws SQLException {
        con = DB.getConnection();

        PreparedStatement stmt = con.prepareStatement("INSERT INTO " + tableName + " VALUES (?,?)");

        stmt.setString(1,login);
        stmt.setString(2,password);

        stmt.executeUpdate();

        con.close();
    }
}
