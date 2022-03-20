
import java.util.Scanner;

/*
 Cho xâu s được nhập vào từ bàn phím, 
bạn hãy viết chương trình hiển thị ra màn hình số các ký tự in hoa trong xâu s.

Ví dụ
Nếu bạn nhập s = "CodeLearn" thì màn hình sẽ hiển thị ra 2.
Giải thích: trong xâu s có 2 ký tự in hoa.
Nếu bạn nhập s = "ABC123" thì màn hình sẽ hiển thị ra 3.
 */
public class BT74_dem_ky_tu_in_hoa_trong_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập string s: ");
        String s = sc.nextLine();
        int countUpper = 0;
        for (int i = 0; i < s.length(); i++) {
            for (char j = 'A'; j <= 'Z'; j++) {
                if (s.charAt(i) == j) {
                    countUpper++;
                }
            }
        }
        System.out.printf("String %s có %d ký tự in hoa\n",s,countUpper);
    }
}
