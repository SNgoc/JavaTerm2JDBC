
import java.util.Scanner;

//viết chương trình nhập vào từ bàn phím số nguyên n. Sau đó kiểm tra xem nếu n là số chẵn thì hiển thị ra

public class BT32_if_else {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("n is an even number");
        } else {
            System.out.println("n is an odd number");
        }
    }
}
