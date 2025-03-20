package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetchstudents{
    public static void main(String[] args) {

       String url="jdbc:mysql://localhost:3306/spark";
       String username="root";
       String password="@Paaro1627";
       String query="select * from students";

       try
       {
           Connection con= DriverManager.getConnection(url,username,password);
          // creation
           Statement stmt=con.createStatement();
           //execution
           ResultSet rs = stmt.executeQuery(query);
           System.out.println("id | Name |  Age  |  Course");
           System.out.println("------------------------------");
           //Display
           while(rs.next()){
               System.out.println(rs.getInt("id")+" | "+
                       rs.getString("Name")+" | "+
                       rs.getInt("Age")+" | "+
                       rs.getString("Course")+" | ");

           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }

    }
}
