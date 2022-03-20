
import java.util.Scanner;

/*
Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím. 
Bạn hãy viết chương trình hiển thị ra màn hình những số chẵn trong mảng. 
Ví dụ nếu bạn nhập: 
5
2 7 6 8 9
Thì màn hình sẽ hiển thị: 2 6 8 
 */
public class BT62_tim_so_chan_trong_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
