/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
import java.sql.*;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/resort_reservation", "root", "");
            s = c.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Include the connector JAR in the project.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection to MySQL failed! Check output console");
            e.printStackTrace();
        }
    }
}

/* 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    Connection c;
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/resort_reservation", "root", "your_password");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return c;
    }
}
*/