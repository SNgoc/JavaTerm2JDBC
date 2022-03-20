/*
Lớp Customer

Customer là lớp kế thừa từ lớp trừu tượng Person.
balance là thuộc tính lưu thông tin về số dư trong tài khoản của khách hàng.
Customer(name: String, address: String, balance: int) là phương thức khởi tạo dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức ghi đè từ lớp trừu tượng, phương thức này dùng để hiển thị thông tin nhân viên ra màn hình. 
Ví dụ nếu name = "Linh", address = "BN", balance = 10400 thì khi gọi phương thức display() màn hình sẽ hiển thị ra:

Customer name: Linh
Customer address: BN
Customer balance: 10400
 */
package BT44_tinh_truu_tuong;


public class Customer extends Person{
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Customer name: " + getName());
        System.out.println("Customer address: " + getAddress());
        System.out.println("Customer balance: " + balance);
    }
    
}
