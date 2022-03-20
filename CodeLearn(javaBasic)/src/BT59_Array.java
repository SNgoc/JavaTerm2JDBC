
import java.util.Scanner;

/*
LÝ THUYẾT

Mảng được hiểu đơn giản là một tập hợp các biến.
Có thể thấy thay vì tạo ra 10 biến thì bạn chỉ cần tạo ra một mảng với 10 phần tử. 
Thay vì nhập dữ liệu và hiển thị từng biến thì bạn nhập dữ liệu và hiển thị các phần tử của mảng

Các phần tử của mảng được truy xuất bằng toán tử []. Ví dụ:

a[0] tương đương với phần tử thứ nhất.
a[1] tương đương với phần tử thứ hai.
...
Nhìn chung cách làm bài này với mảng cũng giống việc tạo ra nhiều biến, chỉ khác ở chỗ thay vì phải viết a0, a1, a2, ..., a9 thì bạn có thể dùng vòng lặp for và viết là a[i].

Ngoài ra bạn còn có thể khai báo và khởi tạo giá trị cho mảng giống như sau:

// Khai báo mảng a 5 phần tử với giá trị từ 1 tới 5
int[] a = {1, 2, 3, 4, 5};
*/

//Bạn hãy viết chương trình nhập vào từ bàn phím 10 số nguyên và hiển thị ra 10 số vừa nhập.
public class BT59_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Khai báo mảng a kiểu số nguyên với 10 phần tử
        int[] arr = new int[10];
        // Dùng vòng for để nhập dữ liệu cho các phần tử trong mảng
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        // Dùng vòng for để hiển thị các phần tử trong mảng
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
