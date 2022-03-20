
import java.util.Scanner;

//Bạn hãy viết chương trình nhập từ bàn phím số nguyên n và hiển thị ra màn hình n! (n giai thừa).
//Ví dụ nếu nhập n = 5 thì chương trình sẽ hiển thị ra màn hình: 120
//Giải thích: 1 * 2 * 3 * 4 * 5 = 120.

public class BT48_tinh_giai_thua {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        }
        else if (n == 1) {
            System.out.println(1);
        }
        else if (n > 1) {
            long giaithua = 1;
            for (int i = 1; i <= n; i++) {
                giaithua *= i;
            }
            System.out.println(giaithua);
        }
    }
}
