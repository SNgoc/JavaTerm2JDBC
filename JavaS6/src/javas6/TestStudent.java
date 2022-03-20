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
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Khởi tạo 1 đối tượng
        Student std1 = new Student();
        
        //Cách 1
        //ko thể sử dụng std1.name được phải khai báo bên Student.java
        std1.setName("Linh");
//      std1.setMark(120);//điểm không hợp lệ nếu > 100 hoặc <0
        std1.setMark(90);
        std1.output();
        
        //Cách 2
        System.out.println("Name: " + std1.getName());
        System.out.println("Mark: "+ std1.getMark());
    }
}
