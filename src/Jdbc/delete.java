package Jdbc;

import java.sql.*;

public class delete {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/spark";
        String username="root";
        String password="@Paaro1627";
        String deleteQuery="Delete from students where id=?";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            // creation
            PreparedStatement pr = con.prepareStatement(deleteQuery);
            //execution
            pr.setInt(1,11);
            pr.executeUpdate();
            System.out.println("deleted succesfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }

        }

}
