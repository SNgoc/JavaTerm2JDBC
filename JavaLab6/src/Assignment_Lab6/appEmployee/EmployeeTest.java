/*
d. Tạo Java Main Class EmployeeTest, trong package app, thực hiện chức năng quản lý danh sách nhân viên :
i. Dữ liệu (fields – variable):
empList ( là 1 ArrayList chứa các đối tượng nhân viên),
ii. Hàm dựng không tham số:
khởi tạo empList
iii. Phương thức (Methods):
1. void add():thêm 1 nhân viên mới vô danh sách ds.
Lưu ý: kiểm tra nếu mã số bị trùng sẽ báo lỗi và từ chối thêm mới.
2. void display(): In toàn bộ bảng danh sách nhân viên, và in thông báo lỗi nếu hệ thống
chưa có dữ liệu
3. void display(int amt): In bảng danh sách nhân viên có mức lương trên amt USD. Chương
trình sẽ thông báo lỗi nếu hệ thống chưa có dữ liệu hoặc không tìm thấy nhân viên nào có
mức lương trên amt USD
4. void display(String empName): Tìm và in ra bảng danh sách các nhân viên có tên chứa
chuỗi empName. Chương trình sẽ thông báo lỗi nếu hệ thống chưa có dữ liệu hoặc không
tìm thấy nhân viên nào theo yêu cầu trên.
5. void menu(): xây dựng hệ thống thực đơn cho phép thêm, tìm kiếm và in danh sách các
nhân viên theo yêu cầu nói trên.
6. static void main (): tạo 1 đối tượng kiểu EmployeeTest, gọi phương thức menu() trên đối
tượng này để thi hành chương trình.
 */
package Assignment_Lab6.appEmployee;
import Assignment_Lab6.Employee;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class EmployeeTest {
    
    //tạo 1 danh sách các sản phẩm
    ArrayList<Employee> emplist = new ArrayList<>();//tạo 1 ds các product có max list là 10 // thêm <Product> để không phải báo kiểu
    
    public EmployeeTest() {
    }
    
    void add(){
        //khoi tao doi tuong emp trong add() thi moi khong bi ghi de data khi add vao array (neu tao ngoai thi se bi ghi de data cu)
        Employee emp = new Employee();
        emp.input();
        if (emplist.isEmpty()) {
            emplist.add(emp);
            System.out.println("Add success.");
            return;
        }
        
        //THUẬT TOÁN void add():thêm 1 nhân viên mới vô danh sách ds.
        //Lưu ý: kiểm tra nếu mã số bị trùng sẽ báo lỗi và từ chối thêm mới. Dùng hàm for each để duyệt từng phần tử trong mảng kiểm tra giá trị
        for (Employee employee : emplist) {
            if (employee == null) {
                break;
            }
            if (employee.getId().equals(emp.getId())) {
                System.out.println("Duplicate.");
                return;
            }
        }
        emplist.add(emp);
        System.out.println("Add success.");
    }
    
    void display(){
        if (emplist.isEmpty()) {
            System.out.println("He thong chua co employee");
        }
        for (Employee employee : emplist) {
            System.out.println(employee);
        }
   }
    void display(int amt){
        boolean found = false;
        for (int i = 0; i < emplist.size(); i++) {
            if (emplist.get(i).getBaseSalary() > amt) {
                System.out.println("Danh sach nhan vien co muc luong tren " + amt);
                System.out.println(emplist.get(i));
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Khong tim thay nhan vien co muc luong tren " + amt);
        }
    }
    void display(String empName){
        boolean found = false;
        for (int i = 0; i < emplist.size(); i++) {
            if (emplist.get(i).getName().contains(empName)) {
                System.out.println("Danh sach nhan vien co ten chua " + empName + " la " + emplist.get(i).getName());
                System.out.println(emplist.get(i));
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Khong tim thay nhan vien co ten chua " + empName);
        }
    }
    public void menu(){
        Scanner sc = new Scanner(System.in);
        EmployeeTest emptest = new EmployeeTest();
        String n;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Them Employee                               *");
            System.out.println("*        2.In Employee                                 *");
            System.out.println("*        3.In DS Employee theo muc luong               *");
            System.out.println("*        4.In DS Employee theo ten nhap vao            *");
            System.out.println("*        5.Thoát                                       *");
            System.out.println("********************************************************");
            System.out.print("Nhap lenh:");
            n = sc.nextLine();
            switch(n){
                case "1":
                    System.out.println("Them Employee  :");
                    emptest.add();
                    break;
                case "2":
                    System.out.println("In Employee :");
                    emptest.display();
                    break;
                case "3":
                    
                    System.out.print("Nhap muc luong:");
                    int salary = sc.nextInt();
                    sc.nextLine();
                    System.out.println("In DS Employee theo muc luong:");
                    emptest.display(salary);
                    break;
                case "4":
                    System.out.print("Nhap ten:");
                    String empname = sc.nextLine();
                    System.out.println("In DS Employee theo ten nhap vao:");
                    emptest.display(empname);
                    break;
                case "5":
                    System.out.println("Quit!!!");
                    break;
                default:
                    System.out.println("Sai lệnh, mời nhập lại!!!");
            }
        } while(!"5".equals(n));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeTest test = new EmployeeTest();
        test.menu();
    }
    
}
