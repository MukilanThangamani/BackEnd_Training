package day12;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysql1 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo1";
        String username = "root";
        String password = "Mukilan@2003";
        String query = "SELECT * FROM emp1";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println("Stud ID:" + rs.getInt(1));
                System.out.println("Stud Name :" + rs.getString(2));
                System.out.println("Stud Mark :" + rs.getInt(3));
            }
            con.close();
        } catch (Exception e) {
        }
    }
}


