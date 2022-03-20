
import java.util.Scanner;

//Bạn hãy viết chương trình nhập từ bàn phím một số nguyên n và hiển thị ra màn hình các ước của n (n > 0).
//Ví dụ nếu nhập n = 12 thì chương trình sẽ hiển thị ra màn hình: 1 2 3 4 6 12

public class BT49_tim_uoc_n {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
