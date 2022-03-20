/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas6;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    String id, name;
    int age;
    boolean gender;
    
    //hàm khởi tạo không có tham số
    
    public Employee() {
        id = "E001";
        name = "Nero Saro";
        age = 30;
        gender = true;
    }
    
    //Hàm khởi tạo có tham số

    public Employee(String e_id, String e_name, int e_age, boolean e_gender) {
        this.id = e_id;
        this.name = e_name;
        this.age = e_age;
        this.gender = e_gender;
    }
    
    //method
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        id = sc.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        age = sc.nextInt();
        System.out.println("Nhập giới tính nhân viên: true(nam) false(nữ):");
        gender = sc.nextBoolean();
        
    }
    
    void output()
    {
        System.out.println("-----Thông tin nhân viên-----");
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ (gender?"nam":"nữ"));
    }
}
