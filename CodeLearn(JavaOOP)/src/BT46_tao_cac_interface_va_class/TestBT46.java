/*
Bài tập
Bạn hãy tạo ra các interface và class giống như trong sơ đồ lớp sau (bạn có thể kéo cửa số bài tập to ra để xem rõ hơn):



Giải thích:

Sơ đồ lớp trên mô tả một chương trình đơn giản dùng để tính lương nhân viên Full Time và nhân viên Part Time

interface IEmployee

calculateSalary() là phương thức trừu tượng dùng để tính lương nhân viên.
getName() là phương thức trừ tượng trả về tên nhân viên.
Lớp trừu tượng Employee

Đây là lớp kế thừa từ interface IEmployee
Đây là lớp trừ tượng lưu thông tin chung về nhân viên.
name, paymentPerHour lần lượt là các thuộc tính chỉ tên và số tiền mà nhân viên nhận được trên 1 giờ làm việc.
Employee(name: String, paymentPerHour: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
setName(), getName(), setPaymentPerHour(), getPaymentPerHour() là các setter và getter.
Lớp PartTimeEmployee

Đây là lớp kế thừa từ lớp trừu tượng Employee
workingHours là thuộc tính chỉ số giờ làm việc trên 1 ngày của nhân viên.
calculateSalary() là phương thức ghi đè từ lớp trừ tượng Employee, phương thức này trả về tiền lương của nhân viên part-time theo công thức: workingHours * paymentPerHour.
Lớp FullTimeEmployee

Đây là lớp kế thừa từ lớp trừu tượng Employee
calculateSalary() là phương thức ghi đè từ lớp trừ tượng Employee, phương thức này trả về tiền lương của nhân viên full-time theo công thức: 8 * paymentPerHour (nhân viên full time luôn làm việc 8 tiếng một ngày nên lớp FullTimeEmployee không có thuộc tính workingHours)
Chương trình dùng để test các lớp trên:

public class Entry {
	public static void main(String[] args) {
		IEmployee employee1 = new PartTimeEmployee("Trung", 45000, 7);
		System.out.println("Name: " + employee1.getName());
		System.out.println("Salary per day: " + employee1.calculateSalary());

		IEmployee employee2 = new FullTimeEmployee("Linh", 65000);
		System.out.println("Name: " + employee2.getName());
		System.out.println("Salary per day: " + employee2.calculateSalary());
	}
}
Kết quả khi chạy chương trình:

Name: Trung
Salary per day: 315000
Name: Linh
Salary per day: 520000
 */
package BT46_tao_cac_interface_va_class;

public class TestBT46 {

    public static void main(String[] args) {
        IEmployee employee1 = new PartTimeEmployee("Trung", 45000, 7);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        IEmployee employee2 = new FullTimeEmployee("Linh", 65000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
    
}
