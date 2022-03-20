
import java.util.Scanner;

//Bạn hãy viết chương trình nhập từ bàn phím hai số nguyên a và b. 
//Sau đó hiển thị ra màn hình các số từ a tới b mà chia hết cho cả 3 và 5.
//Ví dụ nếu nhập a = 1, b = 50 thì chương trình sẽ hiển thị ra màn hình: 15 30 45
public class BT54_tim_so_chia_het_cho_3_va_5 { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        while (a <= b) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
