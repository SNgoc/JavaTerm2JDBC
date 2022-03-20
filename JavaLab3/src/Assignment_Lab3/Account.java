/*
Viết ứng dụng Java quản lý 1 tài khoản ngân hàng, cho phép thực hiện các giao dịch gởi, rút
tiền và xem số dư tài khoản theo hướng dẫn sau:

 */
package Assignment_Lab3;


/**
 *
 * @author asus
 */
public class Account {
    private long AccNo;
    private float balance;

    public Account(long AccNo, float balance) {
        this.AccNo = AccNo;
        this.balance = balance;
    }

    public Account() {
        balance = 0.0f;
    }

    public void setAccNo(long AccNo) {
        this.AccNo = AccNo;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public long getAccNo() {
        return AccNo;
    }

    public float getBalance() {
        return balance;
    }
    
    public void deposit(int amount){
        if (amount < 0) {
            System.out.println("Gửi thất bại, số tiền không đúng, mời nhập lại.");
            return;
        }
        balance += amount;
        System.out.println("Gửi thành công");
    }
    public void withdraw(int amount){           
        if (amount <= 0) {
            System.out.println("Số tiền không đúng, mời nhập lại.");
            return;
        }
        if (balance <= amount) {
            System.out.println("Số dư không đủ, mời nhập lại.");
            return;
        }
        balance -= amount;
        System.out.println("Rút thành công");
    }   
}
