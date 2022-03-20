
import java.util.Scanner;

//Viết chương trình nhập từ bàn phím số nguyên a. 

//Bạn hãy kiểm tra xem a có nằm trong đoạn [10, 100] không, nếu có thì hiển thị ra màn hình: {P} is in the range [10, 100]
//Ngược lại hiển thị ra màn hình: {P} is not in the range [10, 100]
//Với {P} là giá trị của biến a.
public class BT38_kiem_tra_1_so_co_trong_1_doan_ko {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (10 <= a && a <= 100) {
            System.out.printf("%d is in the range [10, 100]", a);
        } else {
            System.out.printf("%d is not in the range [10, 100]", a);
        }
    }
}
