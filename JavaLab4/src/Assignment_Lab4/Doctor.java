/*
Assignment
Viết chương trình Java quản lý đối tượng bác sĩ theo hướng dẫn sau
1. Tạo project ass3

2. Tạo Java Class, Doctor (Doctor.java) với cấu trúc như sau :

a. Fields dữ liệu : docNo, name, specification (string), exp_years, salary (int)

b. Hàm dựng: khởi trị ban đầu cho các field dữ liệu, bao gồm hàm dựng
    i. Không tham số Doctor()
    ii. Có tham số Doctor(String, String, String, int, int)

c. Phương thức:
    i. void input () : nhập dữ liệu chi tiết của 1 bác sĩ . Yêu cầu kiểm tra tính hợp lệ của
    dữ liệu: docNo, name, specification -ko được để trống, exp_years, salary phải lớn
    hơn 0

    ii. void print() : in các thông tin chi tiết của 1 bác sĩ ra màn hình

    iii. void print(String id) : in ra hệ số cấp bậc của bác sĩ có mã số là id,
     dựa vào số năm kinh nghiệm (exp_years) như sau :
        ➔ ‘D’ nếu số năm kn >=15 năm
        ➔ ‘C’ nếu số năm kn >=10 năm và nhỏ hơn <15 năm
        ➔ ‘B’ nếu số năm kn >=5 năm và nhỏ hơn <10 năm
        ➔ ‘A’ nếu số năm kn <5 năm
    Lưu ý, chương trình sẽ thông báo lỗi nếu mã số id ko đúng.

    iv. int print(int days): tính và trả về thu nhập trong tháng của bác sĩ dựa vào số ngày
    làm việc (days) và số năm kinh nghiệm theo công thức sau :

    income = (salary * days)/24 + allowance (phụ cấp cấp bậc) ,
    với allowance = 1000 nếu số năm kn >=15 năm
    600 nếu số năm kn >=10 năm và nhỏ hơn <15 năm
    300 nếu số năm kn >=5 năm và nhỏ hơn <10 năm
    100 nếu số năm kn <5 năm

3. Tạo lớp kiểm thử Java Main Class, DoctorTest.java , bao gồm 2 phương thức :
    a. menu() : tạo thực đơn để thực hiện các chức năng :
        1. Nhập thông tin bác sĩ,
        2. Xuât thông tin bác sĩ,
        3. In cấp bậc,
        4. Nhập số ngày làm việc và tính thu nhập,
        5. Thoát
    b. main() : gọi phương thức menu() để thi hành chương trình.
4. Biên dịch và thi hành chương trình.
 */
package Assignment_Lab4;

import java.util.Scanner;


public class Doctor {
    private String docNo, name, specification;
    private int exp_years, salary;

    public Doctor() {
    }

    public Doctor(String docNo, String name, String specification, int exp_years, int salary) {
        this.docNo = docNo;
        this.name = name;
        this.specification = specification;
        this.exp_years = exp_years;
        this.salary = salary;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setExp_years(int exp_years) {
        this.exp_years = exp_years;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDocNo() {
        return docNo;
    }

    public String getName() {
        return name;
    }

    public String getSpecification() {
        return specification;
    }

    public int getExp_years() {
        return exp_years;
    }

    public int getSalary() {
        return salary;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("DocNo:");
        docNo = sc.nextLine();
        System.out.print("Name:");
        name = sc.nextLine();
        System.out.print("Specification:");
        specification = sc.nextLine();
        do {            
            System.out.print("Exp Years (must greater than 0):");
            exp_years = sc.nextInt();
        } while (exp_years <= 0);
        
        do {            
            System.out.print("Salary (must greater than 0):");
            salary = sc.nextInt();
        } while (salary <= 0);
    }
    
    public void InfoDoc(){
        System.out.println("DocNo: " + getDocNo());
        System.out.println("Name: " + getName());
        System.out.println("Specification: " + getSpecification());
        System.out.println("Exp Years: " + getExp_years());
        System.out.println("Basic salary: " + getSalary());
    }
    
    public void Cap_bac(){
        if (docNo == null || name == null || specification == null) {
            System.out.println("Khong the in vi DocNo hoac name hoac specification co gia tri null.");
        }
        else if (exp_years >= 15) {
            System.out.println(getDocNo() + " co cap bac la D");
        }
        else if (10 <= exp_years && exp_years < 15){
            System.out.println(getDocNo() + " co cap bac la C");
        }
        else if (5 <= exp_years && exp_years < 10){
            System.out.println(getDocNo() + " co cap bac la B");
        }
        else if (exp_years < 5){
            System.out.println(getDocNo() + " co cap bac la A");
        }
    }
    
    public void income(){
        Scanner sc = new Scanner(System.in);
        int days;
        do {            
            System.out.print("Nhap so ngay lam viec(days >= 0):");
            days = sc.nextInt();
        } while (days < 0);
        
        int allowance;
        int totalIncome = 0;
        if (exp_years >= 15) {
            allowance = 1000;
            totalIncome = (salary*days)/24 + allowance;
        }
        else if (10 <= exp_years && exp_years < 15){
            allowance = 600;
            totalIncome = (salary*days)/24 + allowance;
        }
        else if (5 <= exp_years && exp_years < 10){
            allowance = 300;
            totalIncome = (salary*days)/24 + allowance;
        }
        else if (exp_years < 5){
            allowance = 100;
            totalIncome = (salary*days)/24 + allowance;
        }
        System.out.println("Tong thu nhap thuc te trong " + days + " lam viec la: " + totalIncome);
    }
}
