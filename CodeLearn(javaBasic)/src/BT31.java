
import java.util.Scanner;

//Cho hai biến a và b kiểu số nguyên được nhập vào từ bàn phím, bạn hãy viết chương trình hiển thị ra màn hình true nếu a lớn hơn b, ngược lại hiển thị ra false.

public class BT31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        //true và false là hai giá trị thuộc kiêu dữ liệu boolean, kiểu dữ liệu này được dùng để lưu trữ giá trị của các biểu thức điều kiện. 
        //Trong Java để lấy ra giá trị của biểu thức a lớn hơn b bạn có thể dùng toán tử >
        
        System.out.println(a > b);
    }
}
