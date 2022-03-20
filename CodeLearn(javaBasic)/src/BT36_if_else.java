
import java.util.Scanner;

//Viết chương trình nhập từ bàn phím 2 số nguyên a, b. Bạn hãy kiểm tra xem giá trị của cả a và b có khác 0 không. 
//Nếu có hiển thị: a is not equal to 0 and b is not equal to 0
//Ngược lại nếu a hoặc b có giá trị bằng 0 thì hiển thị: a is equal to 0 or b is equal to 0
public class BT36_if_else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a != 0 && b != 0) {
            System.out.println("a is not equal to 0 and b is not equal to 0");
        } else {
            System.out.println("a is equal to 0 or b is equal to 0");
        }
    }
}
