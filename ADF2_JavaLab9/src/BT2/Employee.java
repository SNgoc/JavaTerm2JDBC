/*
c.	Tạo class Employee, bao gồm :

1.	Các fields dữ liệu (mô tả cấu trúc bảng tbEmployee): String id, fullname

boolean gender int salary
2.	Các contructors để khởi tạo giá trị ban đầu cho các field dữ liệu.
3.	Các method:
public void input()

public void String toString()

 */
package BT2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Employee {
    private String id;
    private String fullname;
    private boolean gender;
    private int salary;

    public Employee() {
    }

    public Employee(String id, String fullname, boolean gender, int salary) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;
        
        //id
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("I[0-9]{4}");
        while (true) {            
            System.out.print("ID(Ixxxx):");
            id = sc.nextLine().trim();
            m = p.matcher(id); //kiem tra id co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo paattern
                break;
            } else {
                System.out.println("id khong dung, phai Ixxxx , x la ky so");
            }
        }
        
        //name
        //nhap name (tao regular expression pattern)
        // trong compile pattern phai dung \\ khong dung \ duoc
        p = Pattern.compile("\\w{2,}");
        while (true) {            
            System.out.print("Fullname:");
            fullname = sc.nextLine().trim(); // nếu yeu cau khoang trang khong xai trim()
            m = p.matcher(fullname); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Name phai co it nhat 2 ky tu");
            }
        }
        
        //gender (true/false)(M/F)
        while (true) {
            System.out.print("Gender:");            
            try {
                gender = sc.nextBoolean();
                sc.nextLine();
                if (gender == true || gender == false) {
                    break;
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Error " + e.getMessage());
            }
        }
        
        //nhap salary [100-10000]
        while (true) {            
            try {
                System.out.print("Salary [100-10000]:");
                salary = Integer.parseInt(sc.nextLine().trim());
                if (100 <= salary && salary <= 10000) {
                    break;
                }
                System.out.println("Salary must in range [100-10000], please try again");
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return getId() + " - " + getFullname() + " - " + (gender ? "Male" : "Female") + " - " + getSalary();
    }
    
    
}
