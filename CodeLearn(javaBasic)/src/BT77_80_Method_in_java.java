
import java.util.Scanner;

/*
Bài tập 77:
Bạn hãy viết phương thức hiển thị ra màn hình các số chia hết cho 3 mà không chia hết cho 5 trong mảng các số nguyên arr được nhập vào từ bàn phím.

Ví dụ:
Nếu bạn nhập n = 4, arr = [3, 7, 15, 18] thì màn hình sẽ hiển thị ra:
3 18 ​
Ví dụ nếu bạn nhập n = 5, arr = [30, 20, 21, 15, 30] thì màn hình sẽ hiển thị ra:
21 ​
 */

/*
Bài tập 78:
Bạn hãy viết phương thức hiển thị ra màn hình những xâu có độ dài lớn hơn 3 trong mảng arr.

Ví dụ
Nếu bạn nhập n = 3, arr = ["abcd", "ab", "xyz"] thì màn hình sẽ hiển thị ra:
abcd​
Nếu bạn nhập n = 4, arr = ["1234", "abcde", "xy", "code"] thì màn hình sẽ hiển thị ra:
1234 abcde code​
*/

/*
Bài tập 79:
Bạn hãy viết phương thức trả về số lớn nhất trong n số được nhập vào từ bàn phím.

Ví dụ
Nếu bạn nhập n =3, arr = {6,2,8} thì màn hình sẽ hiển thị ra 8.
Nếu bạn nhập n =3, arr = {4,4,4} thì màn hình sẽ hiển thị ra 4.
*/

public class BT77_80_Method_in_java {

    //Method BT77
    public static void BT77(int[] arr) {
        System.out.print("Các số chia hết cho 3 mà không chia hết cho 5:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    
    //Method BT78
    public static void BT78(String[] arr) {
        System.out.println("Những xâu có độ dài lớn hơn 3 trong mảng arr:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 3) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    
    //Method BT79
    public static int BT79(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n phần tử arr:");
        int n = sc.nextInt();
        sc.nextLine();//fix lỗi nhập số trc chữ
        //khai báo mảng arr với n phần tử
        
        //Bài tập 77: Các số chia hết cho 3 mà không chia hết cho 5
        /*
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập arr[%d]:",i);
            arr[i] = sc.nextInt();
        }
        BT77(arr);
        */
        
        //Bài tập 78: Những xâu có độ dài lớn hơn 3 trong mảng arr
        /*
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập arr[%d]:",i);
            arr[i] = sc.nextLine();
        }
        BT78(arr);
        */
        
        //Bài tập 79: Số lớn nhất trong 3 số được nhập vào từ bàn phím
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập arr[%d]:",i);
            arr[i] = sc.nextInt();
        }
        System.out.printf("Số lớn nhất trong %d số được nhập vào từ bàn phím: %d\n",n,BT79(arr));
    }
}
