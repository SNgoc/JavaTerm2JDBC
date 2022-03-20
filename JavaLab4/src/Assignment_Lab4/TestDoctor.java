/*
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

/**
 *
 * @author asus
 */
public class TestDoctor {

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Doctor d = new Doctor();
        String n;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Nhap thong tin doctor                       *");
            System.out.println("*        2.Xuat thong tin doctor                       *");
            System.out.println("*        3.In cap bac                                  *");
            System.out.println("*        4.Nhap so ngay lam viec va tinh thu nhap      *");
            System.out.println("*        5.Thoát                                       *");
            System.out.println("********************************************************");
            System.out.print("Nhap lenh:");
            n = sc.nextLine();
            switch(n){
                case "1":
                    System.out.println("Nhap thong tin doctor:");
                    d.input();
                    break;
                case "2":
                    System.out.println("Xuat thong tin doctor:");
                    d.InfoDoc();
                    break;
                case "3":
                    System.out.println("In cap bac:");
                    d.Cap_bac();
                    break;
                case "4":
                    System.out.println("Nhap so ngay lam viec va tinh thu nhap:");
                    d.income();
                    break;
                case "5":
                    System.out.println("Quit!!!");
                    return;
                default:
                    System.out.println("Sai lệnh, mời nhập lại!!!");
            }
        } while(!"5".equals(n));
    }
    public static void main(String[] args) {
        menu();
    }
    
}
