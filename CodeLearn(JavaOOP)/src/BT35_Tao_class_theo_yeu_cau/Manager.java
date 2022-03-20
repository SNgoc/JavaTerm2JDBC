/*
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


public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int getSalary() {//khi dùng ghi đè thì khi truy xuất sẽ ưu tiên sử dụng phương thức override của class con trước nếu có
        return super.getSalary() + getBonus();
    }

    
    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
