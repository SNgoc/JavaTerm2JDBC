/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class ConnectDB {
    public Connection getConnectDB() throws SQLException{//tạo phương thức để connect DB
        Connection con = null;
        try {
            //dang ky ddriver loai 4
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //tạo chuỗi url và user, pass
            String user = "sa";
            String pass = "merlin3103";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Students";//DB Book
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println("Can't connect");
            e.printStackTrace();//sử dụng code này ko cần throw exception
        }
        return con;//trả về giá trị con là dòng code để connect DB (không được dùng đóng connect trước return vì sẽ lỗi)
    }
}
