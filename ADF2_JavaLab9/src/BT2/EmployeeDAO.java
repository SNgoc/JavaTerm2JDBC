/*
d.	Tạo class EmployeeDAO, bao gồm các methods :
1.	public int insert (Employee emp):

•	thêm đối tượng nhân viên emp vô bảng tbEmployee

•	trả về số nguyên dương nếu tác vụ thành công, ngược lại trả về giá trị âm
2.	 public int update (Employee emp):

•	thay đổi thông tin của đối tượng nhân viên emp trong bảng tbEmployee

•	trả về số nguyên dương nếu tác vụ thành công, ngược lại trả về giá trị âm

3.	public int delete (String eID):

•	Xóa đối tượng nhân viên có mã số eID trong bảng tbEmployee

•	trả về số nguyên dương nếu tác vụ thành công, ngược lại trả về giá trị âm

4.	public List<Employee> getList() , trả về danh sách nhân viên trong bảng tbEmployee.

5.	public List<Employee> getList (String eName), trả về danh sách nhân viên trong bảng tbEmployee có tên chứa nội dung của biến eName

 */
package BT2;

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
public class EmployeeDAO {
    //khai báo các phương thức để dùng cho javaDB2
    static ConnectDB connect = new ConnectDB();
    static Connection con = null;
    static Scanner sc;
    static Statement st = null;//Tạo một đối tượng Statement được sử dụng để thực thi các câu truy vấn SQL.(thường chỉ nên dùng để create, drop. alter table vì perform kém)
    static PreparedStatement pst = null;//thực thi câu truy vấn query (có thể dùng lệnh này, không cần lệnh statement)
    static ResultSet rs = null;//get data from tbEmployee
    
    //add
    public static void insertDB(Employee emp){
        //tạo câu insert đến tbProject
        String sql = "INSERT INTO dbo.tbEmployee ( ID, fullname, gender, salary) VALUES(?,?,?,?)";
        
        //dùng obj để nhập dữ liệu
        emp.input();
        try {
            //tạo kết nối tới javaDB
            con = connect.getConnectDB();
            // create statement to insert data to table tbEmployee
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để insert
            pst.setString(1, emp.getId());
            pst.setString(2, emp.getFullname());
            pst.setBoolean(3, emp.isGender());//dùng để thay cho bit vì không có setBit
            pst.setInt(4, emp.getSalary());

            int result = pst.executeUpdate();//thực thi query để insert (trả về số dòng đã được updated)
            if (result > 0) {
                System.out.println("Added success");
            }
            else{
                System.out.println("Add failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //đóng kết nối
                pst.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Update
    public static void updateDB(Employee emp){
        //tạo câu update đến tbEmployee
        String sql = "UPDATE dbo.tbEmployee SET ID = ?, fullname = ?, gender = ?, salary = ? WHERE ID = ?";//?1,2,3,4,5->id,fullname,gender,salary,id
        
        //dùng obj để nhập dữ liệu
        emp.input();
        try {
            //tạo kết nối tới javaDB
            con = connect.getConnectDB();
            // create statement to insert data to table tbEmployee
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để update
            pst.setString(1, emp.getId());
            pst.setString(2, emp.getFullname());
            pst.setBoolean(3, emp.isGender());//dùng để thay cho bit vì không có setBit
            pst.setInt(4, emp.getSalary());
            System.out.print("Nhap ma id can update:");
            pst.setString(5, sc.nextLine().trim());

            int result = pst.executeUpdate();//thực thi query để update (trả về số dòng đã được updated)
            if (result > 0) {
                System.out.println("Updated success");
            }
            else{
                System.out.println("Update failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //đóng kết nối
                pst.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //delete theo id
    public static void deleteDB(String eID){
        //tạo câu delete đến tbEmployee
        String sql = "DELETE dbo.tbEmployee WHERE ID = ?";
        try {
            //tạo kết nối tới javaDB
            con = connect.getConnectDB();
            // create statement to delete data from table tbEmployee
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để delete
            pst.setString(1, eID);

            int result = pst.executeUpdate();//thực thi query để delete (trả về số dòng đã được updated)
            if (result > 0) {
                System.out.println("Deleted");
            }
            else{
                System.out.println("Delete fail");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //đóng kết nối
                pst.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //4.public List<Employee> getList() , trả về danh sách nhân viên trong bảng tbEmployee.
    public List<Employee>getList(){
        List<Employee> result = new ArrayList<>();//trả về result
        //tạo câu delete đến tbEmployee
        String sql = "SELECT * FROM dbo.tbEmployee";
        try {
            //tạo kết nối tới javaDB
            con = connect.getConnectDB();
            // create statement to delete data from table tbEmployee
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();//get data from tbProject
            while (rs.next()) {                
                Employee e = new Employee();
                e.setId(rs.getString(1));
                e.setFullname(rs.getString(2));
                e.setGender(rs.getBoolean(3));
                e.setSalary(rs.getInt(4));
                result.add(e);
            }
            for (Employee employee : result) {
                System.out.println(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    //5.public List<Employee> getList (String eName), trả về danh sách nhân viên trong bảng tbEmployee có tên chứa nội dung của biến eName
    public List<Employee>getList(String eName){
        List<Employee> result = new ArrayList<>();//trả về result
        //tạo câu delete đến tbEmployee
        String sql = "SELECT * FROM dbo.tbEmployee WHERE fullname LIKE ?";
        try {
            //tạo kết nối tới javaDB
            con = connect.getConnectDB();
            // create statement to delete data from table tbEmployee
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để tìm kiếm
            pst.setString(1, "%" + eName + "%"); //dùng để tìm kiếm gần đúng trong java
            rs = pst.executeQuery();//get data from tbProject, dùng cho hiển thị
            boolean found = false;
            while (rs.next()) {                
                Employee e = new Employee();
                e.setId(rs.getString(1));
                e.setFullname(rs.getString(2));
                e.setGender(rs.getBoolean(3));
                e.setSalary(rs.getInt(4));
                result.add(e);
                found = true;
            }
            for (Employee employee : result) {
                System.out.println(employee);
            }
            if (found == false) {
                System.out.println("Can't find name " + eName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
