
import java.util.Scanner;

//Viết chương trình nhập vào tên của 2 người, bạn hãy kiểm tra xem tên của 2 người này có giống nhau không. 
//Nếu có thì hiển thị ra: two people have the same name
//Ngược lại nếu tên của 2 người này không giống nhau thì hiển thị ra: two people don't have the same name
public class BT35_if_else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name1, name2;
        name1 = sc.nextLine();
        name2 = sc.nextLine();
        if (name1.equals(name2)) {//nên dùng equal() khi so sánh string
            System.out.println("two people have the same name");
        } else {
            System.out.println("two people don't have the same name");
        }
    }
}
