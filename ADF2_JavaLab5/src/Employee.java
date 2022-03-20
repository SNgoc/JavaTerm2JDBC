/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Employee {

    String id, name, dept;
    double salary;

    public Employee(String id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null; // tao obj pattern p
        Matcher m = null; // tao obj matcher m de so sanh voi pattern p
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("E[0-9]{2}");//[2,4] là giới hạn số phía sau ít nhất 2 số và nhiều nhất 4 số từ 0-9, vd: S01 hoặc S0001 (S1 hoặc S00001 là sai)
        
        while (true) {            
            System.out.print("Nhap id(EXX):");
            id = sc.nextLine().trim(); //trim là bỏ khoảng cách khi nhập string
            
            m = p.matcher(id);// kiem tra xem chuoi dua vao id co giong nhu chuoi id yeu cau o pattern khong
            if (m.matches()) {//method cua matcher
                break;
            }
            System.out.println("id khong hop le, vui long nhap lai");
        }
        
        //nhap name
        p = Pattern.compile("[a-z0-9_ ]{2,}");//ten phai co it nhat 2 ky tu tro len
        while (true) {            
            System.out.print("Nhap ten:");
            name = sc.nextLine().trim();
            
            m = p.matcher(name);
            if (m.matches()) {
                break;
            }
            System.out.println("Ten khong hop le, vui long nhap lai");
        }
        
        //nhap salary
        while (true) {            
            try {
                System.out.print("Salary must > 100:");
                salary = Double.parseDouble(sc.nextLine().trim());
                if (salary > 100) {
                    break;
                }
                System.out.println("Salary must > 100, please try again");
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        //Nhap phong ban
        p = Pattern.compile("IT|HC|NS|KT", Pattern.CASE_INSENSITIVE);
        while (true) {            
            System.out.print("Nhap phong ban IT|HC|NS|KT:");
            dept = sc.nextLine().trim();
            m = p.matcher(dept);
            if (m.matches()) {
                break;
            }
            System.out.println("Wrong input, please again");
        }
    }

    @Override
    public String toString() {
        return String.format("id:%s \t name:%s \t salary:%f \t dept:%s",getId(),getName(),getSalary(),getDept());
    }
    
}
