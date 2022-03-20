
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class doctorDB {

    public doctorDB() {
    }
    
    private Connection getConnectDB() throws SQLException{//tạo phương thức để connect DB
        Connection con = null;
        try {
            //dang ky ddriver loai 4
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //tạo chuỗi url và user, pass
            String user = "sa";
            String pass = "merlin3103";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DoctorDB";//DB Book
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println("Can't connect");
            e.printStackTrace();//sử dụng code này ko cần throw exception
        }
        return con;//trả về giá trị con là dòng code để connect DB (không được dùng đóng connect trước return vì sẽ lỗi)
    }
    
    public List<Doctor> findAll(){
        List<Doctor> result = new ArrayList<>();
        try {
            Connection con = getConnectDB();
            String query = "SELECT * FROM Doctor";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Doctor d = new Doctor();
                d.setId(rs.getString(1));
                d.setName(rs.getString(2));
                d.setSpecialization(rs.getString(3));
                
                //cách dùng với kiểu biến Date availDate
                //do datetime đọc từ db về sẽ có kiểu java.sql.Date,
                //nên cần chuyển về millisecond
//                Date availDate;
//                long timeinMillis = rs.getDate(4).getTime();
//                //chuyển từ millisecond sang java.util.Date
//                d.setAvailDate(new Date(timeinMillis));
                d.setAvailHours(rs.getInt(4));
                result.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public Doctor findbyId(String id){
        Doctor result = null;
        try {
            Connection con = getConnectDB();
            String query = "SELECT * FROM Doctor WHERE Id = ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                result.setId(rs.getString(1));
                result.setName(rs.getString(2));
                result.setSpecialization(rs.getString(3));
                
                //cách dùng với kiểu biến Date availDate
                //do datetime đọc từ db về sẽ có kiểu java.sql.Date,
                //nên cần chuyển về millisecond
//                Date availDate;
//                long timeinMillis = rs.getDate(4).getTime();
//                //chuyển từ millisecond sang java.util.Date
//                d.setAvailDate(new Date(timeinMillis));
                result.setAvailHours(rs.getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public boolean create(Doctor d){
        boolean result = false;
        try {
            Connection con = getConnectDB();
            String query = "INSERT INTO dbo.Doctor(Id,Name,Specialization,AvailHours) VALUES(?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, d.getId());
            stm.setString(1, d.getName());
            stm.setString(1, d.getSpecialization());
            stm.setInt(1, d.getAvailHours());
            
            //dùng nếu biến kiểu Date availDate
//            long timeInMillis = d.getAvailDate().getTime();
//            stm.setDate(4, new java.sql.Date(timeInMillis));
            result = stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
