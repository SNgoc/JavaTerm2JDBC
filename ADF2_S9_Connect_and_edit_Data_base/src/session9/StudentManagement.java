/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;// get data from table 'tbStudent'
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class StudentManagement {

    //khai báo các phương thức để dùng cho Student_DB
    static ConnectDB connect = new ConnectDB();
    static Connection cn = null;
    static Scanner sc;
    static Statement st = null;
    static PreparedStatement pst = null;//thực thi câu truy vấn query
    static ResultSet rs = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        sc = new Scanner(System.in);
        char opt = '0';
        do {            
            System.out.println("Nhap lua chon");
            System.out.println("1.Them vao db");
            System.out.println("2.Xem ds trong db");
            System.out.println("3.Sua db");
            System.out.println("4.Xoa db");
            System.out.println("5.Tim kiem trong db");
            System.out.println("6.Exit");
            opt = sc.nextLine().charAt(0);
            switch(opt){
                case '1':
                    insertDB();
                    break;
                case '2':
                    listDB();
                    break;
                case '3':
                    editDB();
                    break;
                case '4':
                    removeDB();
                    break;
                case '5':
                    searchDB();
                    break;
               case '6':
                    break;
               default:
                   System.out.println("Wrong input");
                   break;
            }
        } while (opt != '6');
    }

    //insert
    static void insertDB() throws SQLException {
        String sql = "INSERT INTO tbStudent (StudentID, StudentName, dob) VALUES (?,?,?)";//? là nơi truyền value vào (Tên cột phải giống trong Student_DB)
        
        System.out.println("Nhap id:");
        String id = sc.nextLine().trim();
        System.out.println("Nhap ten:");
        String name = sc.nextLine().trim();
        System.out.println("Nhap dob:");
        String dob = sc.nextLine().trim();
        
        //tạo kết nối với DB
        cn = connect.getConnectDB();
        pst = cn.prepareStatement(sql);
        
        //truyen parameters id, name, dob khi input vào
        pst.setString(1, id);//id là kiêu string nên sử dụng kiểu string
        pst.setString(2, name);//name là kiêu string nên sử dụng kiểu string
        pst.setDate(3, java.sql.Date.valueOf(dob));//do dob là date nên phải sử dụng kiểu date
        
        //insert
        int result = pst.executeUpdate();//trả về dòng
        if (result > 0) {
            System.out.println("Added success");
        }
        else{
            System.out.println("Add failed");
        }
        
        //đóng kết nối
        pst.close();
        cn.close();
    }

    //list
    static void listDB() throws SQLException {
        String sql = "SELECT * FROM tbStudent";//phải đúng tên table của db
        cn = connect.getConnectDB();//tạo kết nối
        st = cn.createStatement();//tạo statement
        rs = st.executeQuery(sql);//thực thi câu lệnh select * from tbStudent ở trên (truy vấn)
        //display
        while (rs.next()) {            
            System.out.println("ID: " + rs.getString(1) + " Name: " + rs.getString(2) + " DOB: " + rs.getString(3));//theo thứ tự cột tạo trong Student_DB (có 3 cột)
        }
        cn.close();//đóng kết nối
        st.close();//đóng kết nối
    }

    static void editDB() throws SQLException {
        String sql = "UPDATE tbStudent SET StudentName = ?, dob = ? WHERE StudentID = ?";//? 1 là StudentName, ? 2 là dob, ? 3 là StudentID
        //tạo kết nối
        cn = connect.getConnectDB();
        pst = cn.prepareStatement(sql);
        
        System.out.println("Nhap ten:");
        String name = sc.nextLine().trim();
        System.out.println("Nhap dob:");//dob phải phù hợp sao cho age > 18 vì trigger yêu cầu, nếu không có dob thì sẽ lỗi trigger age đã tạo
        String dob = sc.nextLine().trim();
        System.out.println("Nhap id:");
        String id = sc.nextLine().trim();
        
        pst.setString(1, name);
        pst.setString(2, dob);
        pst.setString(3, id);
        
        //edit
        int result = pst.executeUpdate();//trả về số dòng update
        if (result > 0) {
            System.out.println("Edited success");
        }
        else{
            System.out.println("Edited failed");
        }
        
        //đóng kết nối
        cn.close();
        pst.close();
    }

    static void removeDB() throws SQLException {
        String sql = "DELETE FROM tbStudent WHERE StudentID = ?";
        //tạo kết nối
        cn = connect.getConnectDB();
        pst = cn.prepareStatement(sql);

        System.out.println("Nhap id:");
        String id = sc.nextLine().trim();

        pst.setString(1, id);
        
        //delete
        int result = pst.executeUpdate();//trả về số dòng update
        if (result > 0) {
            System.out.println("Deleted success");
        }
        else{
            System.out.println("Deleted failed");
        }
        
        //đóng kết nối
        cn.close();
        pst.close();
    }

    static void searchDB() throws SQLException {
        String sql = "SELECT * FROM tbStudent WHERE StudentName = ?";
        //tạo kết nối
        cn = connect.getConnectDB();
        pst = cn.prepareStatement(sql);

        System.out.println("Nhap name to search:");
        String name = sc.nextLine().trim();

        pst.setString(1, name);
        rs = pst.executeQuery();
        
        //search
        if (!rs.next()) {//next lần 1
            System.out.println("Can't find");
        }
        else{
            do {                
                System.out.println("ID: " + rs.getString(1) + " Name: " + rs.getString(2) + " DOB: " + rs.getString(3));//theo thứ tự cột tạo trong Student_DB (có 3 cột)
            } while (rs.next());//dùng do..while ko dùng while(rs.next) vì sẽ bị mất 1 dòng dữ liệu vì rs.next sẽ thực thi trước và bỏ qua 1 dòng khi dùng while(rs.next())
        }
        
        //đóng kết nối
        cn.close();
        pst.close();
    }
    
}
