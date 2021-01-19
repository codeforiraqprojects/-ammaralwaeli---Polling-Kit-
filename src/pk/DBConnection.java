package pk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {

    public static Connection connect() throws ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:DB\\Voting.db");
            //JOptionPane.showMessageDialog(null, "Connection to SQLite has been established.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+"ss");
        }
        return conn;
    }
}
