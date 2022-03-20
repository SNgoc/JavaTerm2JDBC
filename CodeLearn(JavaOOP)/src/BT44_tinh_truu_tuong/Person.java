/*
Bài tập
Bạn hãy tạo ra 3 lớp Person, Employee và Customer với thông tin giống như sau:


Lớp Person

Person là lớp trừ tượng dùng để lưu thông tin chung về đối tượng con người.
name và address là 2 thuộc tính private chỉ tên và địa chỉ của đối tượng.
Person(name: String, address: String) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức trừu tượng dùng để hiển thị thông tin của đối tượng.
Lớp Employee

Employee là lớp kế thừa từ lớp trừu tượng Person
salary là thuộc tính lưu thông tin về tiền lương của nhân viên.
Employee(name: String, address: String, salary: int) là phương thức khởi tạo dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức ghi đè từ lớp trừu tượng, phương thức này dùng để hiển thị thông tin nhân viên ra màn hình. 
Ví dụ nếu name = "Trung", address = "HN", salary = 3300 thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Employee name: Trung
Employee address: HN
Employee salary: 3300​
Lớp Customer

Customer là lớp kế thừa từ lớp trừu tượng Person.
balance là thuộc tính lưu thông tin về số dư trong tài khoản của khách hàng.
Customer(name: String, address: String, balance: int) là phương thức khởi tạo dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức ghi đè từ lớp trừu tượng, phương thức này dùng để hiển thị thông tin nhân viên ra màn hình. 
Ví dụ nếu name = "Linh", address = "BN", balance = 10400 thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Customer name: Linh
Customer address: BN
Customer balance: 10400
Lưu ý: Trong sơ đồ lớp thì nếu tên một lớp được in nghiêng thì đó là lớp trừ tượng, nếu tên phương thức được in nghiêng thì đó là phương thức trừu tượng.

Chương trình để test 3 lớp trên:

public class Entry {
	public static void main(String[] args) {
		Person person1 = new Employee("Trung", "HN", 3300);
		Person person2 = new Customer("Linh", "BN", 10400);
		person1.display();
		person2.display();
	}
}
Kết quả khi chạy chương trình:

Employee name: Trung
Employee address: HN
Employee salary: 3300
Customer name: Linh
Customer address: BN
Customer balance: 10400
 */

package BT44_tinh_truu_tuong;
/*
abstract  là thằng mà muốn sài thì phải ghi đè override lên cái thằng mà mình muốn thao tác với nó
interface là cái thằng mà chỉ biết chứa biến và hằng số  dùng chung , 1 class có thể kế thừa  >1 interface  
và muốn sử dụng lên chính cái hàm trong interface thì phải dùng Override mới sài đc
*/
//Một lớp có thể kế thừa nhiều interface. Như bạn đã biết, Java là ngôn ngữ được thiết kế với mục đích đơn giản nên không hỗ trợ đa kế thừa với class, 
//nhưng do bản chất interface chỉ chứa các phương thức rỗng nên Java cho phép một lớp kế thừa nhiều interface.

//Tuy nhiên, bạn vẫn có thể khai báo các thuộc tính, các phương thức có phần thân nên việc sử dụng lớp trừu tượng abstract sẽ không được coi là trừu tượng hoàn toàn.
public abstract class Person {//vẫn có thể khai báo phần thân được với abstrct, còn interface thì không.
    private String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    public abstract void display();
}
