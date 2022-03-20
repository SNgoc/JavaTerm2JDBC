/*
Lớp Employee

Employee là lớp kế thừa từ lớp trừu tượng Person
salary là thuộc tính lưu thông tin về tiền lương của nhân viên.
Employee(name: String, address: String, salary: int) là phương thức khởi tạo dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức ghi đè từ lớp trừu tượng, phương thức này dùng để hiển thị thông tin nhân viên ra màn hình. 
Ví dụ nếu name = "Trung", address = "HN", salary = 3300 thì khi gọi phương thức display() màn hình sẽ hiển thị ra:

Employee name: Trung
Employee address: HN
Employee salary: 3300​
 */
package BT44_tinh_truu_tuong;

/**
 *
 * @author asus
 */
public class Employee extends Person{
    private int salary;

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public void display(){
        System.out.println("Employee name: " + getName());
        System.out.println("Employee address: " + getAddress());
        System.out.println("Employee salary: " + salary);
    }
}
