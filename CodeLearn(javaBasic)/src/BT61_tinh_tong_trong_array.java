
import java.util.Scanner;

/*
Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím. 
Bạn hãy viết chương trình hiển thị ra tổng của phần tử đầu tiên và cuối cùng trong mảng arr. 
Ví dụ nếu bạn nhập n = 5, arr = [2, 7, 6, 8, 9] như bên dưới:
5
2 7 6 8 9
Thì màn hình sẽ hiển thị: 11
 */
public class BT61_tinh_tong_trong_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sumArr = arr[0] + arr[n-1];
        System.out.println("SumArr của phần tử đầu và cuối là " + sumArr);
    }
}
