/*
1.	Tạo class Doctor bao gồm :
a.	Các fields dữ liệu:
i.	String id, name, level
ii.	int exp_years

b.	Các contructors để khởi tạo giá trị ban đầu cho các field dữ liệu.

c.	Method :
*	void input() : nhập chi tiết bác sĩ và kiểm tra dữ liệu hợp lệ như sau :
-	id : Dxx[xx], với x là ký số - từ 2 đến 4 ký số.
-	name : ít nhất 2 ký tự chữ hoặc khoảng trắng.
-	level : trình độ chuyên khoa: level 1, level 2, level 3 hoặc để trống.
-	exp_years: số năm kinh nghiệm , từ 0 - 60

•	String toString() : override method này để biểu diễn nội dung của 1 đối tượng bác sĩ dưới dạng chuỗi.

 */
package Lab3_Collection;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Doctor {
    String id, name, level;
    int exp_year;

    public Doctor(String id, String name, String level, int exp_year) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.exp_year = exp_year;
    }

    public Doctor() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public int getExp_year() {
        return exp_year;
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
            id = sc.nextLine().trim();
            m = p.matcher(id); //kiem tra id co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo paattern
                break;
            } else {
                System.out.println("id khong dung, phai Dxx[xx] xx tu 2-4 ky so");
            }
        }
        //name
        //nhap name (tao regular expression pattern)
        // trong compile pattern phai dung \\ khong dung \ duoc
        p = Pattern.compile("\\w{2,}|\\s\\s",Pattern.CASE_INSENSITIVE);//chua it nhat 2 ky tu chu hoac khoang trang
        while (true) {            
            System.out.print("Name:");
            name = sc.nextLine(); // do yeu cau khoang trang nen khong xai trim()
            m = p.matcher(name); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Name phai co it nhat 2 ky tu hoac khoang trang");
            }
        }
        //level: trinh do chuyen khoa: level 1, level 2, level 3 hoac de trong.
        //nhap level (tao regular expression pattern)
        p = Pattern.compile("level\\s[0-9]{1}|{0}",Pattern.CASE_INSENSITIVE);// \\s la pattern 1 space " " (khong the dung \s)
        while (true) {            
            System.out.print("Level:");
            level = sc.nextLine().trim();
            m = p.matcher(level); //kiem tra level co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Level trinh do chuyen khoa: level 1, level 2, level 3 hoac de trong.");
            }
        }
        //exp_years so nam kinh nghiem tu 0-60
        while (true) {
            System.out.print("exp_years:");            
            try {
                exp_year = Integer.parseInt(sc.nextLine().trim());
                if (exp_year >= 0 && exp_year <= 60) {
                    break;
                }
                System.out.println("exp_years phai tu 0-60");
            } catch (Exception e) {
                System.out.println("Wrong format " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("id:%s \t name:%s \t level:%s \t exp_years:%d",getId(),getName(),getLevel(),getExp_year());
    }
    
}
