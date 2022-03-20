
import java.util.Scanner;

/*
 LÝ THUYẾT:
Lớp String (bạn cũng có thể hiểu là kiểu dữ liệu String) đã cung cấp sẵn khá nhiều phương thức cho việc xử lý xâu, 
sau đây là một số phương thức hay được sử dụng:

1. Phương thức length
Như bạn đã được học ở bài trước, đây là phương thức trả về độ dài của một String. Ví dụ:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Code";
		System.out.print(s.length());
	}
}

Kết quả khi chạy chương trình:
4

2. Phương thức charAt
Đây là phương thức trả về một ký tự trong String. Ví dụ:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Code";
		System.out.print(s.charAt(2));
	}
}

Kết quả:
d

3. Phương thức replace
Phương thức này dùng để thay thế các chuỗi/ký tự được tìm thấy thành chuỗi/ký tự khác. Ví dụ:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		System.out.println("Cod3l3arn".replace('3', 'e'));
		System.out.println("Blackcat".replace("Black", "White"));
	}
}

Kết quả khi chạy chương trình:
Codelearn
Whitecat

4. Phương thức toUpperCase/toLowerCase
Đây là hai phương thức dùng để chuyển các ký tự của một xâu từ in thường về in hoa và ngược lại. Ví dụ:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "CoDeLeArN";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}
}

Kết quả khi chạy chương trình:
CODELEARN
codelearn

5. Phương thức indexOf
Phương thức này trả về vị trí xuất hiện đầu tiên của một String trong String khác, nếu không tìm thấy thì trả về -1. Ví dụ:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		System.out.println(s.indexOf("learn"));
		System.out.println(s.indexOf("black"));
	}
}

Kết quả khi chạy chương trình:
4
-1

6. Phương thức startsWith và endsWith
Phương thức này dùng để kiểm tra một xâu có bắt đầu hoặc kết thúc băng một xâu khác không. Ví dụ:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String name = "Codelearn";
		System.out.println(name.startsWith("Code"));
		System.out.println(name.startsWith("abc"));
		System.out.println(name.endsWith("rn"));
		System.out.println(name.endsWith("z"));
	}
}

Kết quả khi chạy chương trình:
true
false
true
false

7. Phương thức split
Phương thức này dùng để tách một xâu ra thành mảng các xâu dựa trên một xâu cho trước. Ví dụ:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Welcome to codelearn!";
		String[] words = s.split(" ");
		for(String word:words) {
			System.out.println(word);
		}
	}
}

Kết quả khi chạy chương trình:
Welcome
to
codelearn!

8. Phương thức substring

Đây là phương thức dùng để lấy ra một xâu con dựa trên chỉ số bắt đầu và chỉ số kết thúc của một xâu khác. Ví dụ:

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String name = "Codelearn";
		System.out.println(name.substring(0, 2));
		System.out.println(name.substring(0, 4));
		System.out.println(name.substring(4));
	}
}

Kết quả khi chạy chương trình:
Co
Code
learn
Đọc tới đây bạn đã biết về một số phương thức dùng để xử lý xâu. 
Quay trở lại phần bài tập, bạn có thể dùng phương thức toLowerCase() và indexOf() để giải bài này.
 */

/*BÀI TẬP:
Cho hai xâu ký tự s1 và s2 được nhập vào từ bàn phím, 
bạn hãy viết chương trình hiển thị ra vị trí đầu tiên mà s2 xuất hiện trong s1 (không phân biệt hoa thường).

Ví dụ
Nếu bạn nhập s1 = "Codelearn", s2 = "LEARN" thì màn hình sẽ hiển thị ra 4.
Giải thích: xâu "LEARN" xuất hiện tại vị trí thứ 4 trong xâu "Codelearn" (không phân biệt hoa thường nên "LEARN" hay "learn" đều được coi là như nhau).
Nếu bạn nhập s1 = "blackcat", s2 = "lack" thì màn hình sẽ hiển thị ra 1.
*/
public class BT72_tim_string_trong_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Nhập string 2: ");
        String s2 = sc.nextLine();
        //Do bài tập yêu cầu tìm vị trí đầu tiên mà xâu s2 xuất hiện trong s1 không phân biệt in thường/in hoa 
        //nên bạn cần chuyển 2 xâu này về cùng một dạng là in thường hoặc in hoa, sau đó sử dụng phương thức indexOf()
        if (s1.toLowerCase().indexOf(s2.toLowerCase()) >= 0) {
            System.out.printf("Vị trí của %s trong %s là %d\n",s2,s1,s1.toLowerCase().indexOf(s2.toLowerCase()));
        }
        else {
            System.out.printf("Không tìm thấy %s trong %s\n",s2,s1);
        }
    }
}
