
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class DemoBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DemoBook demo = new DemoBook();
        //thêm dữ liệu vào (Title, price)
        demo.insertBook("Book15", 500);
        //show code
        demo.findAll();
    }
    
    public void findAll(){
        try {
            //dang ky ddriver loai 4
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //tạo chuỗi url và user, pass
            String user = "sa";
            String pass = "merlin3103";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Book";//DB Book
            Connection con = DriverManager.getConnection(url, user, pass);
            //tạo câu query (sql) để lấy dữ liệu về
            String query = "SELECT * FROM Books";
            //tạo đối tượng statement
            Statement stm = con.createStatement();
            //thi hành câu truy vấn, kết quả trả về đưa vào ResultSet
            ResultSet rs = stm.executeQuery(query);//thực thi ResultSet phải có query
            //duyệt ResultSet để in dữ liệu ra
            while (rs.next()) {                
                System.out.println("Book Id: " + rs.getInt(1));
                System.out.println("Book title: " + rs.getString(2));
                System.out.println("Book price: " + rs.getInt(3));
                System.out.println("===============================");
            }
            //đóng kết nối, cái nào mở sau đóng trước
            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();//sử dụng code này ko cần throw exception
        }
    }
    
    //add
    public int insertBook(String title, int price){
        try {
            //dang ky ddriver loai 4
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //tạo chuỗi url và user, pass
            String user = "sa";
            String pass = "merlin3103";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Book";//DB Book
            Connection con = DriverManager.getConnection(url, user, pass);
            //tạo câu query (sql) để lấy dữ liệu về
            String query = "INSERT INTO dbo.Books (Title, price) VALUES (?,?)";
            //transaction
            //con.setAutoCommit(false);
            
            PreparedStatement stm = con.prepareStatement(query);//bắt buộc phải có câu truy vấn query
            
            //truyền giá trị cho tham số ?
            //phải theo thứ tự số nhỏ trước, lớn sau
            stm.setString(1, title);
            stm.setInt(2, price);
            
            //thi hành câu truy vấn
            int result = stm.executeUpdate();//update không cần tham số
            //con.commit(); //transaction
            return result;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
