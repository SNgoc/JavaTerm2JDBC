/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session9;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author asus
 */
public class ConnectDB {
    Connection con = null;
    
    public Connection getConnectDB(){//phải viết đúng
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Student_DB";//DB Student_DB
            String user = "sa";
            String pass = "merlin3103";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Successsfull");
        } catch (Exception e) {
            System.out.println("Cannot connect");
        }
        return con;
    }
}
