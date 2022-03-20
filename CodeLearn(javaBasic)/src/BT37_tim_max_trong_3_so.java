
import java.util.Scanner;

//Viết chương trình nhập từ bàn phím 3 số nguyên. Sau đó hiển thị lên màn hình số lớn nhất trong 3 số này.

public class BT37_tim_max_trong_3_so {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max = a;
        if (max <= b) {
            max = b;
            if (max <= c) {
                max = c;
            }
        }
        else{
            if (max <= c) {
                max = c;
            }
        }
        System.out.println("Max is " + max);
    }
}
