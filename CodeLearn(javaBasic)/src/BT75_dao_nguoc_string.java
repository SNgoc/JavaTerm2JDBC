
import java.util.Scanner;

/*
 Cho xâu s được nhập và từ bàn phím, bạn hãy viết chương trình đảo ngược xâu s và hiển thị ra màn hình.

Ví dụ
Nếu bạn nhập s = "Codelearn" thì màn hình sẽ hiển thị ra "nraeledoC"
Nếu bạn nhập s = "ABC" thì màn hình sẽ hiển thị ra "CBA"
 */
public class BT75_dao_nguoc_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập string s:");
        String str = sc.nextLine();
        //đảo ngược string s
        String rts = "";
        for (int i = str.length() -1; i >= 0; i--) {//thuật toán đảo ngược string
            rts += str.charAt(i);
        }
        System.out.printf("String %s sau khi đảo ngược là %s\n",str,rts);
    }
}
