
import java.util.Scanner;

/*
 Cho một mảng các số nguyên n phần tử arr. 
Bạn hãy viết chương trình sắp xếp các phần tử của mảng theo thứ tự tăng dần và hiển thị ra màn hình mảng sau khi đã sắp xếp.

Ví dụ nếu bạn nhập n = 6, arr = [5,3,2,6,7,7] như bên dưới:
6
5 3 2 6 7 7
Thì màn hình hiển thị lên: 2 3 5 6 7 7
 */
public class BT66_sap_xep_cac_phan_tu_trong_mang_theo_tang_dan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n phần tử:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập arr[%d]:",i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Array trước khi sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray sau khi sort: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Nếu arr[i] > arr[j] thì hoán đổi giá trị của arr[i] và arr[j]
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
