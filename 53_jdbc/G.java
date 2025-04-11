import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class G {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb?user=root&password=1234");

            String query = "select * from students";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println("Student Id: " + rs.getInt("student_id") + " Name: " + rs.getString("name") + " Email: " + rs.getString("email") + " Password: " + rs.getString("password") + " College: " + rs.getString("college") + " Date Of Birth: " + rs.getDate("dob"));
            }

            con.close();
        } catch(ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }    
}
