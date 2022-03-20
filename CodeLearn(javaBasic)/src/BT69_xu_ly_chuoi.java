
import java.util.Scanner;

/*LÝ THUYẾT:
String bản chất cũng giống như một mảng các ký tự, 
để lấy ra ký tự thứ k bên trong String bạn có thể dùng 
PHƯƠNG THỨC: charAt(k - 1); 
(String cũng giống như mảng, ký tự thứ k có chỉ số là k - 1):

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		System.out.print(s.charAt(1));
	}
}
Sẽ hiển thị ra màn hình: o
*/



/*BÀI TẬP:
Cho xâu s và số nguyên k được nhập từ bàn phím. 
Bạn hãy viết chương trình in ra màn hình ký tự thứ k trong xâu s.

Ví dụ nếu bạn nhập s = "Codelearn", k = 2 như bên dưới:
Codelearn
2
Thì màn hình sẽ hiển thị ra: o
Giải thích: ký tự thứ 2 trong xâu Codelearn là ký tự o
 */
public class BT69_xu_ly_chuoi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập String s: ");
        String s = sc.nextLine();
        System.out.printf("\nNhập số k để lấy ký tự thứ k trong String %s: ",s);
        int k = sc.nextInt();
        System.out.printf("Ký tự thứ %d trong %s là: %s",k,s,s.charAt(k-1)); //Phải là k - 1 do trong string index tính từ 0
        System.out.println();
    }
}
