/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas6;

/**
 *
 * @author asus
 */
public class TestEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //Tạo 1 đối tượng Employee có tên là emp
        Employee emp = new Employee(); //Đối tượng này sẽ gọi hàm contructor(khởi tạo) không có tham số
        //Gọi phương thức xuất
        emp.output();
        
        //Tạo 1 đối tượng mới là emp2
        Employee emp2 = new Employee();
        //Gọi Phương thức nhập
        emp2.input();
        emp2.output();
        
        //Tạo 1 đối tượng mới là emp3 và đối tượng này sẽ sử dụng hàm constructor có tham số
        Employee emp3 = new Employee("E003", "Lan", 28, false);//bắt buộc phải truyền đủ
        emp3.output();
        
        //Tạo 1 đối tượng mới là emp4
        Employee emp4 = new Employee();
        emp4.id = "E004";
        emp4.name = "Tùng";
        emp4.output();//hai giá trị age và gender khi dùng phương thức này sẽ tự gán giá trị mặc định được cho khi khởi tạo hàm nếu không có tham số mới truyền vào
    }
}
