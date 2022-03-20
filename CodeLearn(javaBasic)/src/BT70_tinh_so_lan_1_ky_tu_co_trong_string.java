
import java.util.Scanner;

/*
LÝ THUYẾT:
Để lấy ra độ dài của một String bạn dùng phương thức length(). Ví dụ:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		System.out.print(s.length());
	}
}
Kết quả khi chạy chương trình: 9

Kết hợp với phương thức charAt() ở bài trước, bạn có thể dùng vòng lặp để duyệt qua các ký tự trong String giống như sau:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
Kết quả khi chạy chương trình:
C
o
d
e
l
e
a
r
n
Ngoài ra bạn cũng có thể dùng phương thức toCharArray() để chuyển String về mảng các ký tự và duyệt giống như sau:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		for(char c:s.toCharArray()) {
			System.out.println(c);
		}
	}
}
 */

/*BÀI TẬP:
Cho xâu s và ký tự c được nhập từ bàn phím. 
Bạn hãy viết chương trình in ra số lần xuất hiện của ký tự c trong xâu s.

Ví dụ nếu bạn nhập s = "Codelearn", c = 'e' như bên dưới:
Codelearn
e
Thì màn hình sẽ hiển thị ra: 2
Giải thích: ký tự thứ 'e' xuất hiện 2 lần trong xâu "Codelearn"
*/
public class BT70_tinh_so_lan_1_ky_tu_co_trong_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi s: ");
        String s = sc.nextLine();
        System.out.printf("Nhập ký tự cần tìm trong string %s: ",s);
        char c = sc.next().charAt(0); //dùng để nhập kiểu char
        
        //Để lấy ra độ dài của một String bạn dùng phương thức length()
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            }
        }
        System.out.printf("Số lần ký tự '%s' xuất hiện trong %s là %d",c,s,count);
        System.out.println();
    }
}
