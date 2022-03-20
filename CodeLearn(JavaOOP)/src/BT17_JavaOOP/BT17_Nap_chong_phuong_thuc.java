
/*
LÝ THUYẾT: Nạp chồng phương thức
Nếu một lớp có nhiều phương thức cùng tên nhưng khác nhau về kiểu dữ liệu hoặc số các tham số, thì đó là nạp chồng phương thức.

Ví dụ bạn có thể tạo ra 2 hàm add để tính tổng số nguyên và số thực như sau:
class Math {
    public static int add(int a, int b) {
    return a + b;
    }
    public static double add(double a, double b) {
    return a + b;
    }
}
class Entry {
    public static void main(String[] args) {
        System.out.println(Math.add(2, 4));
        System.out.println(Math.add(3.5, 4.3));
    }
}
Kết quả khi chạy chương trình:
6
7.8
Có thể thấy bạn không cần tạo ra 2 hàm với tên khác nhau để tính tổng 2 số. Đây
cũng là cách mà lớp Math tạo ra phương thức abs().
Source code của phương thức abs() trong lớp Math sẽ giống như sau:
class Math{
    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }

    public static long abs(long a) {
        return (a < 0) ? -a : a;
    }
    public static double abs(double a) {
        return (a <= 0.0D) ? 0.0D - a : a;
    }
}
Ngoài ra bạn còn có thể nạp chồng phương thức bằng cách thay đổi số tham số của phương thức:
class Math {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public static int max(int a, int b, int c) {
        int maxValue = a;
        if(maxValue < b) {
            maxValue = b;
            }
        if(maxValue < c) {
            maxValue = c;
        }
        return maxValue;
    }
}
class Entry {
    public static void main(String[] args) {
        System.out.println(Math.max(4, 5));
        System.out.println(Math.max(4, 5, 7));
    }
}
Kết quả khi chạy chương trình:
5
7

Ngoài ra, các phương thức được nạp chồng còn có thể gọi tới nhau:

class Math {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
        public static int max(int a, int b, int c) {
            return max(max(a, b), c);
        }

}
class Entry {
    public static void main(String[] args) {
        System.out.println(Math.max(4, 5));
        System.out.println(Math.max(4, 5, 7));
    }
}
Kết quả khi chạy chương trình:
5
7

Lưu ý: trong các ví dụ của bài này tôi đều dùng phương thức static nhưng bạn
hoàn toàn có thể thực hiện nạp chồng phương thức đối với các phương thức nonstatic .
Lợi ích của nạp chồng phương thức
Nạp chồng phương thức giúp bạn tránh được việc tạo ra các phương thức với tên
gọi khác nhau, giúp cho code trở nên gọn gàng, dễ đọc hơn
*/

/*
BÀI TẬP 17:
Bạn hãy tạo ra lớp ArrayCalculator trong file ArrayCalculator.java với thông tin giống như sau:

ArrayCalculator:
+sumOfArray(arr: int[]): int
+sumOfArray(arr: double[]): double

Giải thích:

ArrayCalculator là lớp không có thuộc tính nào.
sumOfArray(arr: int[]) là phương thức static có đầu vào là mảng các số nguyên và trả về tổng của mảng này.
sumOfArray(arr: double[]) là phương thức static có đầu vào là mảng các số thực và trả về tổng của mảng này.

Chương trình để test lớp ArrayCalculator:

class Entry {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 4, 2};
		double[] arr2 = new double[] {1.3, 4.2, 6.7};
		System.out.println(ArrayCalculator.sumOfArray(arr1));
		System.out.println(ArrayCalculator.sumOfArray(arr2));
	}
}
Kết quả khi chạy chương trình:

9
12.2
 */

package BT17_JavaOOP;


public class BT17_Nap_chong_phuong_thuc {
    
    public static int SumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    public static double SumOfArray(double [] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
