/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_1DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class TestStudent {

    //khai báo các phương thức để dùng cho CollegeABC
    static ConnectDB connect = new ConnectDB();
    static Connection con = null;
    static Scanner sc;
    static Statement st = null;//Tạo một đối tượng Statement được sử dụng để thực thi các câu truy vấn SQL.(thường chỉ nên dùng để create, drop. alter table vì perform kém)
    static PreparedStatement pst = null;//thực thi câu truy vấn query (có thể dùng lệnh này, không cần lệnh statement)
    static ResultSet rs = null;//get data from Student
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        TestStudent test = new TestStudent();
        test.menu();
    }
    
    void menu() throws SQLException{
        Scanner sc = new Scanner(System.in);
        int opt;
        do {            
            System.out.println("Nhap lua chon");
            System.out.println("1.Create a new student");
            System.out.println("2.Show all");
            System.out.println("3.Delete");
            System.out.println("4.Exit");
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    createStudent();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    System.out.print("Input id to delete:");
                    int id = sc.nextInt();
                    delete(id);
                    break;
                case 4:
                    System.out.println("Exit!!!");
                    break;
               default:
                   System.out.println("Wrong input");
                   break;
            }
        } while (opt != 4);
    }
    
    void createStudent(){
        //tạo query insert
        String sql = "INSERT INTO dbo.Student (studentName,address,email) VALUES (?,?,?)";
        //tạo obj để input data
        Students std = new Students();
        std.inputStudent();
        
        try {
            //tạo kết nối tới CollegeABC 
            con = connect.getConnectDB();
            // create statement to insert data to table tbEmployee
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để insert
            pst.setString(1, std.getName());
            pst.setString(2, std.getAdddress());
            pst.setString(3, std.getEmail());

            int result = pst.executeUpdate();//thực thi query để insert (trả về số dòng đã được updated)
            if (result > 0) {
                System.out.println("Added success");
            }
            else{
                System.out.println("Add failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                //đóng kết nối
                pst.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    void showAll(){
        //tạo câu truy vấn
        String sqlAll = "SELECT * FROM dbo.Student";
        //tạo 1 list để add vào student (nên dùng)
        List<Students> result = new ArrayList<>();
        try {
            //tạo kết nối tới CollegeABC 
            con = connect.getConnectDB();
            // create statement to insert data to table
            pst = con.prepareStatement(sqlAll);
            rs = pst.executeQuery();//get data from Student
            
            // show data
            while (rs.next()) {//được sử dụng để di chuyển con trỏ đến một hàng tiếp theo từ vị trí hiện tại.
            ///theo thứ tự cột tạo
                Students s = new Students();//tạo obj để add vào list
                s.setId(rs.getInt(1));//id
                s.setName(rs.getString(2));//name
                s.setAdddress(rs.getString(3));//address
                s.setEmail(rs.getString(4));//email
                result.add(s);//add obj s vào list result
            }
            //check database is empty
            if (result.isEmpty()) {
                System.out.println("No data");
                return;
            }
            //print list student theo kiểu toString()
            for (Students students : result) {
                System.out.println(students);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                //đóng kết nối
                pst.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    //delete(int id)
    void delete(int id){
        //tạo câu delete đến tbEmployee
        String sql = "DELETE dbo.Student WHERE studentId = ?";
        try {
            //tạo kết nối tới javaDB
            con = connect.getConnectDB();
            // create statement to delete data from table tbEmployee
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để delete
            pst.setInt(1, id);

            int result = pst.executeUpdate();//thực thi query để delete (trả về số dòng đã được updated)
            if (result > 0) {
                System.out.println("Deleted");
            }
            else{
                System.out.println("Delete fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                //đóng kết nối
                pst.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
