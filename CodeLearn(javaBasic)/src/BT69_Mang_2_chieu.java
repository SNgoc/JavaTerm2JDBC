
import java.util.Scanner;

/*
Cho một mảng 2 chiều các số nguyên n hàng m cột arr được nhập từ bàn phím. Bạn hãy viết chương trình tính tổng các phần tử chia hết cho 5 và 3 trong arr.
Ví dụ nếu bạn nhập n = 3, m = 4, arr = [[15, 4, 8, 2], [5, 6, 30, 9], [20, 3, 45, 1]] như bên dưới:
3 4
15 4 8 2
5 6 30 9
20 3 45 1
Thì màn hình sẽ hiển thị ra: 90
Giải thích: Tổng các phần tử chia hết cho 5 trong arr là 15 + 30 + 45 = 90.
 */
public class BT69_Mang_2_chieu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n hàng: ");
        int n = sc.nextInt();
        System.out.print("Nhập m cột: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        for (int i = 0; i < n; i++) {//hàng
            for (int j = 0; j < m; j++) {//cột
                System.out.printf("Nhập arr[%d][%d]: ",i,j);
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
        
        //Tính tổng các phần tử chia hết cho 5
        int sumArr = 0;
        for (int i = 0; i < n; i++) {//hàng
            for (int j = 0; j < m; j++) {//cột
                //tìm các phần tử chia hết cho 5
                if (arr[i][j] % 5 == 0 && arr[i][j] % 3 == 0) {
                    sumArr += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử chia hết cho 5 và 3 trong arr là: "  + sumArr);
    }
}
