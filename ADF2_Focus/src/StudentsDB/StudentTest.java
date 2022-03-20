/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsDB;

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
public class StudentTest {
    //khai báo các phương thức để dùng cho StudentsDB
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
        StudentTest test = new StudentTest();
        test.menu();
    }
    
    void menu() throws SQLException{
        Scanner sc = new Scanner(System.in);
        int opt;
        do {            
            
            System.out.println("1.Create a new student");
            System.out.println("2.Show all");
            System.out.println("3.Update email by Id");
            System.out.println("4.Exit");
            System.out.print("Input command:");
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    addStudent();
                    break;
                case 2:
                    getStudentList();
                    break;
                case 3:
                    System.out.print("Input id:");
                    sc.nextLine();
                    String stId = sc.nextLine().trim();
                    System.out.print("Input email to edit:");
                    String email = sc.nextLine().trim();
                    if (!email.contains("@gmail.com") && !email.contains("@email.com")) {
                        System.out.println("email wrong");
                        break;
                    }
                    updateStudent(stId, email);
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
    
    void addStudent(){
        //tạo query
        String sql = "INSERT INTO dbo.Student (studentId,studentName,email) VALUES (?,?,?)";
        //tạo obj để input data
        Student std = new Student();
        std.inputStudent();
        try {
            //tạo kết nối tới DB Students
            con = connect.getConnectDB();
            // create statement to insert data to table Student
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để insert
            pst.setString(1, std.getStudentId());
            pst.setString(2, std.getStudentName());
            pst.setString(3, std.getEmail());

            int result = pst.executeUpdate();//thực thi query để insert (trả về số dòng đã được updated)
            if (result > 0) {
                System.out.println("Added success");
            }
            else{
                System.out.println("Add failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //close
                pst.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //lấy về danh sách student từ db
    void getStudentList(){
        //tạo câu truy vấn
        String sql = "SELECT * FROM dbo.Student";
        //Tạo 1 obj list để chứa danh sách từ db
        List<Student> result = new ArrayList<>();
        try {
            //tạo kết nối tới CollegeABC
            con = connect.getConnectDB();
            // create statement to insert data to table
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();//get data from Student
            
            // get data from Student
            while (rs.next()) {//được sử dụng để di chuyển con trỏ đến một hàng tiếp theo từ vị trí hiện tại.
            ///theo thứ tự cột tạo
            Student s = new Student();//tạo 1 obj để lấy data từ db add vào list
            s.setStudentId(rs.getString(1));//id
            s.setStudentName(rs.getString(2));//name
            s.setEmail(rs.getString(3));//email
            result.add(s);//add obj s vào list result
            }
            
            //check database is empty
            if (result.isEmpty()) {
                System.out.println("No data");
                return;
            }
            //show data
            //print list student theo kiểu toString()
            for (Student student : result) {
                System.out.println(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //close
                pst.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //update
    void updateStudent(String studentId, String email){
        //tạo câu truy vấn
        String sql = "UPDATE dbo.Student SET email = ? WHERE studentId = ?";
        try {
            //tạo kết nối tới javaDB
            con = connect.getConnectDB();
            // create statement to delete data from table tbEmployee
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để update email
            pst.setString(1, email);
            //Nhập id nơi email cần update
            pst.setString(2, studentId);

            int result = pst.executeUpdate();//thực thi query để delete (trả về số dòng đã được updated)
            if (result > 0) {
                System.out.println("Updated");
            }
            else{
                System.out.println("Update fail");
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
