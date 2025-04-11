import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;

class H {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb?user=root&password=1234");

            String query = "insert into students (name, email, password, college, dob) value (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            System.out.println(ps);

            ps.setString(1, "Jaggu");
            ps.setString(2, "jaggu@dholakpur.com");
            ps.setString(3, "765437");
            ps.setString(4, "Dholakpur Institute");
            ps.setDate(5, new Date(996778888899L));

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println(ps);
            
            int val = ps.executeUpdate();

            if(val == 1) {
                ResultSet rs = ps.getGeneratedKeys();

                if(rs.next()) {
                    System.out.println(rs.getInt(1));
                }
            }

        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    
}
