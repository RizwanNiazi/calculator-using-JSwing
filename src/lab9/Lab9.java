package lab9;

import java.sql.*;

/**
 *
 * @author l134088
 */
public class Lab9 {
    public static void main(String[] args) {
        /*Connection con = null;
        Statement st = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Lab9", "player", "123456");
            System.out.println("Connection Established");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }*/
        
        Calculator cal = new Calculator();
        cal.setVisible(true);
    }
}
