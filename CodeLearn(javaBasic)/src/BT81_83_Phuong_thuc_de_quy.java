
import java.util.Scanner;

/*
 Lý thuyết
Phương thức đệ quy là phương thức mà gọi tới chính nó, ví dụ một phương thức đệ quy sẽ trông giống như sau:

public static void recurse() {
    ...
    recurse();
    ...
}

Do tính chất tự gọi lại chính nó nên để tránh việc chạy không bao giờ dừng bạn luôn cần có điểm dừng 
(điểm dừng được hiểu đơn giản là tới một lúc nào đó, phương thức đệ quy sẽ không gọi lại chính nó nữa).

Mô tả phương thức đệ quy tính 5!:

factorial(5)
= 5 * factorial(4)
= 5 * 4 * factorial(3)
= 5 * 4 * 3 * factorial(2)
= 5 * 4 * 3 * 2 * factorial(1)
= 5 * 4 * 3 * 2 * 1
= 120
Điểm dừng ở ví dụ trên chính là khi đầu vào của phương thức factorial bằng 1 thì phương thức factorial sẽ trả về 1 thay vì gọi tiếp tới chính nó.

Để hiểu rõ hơn bạn hãy xem ví dụ tiếp theo về phương thức đệ quy tính tổng các số từ 1 tới n:

import java.util.Scanner;
public class Method {
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		System.out.print(sum(10));
	}
}
Kết quả khi chạy chương trình: 55
Điểm dừng ở đây chính là khi n = 0 thì phương thức sum sẽ trả về 0 thay vì gọi tiếp tới chính nó.
 */

/*
Bài tập 81:
Cho số nguyên dương n được nhập từ bàn phím, bạn hãy viết phương thức đệ quy trả về n! (n giai thừa).
Ví dụ nếu bạn nhập n = 5 thì chương trình sẽ hiển thị lên màn hình 120.
*/

/*
Bài tập 82:
Cho số nguyên n được nhập từ bàn phím, bạn hãy viết phương thức đệ quy trả về tổng các số lẻ từ 1 tới n.
Ví dụ nếu bạn nhập n = 5 thì chương trình sẽ hiển thị lên màn hình 9 (do 1 + 3 + 5 = 9).
*/

/*
Bài tập83
Cho mảng các số nguyên n phần tử arr được nhập từ bàn phím. Bạn hãy viết phương thức đệ quy tính tổng các phần tử của mảng.

Hướng dẫn
Bài này cũng khá giống bài trước, bạn chỉ cần lưu ý rằng phần tử đầu tiên của mảng là a[0] chứ không phải là a[1].
*/

public class BT81_83_Phuong_thuc_de_quy {

    //Method81
    public static int giaithua(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return n * giaithua(n-1); //phương thức đệ quy
    }
    
    //Method82
    public static int sumOdd(int n){
        if (n == 1) {
            return 1;
        }
        if (n %2 == 0) {
            return 0 + sumOdd(n-1);
        }
        else{
            return n + sumOdd(n-1);
        }
    }
    
    //Method83
    public static int sumOfArray(int[] arr, int n) {
        if (n == 1){
            return arr[0];
        }
        return arr[n-1] + sumOfArray(arr,n-1);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n:");
        int n = sc.nextInt();
        
        //BT81
        System.out.printf("Giai thừa của %d là: %d\n",n,giaithua(n));
        
        //BT82
        System.out.printf("Tổng các số lẻ từ 1 đến %d là: %d\n",n,sumOdd(n));
        
        //BT83
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập arr[%d]:",i);
            arr[i] = sc.nextInt();
        }
        System.out.printf("Tổng %d phần tử trong mảng là: %d\n",n,sumOfArray(arr, n));
    }
}
