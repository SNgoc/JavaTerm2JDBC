
import java.util.Scanner;
//Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên n và thực hiện hiển thị ra tổng các số lẻ từ 0 tới n.
//Ví dụ nếu nhập n = 7 thì chương trình sẽ hiển thị ra màn hình: 16
//Giải thích: 1 + 3 + 5 + 7 = 16
public class BT46_vong_lap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
