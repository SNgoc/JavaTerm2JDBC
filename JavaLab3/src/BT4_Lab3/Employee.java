/*
Bài tập 4:
- Đinh nghĩa class, khai báo và sử dụng biến object.
- Viết chương trình nhập thông tin của 1 nhân viên, in ra bảng lương của nhân viên viên này.
Thông tin nhân viên sẽ được mô tả trong class Employee, bao gồm các :
. thuộc tính : id, name, baseSalary, workDays
. phương thước : input() – nhập thông tin nhân viên, output() – xuất bảng lương.

 */
package BT4_Lab3;

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private int baseSalary;
    private int workDays;

    //constructor ko tham số vs tham số mặc định
    public Employee() {
        id = 1001;
        name = "Nero";
        baseSalary = 1000;
        workDays = 20;
    }

    public Employee(int id, String name, int baseSalary, int workDays) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.workDays = workDays;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //Nhập thông tin employee
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên:");
        System.out.print("ID:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name:");
        name = sc.nextLine();
        System.out.print("Base Salary:");
        baseSalary = sc.nextInt();
        System.out.print("Work Days:");
        workDays = sc.nextInt();
    }
    
    //Xuất thông tin employee
    public void output(){
        System.out.println("Thông tin hiển thị:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Work Days: " + workDays);
        System.out.println("Tổng lương thực nhận: " + workDays*baseSalary);
    }
}
