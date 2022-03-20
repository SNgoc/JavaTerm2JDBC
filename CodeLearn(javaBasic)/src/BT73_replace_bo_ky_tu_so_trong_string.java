
import java.util.Scanner;

/*
 Lý thuyết
Như bạn đã được học về kiểu dữ liệu ký tự 
(bạn có thể xem lại tại bài này) kiểu ký tự bản chất cũng là một kiểu số nguyên, 
do đó bạn có thể duyệt và hiển thị các ký tự từ '0' -> '9', từ 'a' -> 'z' bằng vòng lặp giống như sau:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		for(char c = '0'; c <= '9'; c++) {
			System.out.print(c);
		}
		System.out.println();
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
		}
	}
}
Kêt quả khi chạy chương trình:

0123456789
abcdefghijklmnopqrstuvwxyz

Do đó bạn có thể lặp qua các ký tự số từ '0' tới '9' và sử dụng phương thức replace() để loại bỏ các số.
 */

/*
Bài tập:

Cho xâu s được nhập vào từ bàn phím, bạn hãy viết chương trình hiển thị ra màn hình những ký tự không phải là số trong xâu s.

Ví dụ:
Nếu bạn nhập s = "Codel9a83rn" thì màn hình sẽ hiển thị ra "Codelearn"
Nếu bạn nhập s = "black7cat" thì màn hình sẽ hiển thị ra "blackcat"
Gợi ý: Sử dụng phương thức replace() để loại bỏ hết các ký tự số trong xâu s.
*/
public class BT73_replace_bo_ky_tu_so_trong_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(char c = '0'; c <= '9';c++) {
            s = s.replace(c + "", "");//phải c +"", "" thì mới đc, ko replace sẽ báo lỗi
	}
        System.out.println(s);
    }
}
