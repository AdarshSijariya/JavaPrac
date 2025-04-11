import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.io.Console;

class D {
    public static void main(String[] args) {
        Console cn = System.console();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb?user=root&password=1234");
            
            String query = "update students set name=?,email=?,password=?,college=? where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Student Name: ");
            ps.setString(1, cn.readLine());
            System.out.print("Student Email: ");
            ps.setString(2, cn.readLine());
            System.out.print("Student Password: ");
            ps.setString(3, cn.readLine());
            System.out.print("Student College: ");
            ps.setString(4, cn.readLine());

            System.out.println("Enter Student Id: ");
            ps.setInt(5, Integer.parseInt(cn.readLine()));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

            int val = ps.executeUpdate();

            System.out.println(val);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}