package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "@Paaro1627";
        String update = " Update students set name=?,age=?,course=? where id=4";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            // creation
            PreparedStatement pr = con.prepareStatement(update);
            pr.setString(1, "Paaro");
            pr.setInt(2, 21);
            pr.setString(3, "BA");
            pr.executeUpdate();
            System.out.println("updaated sucessfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

