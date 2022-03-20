
import java.util.Scanner;

//Bạn hãy viết chương trình nhập từ bàn phím hai số nguyên dương a và b. Sau đó hiển thị ra màn hình kết quả của a^b.
//Ví dụ nếu nhập a = 2, b = 3 thì chương trình sẽ hiển thị ra màn hình: 8
//Giải thích: 2 * 2 * 2 = 8.

public class BT53_tinh_a_mu_b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        long result = 1;
        while (b > 0) {            
            result *= a;
            b--;
        }
        System.out.println(result);
    }
}
