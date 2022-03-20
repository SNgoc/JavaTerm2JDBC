
import java.util.Scanner;

/*
Cho một mảng các số nguyên n phần tử arr. Bạn hãy viết chương trình tính tổng các số lẻ lớn hơn 0 trong mảng.
Ví dụ nếu bạn nhập:
8
3 -7 2 5 9 -6 10 12
Thì màn hình hiển thị lên: 17
Giải thích: 3 + 5 + 9 = 17.
 */
public class BT64_tinh_sum_so_le_trong_mang {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n phàn tử arr:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử arr[%d]: ",i);
            arr[i] = sc.nextInt();
        }
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] >0) {
                sumOdd += arr[i];
            }
        }
        System.out.println("Tổng các số lẻ lớn hơn 0 là "+ sumOdd);
    }
}
