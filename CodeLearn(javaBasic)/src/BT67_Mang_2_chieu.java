
import java.util.Scanner;

/*
LÝ THUYẾT
Cũng như mảng một chiều dùng để lưu các giá trị có nét tương đồng. 
Thì mảng đa chiều chỉ là tăng số chiều lưu trữ nhiều chiều hơn, hay còn gọi là ma trận. 
Thường thường ta hay sử dụng mảng 2 chiều. Kteam sẽ nói 2 chiều là chính cho các bạn dễ hình dung. 
Trong ma trận 2 chiều, ta hay gọi chiều thứ 1 là hàng, còn chiều thứ 2 là cột.
Mảng 2 chiều hay còn được gọi là ma trận là một mảng các mảng 1 chiều. 
Mảng 2 chiều giống như một cái bảng, mảng 1 chiều là các dòng trong bảng và các phần tử của mảng là các ô.

*****CÚ PHÁP ĐỂ KHAI BÁO MẢNG 2 CHIỀU VỚI N HÀNG VÀ M CỘT TRONG JAVA: (tức mảng 2 chiều này chứa 2 mảng và mỗi mảng có 3 phần tử)
int[][] arr = new int[n][m];

Ví dụ chương trình nhập vào một mảng 2 chiều và in mảng 2 chiều này ra màn hình:

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
	}
}
Nếu bạn nhập

3 4
3 4 8 2
5 6 4 9
2 3 8 1
Thì chương trình sẽ hiển thị ra:

arr[0][0] = 3
arr[0][1] = 4
arr[0][2] = 8
arr[0][3] = 2
arr[1][0] = 5
arr[1][1] = 6
arr[1][2] = 4
arr[1][3] = 9
arr[2][0] = 2
arr[2][1] = 3
arr[2][2] = 8
arr[2][3] = 1
 */

/* Bài tập:
Cho một mảng 2 chiều các số nguyên n hàng m cột arr được nhập từ bàn phím. 
Bạn hãy viết chương trình tính tổng các phần tử trong mảng arr.

Ví dụ nếu bạn nhập n = 2, m = 3, arr = [[5, 7, 3], [1, 2, 4]] như bên dưới:
2 3
5 7 3
1 2 4
Thì màn hình sẽ hiển thị ra: 22
*/
public class BT67_Mang_2_chieu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n hàng:");
        int n = sc.nextInt();
        System.out.println("Nhập m cột:");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {//i hàng
            for (int j = 0; j < m; j++) {// j cột
                System.out.printf("Nhập arr[%d][%d]:",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        //Hiển thị ma trận mảng 2 chiều với n hàng m cột
        for (int i = 0; i < n; i++) {//i hàng
            for (int j = 0; j < m; j++) {// j cột
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); //xuống dòng khi chạy hết j cột
        }
        //Tính tổng các phần tử trong mảng
        int sumArr = 0;
        for (int i = 0; i < n; i++) {//i hàng
            for (int j = 0; j < m; j++) {// j cột
                sumArr += arr[i][j];
            }
        }
        System.out.printf("Tổng các phần tử trong mảng với %d hàng và %d cột là: %d\n", n,m,sumArr);
    }
}
