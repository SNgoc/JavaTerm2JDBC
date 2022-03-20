
import java.util.Scanner;

/*
Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím. Bạn hãy viết chương trình hiển thị ra phần tử lớn nhất trong mảng. 
Ví dụ nếu bạn nhập n = 5, arr = [2, 7, 6, 8, 9] như bên dưới: 
5
2 7 6 8 9
Thì màn hình sẽ hiển thị: 9
 */
public class BT60_Array_tim_max {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max là " + max);
    }
}
