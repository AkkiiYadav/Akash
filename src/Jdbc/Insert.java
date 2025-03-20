package Jdbc;

import java.sql.*;

public class Insert {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "@Paaro1627";
        String insertQuery= "insert into students(name,age,course) values(?,?,?)";

        try {
            //connecting with driver
            Connection con = DriverManager.getConnection(url, username, password);
            // creation
            PreparedStatement pr = con.prepareStatement(insertQuery);
            pr.setString(1,"Yash");
            pr.setInt(2,19);
            pr.setString(3,"BCA");
            pr.executeUpdate();
            System.out.println("student inserted");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}