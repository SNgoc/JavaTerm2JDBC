/*
A.	Tạo cơ sở dữ liệu (SQL Server 2012) javaDB.

Tạo bảng tbProject, có cấu trúc:

ID: int – identity(100,1) – not null, Primary Key,

projectName: varchar(30) – not null,

startDate: varchar(10),  not null - format (yyyy-mm-dd)

value: int, not null,  > 0

completed: bit – not null, default (0 -false).


B.	Tạo project:


a.	Add driver sqljdbc4.jar vô Library của project.

b.	Tạo class ConnectDB để thiết lập kết nối tới database.

c.	Tạo java main class Test chứa menu để thực hiện các chức năng quản lý dự án

 */
package BT1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TestDB {
    //khai báo các phương thức để dùng cho javaDB
    static ConnectDB connect = new ConnectDB();
    static Connection con = null;
    static Scanner sc;
    static Statement st = null;//Tạo một đối tượng Statement được sử dụng để thực thi các câu truy vấn SQL.(thường chỉ nên dùng để create, drop. alter table vì perform kém)
    static PreparedStatement pst = null;//thực thi câu truy vấn query (có thể dùng lệnh này, không cần lệnh statement)
    static ResultSet rs = null;//get data from tbProject
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestDB test = new TestDB();
        try {
            test.menu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //add
    static void insertDB() throws SQLException{
        //tạo câu insert đến tbProject
        String sql = "INSERT INTO tbProject (projectName, startDate, value, complete) VALUES (?,?,?,?)";
        //tạo kết nối tới javaDB
        con = connect.getConnectDB();
        // create statement to insert data to table tbProject
        pst = con.prepareStatement(sql);
        //nhập dữ liệu vào để insert
        System.out.println("projectName:");
        pst.setString(1, sc.nextLine().trim());
        System.out.println("startDate:");
        pst.setString(2, sc.nextLine().trim());
        System.out.println("value:");
        pst.setInt(3, Integer.parseInt(sc.nextLine().trim()));
        System.out.println("complete (true or false):");
        pst.setBoolean(4, Boolean.parseBoolean(sc.nextLine()));//dùng để thay cho bit vì không có setBit
        
        int result = pst.executeUpdate();//thực thi query để insert (trả về số dòng đã được updated)
        if (result > 0) {
            System.out.println("Added success");
        }
        else{
            System.out.println("Add failed");
        }
        
        //đóng kết nối
        pst.close();
        con.close();
    }
    
    //hiển thị tất cả project
    static void displayAll() throws SQLException{
        //tạo câu truy vấn
        String sqlAll = "SELECT * FROM tbProject";
        //tạo kết nối tới javaDB
        con = connect.getConnectDB();
        //create statement to display all project
        pst = con.prepareStatement(sqlAll);
        rs = pst.executeQuery();//get data from tbProject
        // show data
        while (rs.next()) {//được sử dụng để di chuyển con trỏ đến một hàng tiếp theo từ vị trí hiện tại.
        ///theo thứ tự cột tạo
            System.out.println("==============================");
            System.out.format("Id:%d \t projectName:%s \t startDate:%s \t value:%d \t complete:%s",rs.getInt(1),rs.getString(2),rs.getString(3), rs.getInt(4),rs.getString(5));
            System.out.println();
        }
        //close
        pst.close();
        con.close();
    }
    
    //hiển thị tất cả project đã complete
    static void displayComplete() throws SQLException{
        //tạo câu truy vấn
        String sqlComplete = "SELECT * FROM tbProject WHERE complete = 1 "; //1 là hoàn thành
        //tạo kết nối tới javaDB
        con = connect.getConnectDB();
        //create statement to display all project
        pst = con.prepareStatement(sqlComplete);
        rs = pst.executeQuery();//get data from tbProject
        // show data
        while (rs.next()) {//được sử dụng để di chuyển con trỏ đến một hàng tiếp theo từ vị trí hiện tại.
        ///theo thứ tự cột tạo
            System.out.println("==============================");
            System.out.format("Id:%d \t projectName:%s \t startDate:%s \t value:%d \t complete:%s",rs.getInt(1),rs.getString(2),rs.getString(3), rs.getInt(4),rs.getString(5));
            System.out.println();
        }
        //close
        pst.close();
        con.close();
    }
    
    //delete theo id
    static void deleteDB() throws SQLException{
        //tạo câu insert đến tbProject
        String sql = "DELETE dbo.tbProject WHERE ID = ?";
        //tạo kết nối tới javaDB
        con = connect.getConnectDB();
        // create statement to delete data from table tbProject
        pst = con.prepareStatement(sql);
        //nhập dữ liệu vào để delete
        System.out.println("Input Id to delete:");
        pst.setInt(1, Integer.parseInt(sc.nextLine().trim()));
        
        int result = pst.executeUpdate();//thực thi query để delete (trả về số dòng đã được updated)
        if (result > 0) {
            System.out.println("Deleted");
        }
        else{
            System.out.println("Delete fail");
        }
        
        //đóng kết nối
        pst.close();
        con.close();
    }
    
    static void menu() throws SQLException{
        sc = new Scanner(System.in);
        char opt = '0';
        do {            
            System.out.println("Nhap lua chon");
            System.out.println("1.Them vao db");
            System.out.println("2.Xem tat ca project trong db");
            System.out.println("3.Xem tat ca project đã complete trong db");
            System.out.println("4.Xoa Project theo ma so db");
            System.out.println("5.Exit");
            opt = sc.nextLine().charAt(0);
            switch(opt){
                case '1':
                    insertDB();
                    break;
                case '2':
                    displayAll();
                    break;
                case '3':
                    displayComplete();
                    break;
                case '4':
                    deleteDB();
                    break;
                case '5':
                    break;
               default:
                   System.out.println("Wrong input");
                   break;
            }
        } while (opt != '5');
    }
}
