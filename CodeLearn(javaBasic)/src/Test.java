
import java.util.Scanner;
/*Cho một mảng các số nguyên n phần tử arr. 
//Bạn hãy viết chương trình hiển thị những số lớn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10 trong mảng arr.
Ví dụ nếu bạn nhập:
8
3 -7 2 5 9 -6 10 12
Thì màn hình hiển thị lên: 3 2 5 9 10
*/
public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n phàn tử arr:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử arr[%d]: ",i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Những số lớn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10 trong mảng arr:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <=10) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
