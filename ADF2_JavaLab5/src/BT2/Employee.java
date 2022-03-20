package BT2;

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

    String id, name, address;
    double salary;
    int joinedYear;

    public Employee(String id, String name, String address, double salary, int joinedYear) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.joinedYear = joinedYear;
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

    public String getAddress() {
        return address;
    }

    public int getJoinedYear() {
        return joinedYear;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null; // tao obj pattern p
        Matcher m = null; // tao obj matcher m de so sanh voi pattern p
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("EM[0-9]{4}");//[2,4] là giới hạn số phía sau ít nhất 2 số và nhiều nhất 4 số từ 0-9, vd: S01 hoặc S0001 (S1 hoặc S00001 là sai)
        
        while (true) {            
            System.out.print("Nhap id(EMxxxx):");
            id = sc.nextLine().trim(); //trim là bỏ khoảng cách khi nhập string
            
            m = p.matcher(id);// kiem tra xem chuoi dua vao id co giong nhu chuoi id yeu cau o pattern khong
            if (m.matches()) {//method cua matcher
                break;
            }
            System.out.println("id khong hop le, vui long nhap lai");
        }
        
        //nhap name
        p = Pattern.compile("\\w{2,}");//ten phai co it nhat 2 ky tu tro len
        while (true) {            
            System.out.print("Nhap ten:");
            name = sc.nextLine().trim();
            
            m = p.matcher(name);
            if (m.matches()) {
                break;
            }
            System.out.println("Name phai co it nhat 2 ky tu, khong duoc de trong");
        }
        
        //nhap address
        p = Pattern.compile("\\w{3,}");//ten phai co it nhat 3 ky tu tro len
        while (true) {            
            System.out.print("Nhap address:");
            address = sc.nextLine().trim();
            
            m = p.matcher(address);
            if (m.matches()) {
                break;
            }
            System.out.println("Address phai co it nhat 2 ky tu, khong duoc de trong");
        }
        
        //nhap salary [100-10000]
        while (true) {            
            try {
                System.out.print("Salary [100-10000]:");
                salary = Double.parseDouble(sc.nextLine().trim());
                if (100 <= salary && salary <= 10000) {
                    break;
                }
                System.out.println("Salary must in range [100-10000], please try again");
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        //Nhap joinYear: 1980-2016
        while (true) {            
            try {
                System.out.print("Joint year [1980-2016]:");
                joinedYear = Integer.parseInt(sc.nextLine().trim());
                if (1980 <= joinedYear && joinedYear <= 2016) {
                    break;
                }
                System.out.println("Joint Year must from 1980 to 2016, please try again");
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("id:%s\t name:%s\t address:%s\t salary:%f\t jointYear:%d",getId(),getName(),getAddress(),getSalary(),getJoinedYear());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee anotherE = (Employee)obj;
            if (this.id.equals(anotherE.id)) {
                return true;
            }
        }
        return false;
    }
    
}
