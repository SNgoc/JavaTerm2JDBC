
import java.util.Scanner;


//viết chương trình nhập vào một ký tự từ bàn phím và thực hiện hiển thị ký tự tiếp trong bảng bảng chữ cái của ký tự đó ra màn hình

//Lớp Scanner không cung cấp phương thức để nhập dữ liệu cho biến kiểu char, thay vào đó bạn phải nhập dữ liệu cho kiểu String và lấy ra ký tự đầu tiên trong String

//CODE MẪU
//import java.util.Scanner;
//
//public class Input {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char c = (char) (sc.next().charAt(0) + 1);
//		System.out.println(c);
//	}
//}

public class BT30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char c = (char) (sc.next().charAt(0) + 1); //sc.next().charAt(0) dùng để nhập kiểu char trong java
        System.out.println(c);
    }
}
