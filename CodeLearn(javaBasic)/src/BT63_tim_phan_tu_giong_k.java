
import java.util.Scanner;

/*
Cho một mảng các số nguyên n phần tử arr và số nguyên k được nhập từ bàn phím. 
Bạn hãy viết chương trình hiển thị ra màn hình số phần tử có giá trị bằng k trong mảng arr.

Ví dụ nếu bạn nhập n = 6, arr = [3, 8, 7, 8, 3, 3], k = 3 như bên dưới:
6
3 8 7 8 3 3
3
Thì màn hình hiển thị lên: 3
Giải thích: trong mảng có 3 phần tử có giá trị bằng 3.
 */
public class BT63_tim_phan_tu_giong_k {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhập k: ");
        int k = sc.nextInt();
        //tìm số phần tử giống k trong arr
        int countk = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                countk ++;
            }
        }
        System.out.printf("trong mảng có %d phần tử có giá trị bằng %d", countk,k);
    }
}
