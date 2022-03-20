/*
Bài tập
Bạn hãy tạo ra lớp Employee và Manager với thông tin giống như sau:



Giải thích:

Lớp Employee

name và salary là 2 thuộc tính chỉ tên và tiền lương của nhân viên.
Employee(name: String, salary: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức hiển thị ra màn hình thông tin của đối tượng. Ví dụ nếu name = "Khanh", salary = 1500 thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Name: Khanh
Salary: 1500​
Các phương thức khác là các setter và getter mà bạn đã được học.
Lớp Manager

Là lớp kế thừa lớp Employee
bonus là thuộc tính chỉ tiền lương cộng thêm.
Manager(name: String, salary: int, bonus: int) là phương thức khởi  tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
setBonus() và getBouns() là các setter và getter mà bạn đã biết.
getSalary() là phương thức ghi đè từ lớp Person, phương thức này trả về salary + bonus.
display() là phương thức ghi đè từ lớp Employee. Ví dụ nếu name = "Binh", salary = 2500, bonus = 1600 thì khi gọi phương thức display() màn hình sẽ hiển thị ra:

Name: Binh
Salary: 4100​

Giải thích: màn hình hiển thị "Salary = 4100" do salary + bonus = 4100 (lương của manager có thêm khoản bonus)
 */
package BT35_Tao_class_theo_yeu_cau;


public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }
}
