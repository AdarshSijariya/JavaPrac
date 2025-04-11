import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb?user=root&password=1234");
            
            String query = "insert into students (name,email,password,college) value (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter Student Name: ");
            ps.setString(1, sc.nextLine());
            System.out.print("Enter Student Email: ");
            ps.setString(2, sc.nextLine());
            System.out.print("Enter Student Password: ");
            ps.setString(3, sc.nextLine());
            System.out.print("Enter Student College: ");
            ps.setString(4, sc.nextLine());
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

            int val = ps.executeUpdate();

            System.out.println(val);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}