
import java.util.Scanner;
//Bạn hãy viết chương trình nhập vào từ bàn phím số nguyên a và b. 
//Sau đó hiển thị ra màn hình tổng các số từ a tới b (với a<b):
//Ví dụ nếu nhập a = 5, b = 9 thì chương trình sẽ hiển thị ra màn hình: 35
//Giải thích: 5 + 6 + 7 + 8 + 9 = 35
public class BT45_vong_lap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
