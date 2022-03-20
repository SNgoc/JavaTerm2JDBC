/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class FlightTest {
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
        FlightTest test = new FlightTest();
        test.menu();
    }
    
    
    void saveFlight(){
        //tạo query
            String dateformat = "SET DATEFORMAT DMY";//tạo định dạng kiểu nhập date là dd/MM/yyyy 
            String sql ="INSERT INTO dbo.Flight(AircraftCode,Source,Destination,DepTime,JourneyHrs) VALUES (?,?,?,?,?)";
            //tạo obj để input data
            Flights fl = new Flights();
            fl.input();
        try {
            //tạo kết nối tới DB Students
            con = connect.getConnectDB();
            // create statement to insert data to table Student
            pst = con.prepareStatement(dateformat);//chạy query định dạng cho DateTime để set định dạng trước khi nhập
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để insert
            pst.setString(1, fl.getAirCode());
            pst.setString(2, fl.getSource());
            pst.setString(3, fl.getDestination());
            pst.setDate(4, new java.sql.Date(fl.getDept().getTime()));//code insert datetime vào sql
            //If you want to insert the current date:   pst.setDate(2, java.sql.Date.valueOf(java.time.LocalDate.now()));
            pst.setInt(5, fl.getJourney());
            int result = pst.executeUpdate();//thực thi query để insert (trả về số dòng đã được updated)
            if (result > 0) {
                System.out.println("Added success");
            }
            else{
                System.out.println("Add failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FlightTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //close
                pst.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FlightTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    void findAll(){
        //tạo câu truy vấn
        String sql = "SELECT * FROM dbo.Flight ORDER BY DepTime ASC";
        //Tạo 1 obj list để chứa danh sách từ db
        List<Flights> result = new ArrayList<>();
        try {
            //tạo kết nối tới DB Students
            con = connect.getConnectDB();
            // create statement to insert data to table Student
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();//get data from Student
            
            // get data from Student
            while (rs.next()) {//được sử dụng để di chuyển con trỏ đến một hàng tiếp theo từ vị trí hiện tại.
            ///theo thứ tự cột tạo
            Flights f = new Flights();//tạo 1 obj để lấy data từ db add vào list
            f.setAirCode(rs.getString(1));//id
            f.setSource(rs.getString(2));//name
            f.setDestination(rs.getString(3));//email
            //lấy datetime từ sql về (CHÚ Ý dùng java.util.Date KHÔNG PHẢI java.sql.Date)
            f.setDept(new java.util.Date(rs.getDate(4).getTime()));//DATETIME
            f.setJourney(rs.getInt(5));
            result.add(f);//add obj s vào list result
            }
            
            //check database is empty
            if (result.isEmpty()) {
                System.out.println("No data");
                return;
            }
            //show data
            //print list student theo kiểu toString()
            for (Flights fl : result) {
                System.out.println(fl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FlightTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //close
                pst.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FlightTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    void updateFlights(String airID, int hours){
        //tạo câu truy vấn
        String sql = "UPDATE Flight SET JourneyHrs = ? WHERE AircraftCode = ?";
        try {
            //tạo kết nối tới DB Students
            con = connect.getConnectDB();
            // create statement to insert data to table Student
            pst = con.prepareStatement(sql);
            //nhập dữ liệu vào để update jouneyhour
            pst.setInt(1, hours);
            //Nhập id nơi hours cần update
            pst.setString(2, airID);

            int result = pst.executeUpdate();//thực thi query để delete (trả về số dòng đã được updated)
            if (result > 0) {
                System.out.println("Updated");
            }
            else{
                System.out.println("Update fail");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FlightTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //close
                pst.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FlightTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    void menu() throws SQLException{
        Scanner sc = new Scanner(System.in);
        int opt;
        do {            
            
            System.out.println("1.Create a new Flight");
            System.out.println("2.Display all Flights");
            System.out.println("3.Change journey hours of a Flight");
            System.out.println("4.Exit");
            System.out.print("Input command:");
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    saveFlight();
                    break;
                case 2:
                    findAll();
                    break;
                case 3:
                    System.out.print("Input Airid:");
                    sc.nextLine();
                    String airId = sc.nextLine().trim();
                    System.out.print("Input hours to update:");
                    int hour = sc.nextInt();
                    updateFlights(airId, hour);
                case 4:
                    System.out.println("Exit!!!");
                    break;
               default:
                   System.out.println("Wrong input");
                   break;
            }
        } while (opt != 4);
    }
}
