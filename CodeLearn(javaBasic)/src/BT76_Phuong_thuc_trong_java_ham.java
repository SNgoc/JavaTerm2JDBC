
import java.util.Scanner;

/*
LÝ THUYẾT:

Trong các chương trước bạn đã biết cách sử dụng các phương thức có sẵn như phương thức length(), toLowerCase(), indexOf(), ... 
qua bài này bạn sẽ hiểu được cách tạo và sử dụng phương thức trong Java.

Phương thức được hiểu đơn giản là 1 đoạn code, khi bạn gọi phương thức thì thực ra là bạn đang gọi tới đoạn code này. 
Cú pháp để khai báo một phương thức đơn giản sẽ giống như sau:

public static void <tên_phương_thức>(){
	// Các đoạn code bên trong phương thức
}

Ví dụ về phương thức hiển thị ra màn hình các số từ 1 tới 10:

public class Method {
	public static void show() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		show();
		show();
		show();
	}
}
Kết quả khi chạy chương trình:

1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 

Có thể thấy cách tạo và sử dụng phương thức rất đơn giản, chương trình trên hiển thị ra màn hình 3 lần các số từ 1 tới 10 do gọi tới phương thức show() 3 lần.
Ngoài ra bạn cũng có thể truyền các biến vào phương thức và trả về kết quả bằng từ khóa return <giá_trị_trả_về>;. Ví dụ về phương thức trả về tổng của một mảng các số nguyên:

import java.util.Scanner;
public class Method {
	public static int sumOfArray(int[] arr) {
		int answer = 0;
		// arr.length chính là lấy ra độ dài của mảng
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		int []arr1 = {1, 2, 3};
		int []arr2 = {2, 1, 7};
		int []arr3 = {3, 2, 2};
		System.out.println(sumOfArray(arr1));
		System.out.println(sumOfArray(arr2));
		System.out.println(sumOfArray(arr3));
	}
}

Kết quả khi chạy chương trình:
6
10
7
Trong ví dụ trên khi bạn gọi tới sumOfArray(arr1); thì biến arr1 trong phương thức main() sẽ được truyền vào biến arr trong phương thức sumOfArray().

Lưu ý: nếu phương thức có giá trị trả về thì bạn cần khai báo phương thức với kiểu dữ liệu cần trả về như int, String, double, ... 
thay vì void vì phương thức void là phương thức không có giá trị trả về 
(bạn hãy hiểu đơn giản phương thức void là phương thức chỉ thực thi 1 đoạn code, thực thi xong không cần có kết quả). 

Ví dụ khác về phương thức trả về số các số chẵn trong mảng:

import java.util.Scanner;
public class Method {
	public static int countEven(int[] arr) {
		int answer = 0;
		// arr.length chính là lấy ra độ dài của mảng
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int []arr1 = {1, 2, 3};
		int []arr2 = {2, 2, 7, 3};
		int []arr3 = {8, 2, 2, 5};
		System.out.println(countEven(arr1));
		System.out.println(countEven(arr2));
		System.out.println(countEven(arr3));
	}
}
Kết quả khi chạy chương trình:
1
2
3
Việc tách chương trình ra thành các phương thức nhỏ thay vì viết tất cả các đoạn code trong phương thức main() sẽ giúp bạn tái sử dụng lại được code, 
làm cho chương trình trở nên đơn giản, dễ hiểu hơn.
 */

/*
Bài tập
Bạn hãy viết phương thức trả về tổng của các phần tử trong mảng các số nguyên arr được nhập vào từ bàn phím.

Ví dụ
Nếu bạn nhập n = 3, arr = [2, 4, 1] thì màn hình sẽ hiển thị ra 7.
Nếu bạn nhập n = 4, arr = [2, 2, 3, 4] thì màn hình sẽ hiển thị ra 11.
*/
public class BT76_Phuong_thuc_trong_java_ham {
    /*
    Lưu ý: nếu phương thức có giá trị trả về thì bạn cần khai báo phương thức với kiểu dữ liệu cần trả về như int, String, double, ... 
    thay vì void vì phương thức void là phương thức không có giá trị trả về 
    (bạn hãy hiểu đơn giản phương thức void là phương thức chỉ thực thi 1 đoạn code, thực thi xong không cần có kết quả).
    */

    //Method
    public static int SumofArr(int[] arr) {//sử dụng khai báo int cho method phải có return
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        return sumArr;
    }
    
    //Main
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n phần tử:");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử arr[%d]:",i);
            arr[i] = sc.nextInt();
        }
        System.out.printf("Tổng %d phần tử trong mảng là: " + SumofArr(arr),n);
        System.out.println();
    }
}
