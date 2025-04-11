import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.io.Console;

class E {
    public static void main(String[] args) {
        Console cn = System.console();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb?user=root&password=1234");
            
            String query = "delete from students where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter Student Id: ");
            ps.setInt(1, Integer.parseInt(cn.readLine()));
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

            int val = ps.executeUpdate();

            System.out.println(val);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}