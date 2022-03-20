
import java.util.Scanner;

//Bạn hãy viết chương trình nhập vào bàn phím số nguyên n và hiển thị ra các số chẵn từ n tới 100.
//Ví dụ nếu nhập n = 90 thì chương trình sẽ hiển thị ra màn hình: 90 92 94 96 98 100
public class BT51_while {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n <=100) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n++;
        }
    }
}
