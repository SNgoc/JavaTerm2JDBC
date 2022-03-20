/*
3.	Tạo class Doctor, hiện thực giao diện Serializable (implements Serializable) bao gồm :
a.	Các fields dữ liệu:
-	String id, name, specialization
-	int availHours

b.	Các contructors để khởi tạo giá trị ban đầu cho các field dữ liệu.
c.	Override method public String toString()

 */
package BT3;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Doctor implements Serializable{
    
    private String id;
    private String name;
    private String specialization;
    private int availHours;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAvailHours(int availHours) {
        this.availHours = availHours;
    }

    public Doctor() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getAvailHours() {
        return availHours;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;
        
        //id
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("D[0-9]{2,4}");
        while (true) {            
            System.out.print("id(Dxx[xx]):");
            setId(sc.nextLine().trim());
            m = p.matcher(getId()); //kiem tra id co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo paattern
                break;
            } else {
                System.out.println("id khong dung, phai Dxx[xx] xx tu 2-4 ky so");
            }
        }
        
        //name
        //nhap name (tao regular expression pattern)
        // trong compile pattern phai dung \\ khong dung \ duoc
        p = Pattern.compile("\\w{2,}");
        while (true) {            
            System.out.print("Name:");
            setName(sc.nextLine()); // do yeu cau khoang trang nen khong xai trim()
            m = p.matcher(getName()); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Name phai co it nhat 2 ky tu");
            }
        }
        //specialization (chuyen mon): 
        //nhap level (tao regular expression pattern)
        p = Pattern.compile("PT|CC|HS|GM|DK",Pattern.CASE_INSENSITIVE);// \\s la pattern 1 space " " (khong the dung \s)
        while (true) {            
            System.out.print("Specialization (PT|CC|HS|GM|DK):");
            setSpecialization(sc.nextLine().trim());
            m = p.matcher(getSpecialization()); //kiem tra specialization co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Wrong, please try again");
            }
        }
        //availHours so gio trong (tu 0-24h)
        while (true) {
            System.out.print("availHours:");            
            try {
                setAvailHours(Integer.parseInt(sc.nextLine().trim()));
                if (0 <= getAvailHours() && getAvailHours() <= 24) {
                    break;
                }
                System.out.println("availHours phai tu 0-24h");
            } catch (Exception e) {
                System.out.println("Wrong format " + e.getMessage());
            }
        }
    }
    
    @Override
    public String toString() {
        return String.format("Id:%s \tName:%s \tSpecialization:%s \tavailHours:%d",getId(),getName(),getSpecialization(),getAvailHours());
    }
    
    
}
