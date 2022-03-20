/*
Tạo lớp kiểm thử Java Main Class, AccountTest.java , bao gồm 2 phương thức :
a. menu() : tạo thực đơn thực hiện chức năng gởi và rút tiền.
b. main() : gọi phương thức menu() để thi hành chương trình.

b. Trong lớp AccountTest:
i. Khi khởi tạo đối tượng acc trong phương thức menu()– cho phép user nhập vào mã
TK và số dư ban đầu của TK.
ii. Khi in ra số dư TK của khách hàng, xuất thêm mã TK.

 */
package Assignment_Lab3;

import java.util.Scanner;


public class TestAccount {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        int amount;
        System.out.println("Hệ thống gửi/rút tiền tự động.");
        System.out.print("Nhập số TK:");
        long tk = sc.nextLong();
        acc.setAccNo(tk);
        System.out.print("Nhập số dư ban đầu:");
        float balance = sc.nextFloat();
        acc.setBalance(balance);
        int n;
        do {
            System.out.println("******************************");
            System.out.println("*        1.Gửi tiền          *");
            System.out.println("*        2.Rút tiền          *");
            System.out.println("*        3.Xem số dư         *");
            System.out.println("*        4.Thoát             *");
            System.out.println("******************************");
            System.out.print("Nhập lệnh:");
            n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.print("Nhập số tiền gửi:");
                    amount = sc.nextInt();
                    acc.deposit(amount);
                    break;
                case 2:
                    System.out.print("Nhập số tiền rút:");
                    amount = sc.nextInt();
                    acc.withdraw(amount);
                    break;
                case 3:
                    System.out.printf("Số TK %d có số dư là %.3f USD.\n",acc.getAccNo(),acc.getBalance());
                    break;
                case 4:
                    System.out.println("Quit!!!");
                    return;
                default:
                    System.out.println("Sai lệnh, mời nhập lại!!!");
            }
        } while(n != 4);
        
    }
}
