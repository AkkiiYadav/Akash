package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "@Paaro1627";
        String create = "create table student( id=? auto increment primary key, name=? not null,age=? not null ,course=? ) ";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
             // creation
            PreparedStatement pr = con.prepareStatement(create);
            pr.setInt(1,1);
            pr.setString(2,"akkii");
            pr.setInt(3,20);
            pr.setString(4,"JFS");
            pr.executeUpdate();
         }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
