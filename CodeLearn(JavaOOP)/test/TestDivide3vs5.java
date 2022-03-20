
import Divide3vs5.Divide;
import static Divide3vs5.Divide.SumOfArr;
import static Divide3vs5.Divide.SumOfDivide3;
import static Divide3vs5.Divide.SumOfDivide3vs5;
import static Divide3vs5.Divide.SumOfDivide5;
import static Divide3vs5.Divide.SumOfNotDivide3vs5;
import java.util.Scanner;

/*
File này dùng để test file Divide3vs5.java
 */

/*
- Tìm 1 số chia hết cho 3 và 5 và tính tổng các số chia hết cho 3 và 5 trong số x nhập từ bàn phím và tổng mảng với n phần tử
- Tìm 1 số chia hết cho 3 và tính tổng các số chia hết cho 3 và 5 trong số x nhập từ bàn phím và tổng mảng với n phần tử
- Tìm 1 số chia hết cho 5 và tính tổng các số chia hết cho 3 và 5 trong số x nhập từ bàn phím và tổng mảng với n phần tử
- Tìm 1 số không chia hết cho 3 và 5 và tính tổng các số chia hết cho 3 và 5 trong số x nhập từ bàn phím và tổng mảng với n phần tử
 */
public class TestDivide3vs5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n:");
        int n = sc.nextInt();
        Divide dv = new Divide();
        dv.divide3vs5(n);
        //Để sử dụng được các phần tử trong mảng bạn cần phải khởi tạo cho từng phần tử.
        //Khai báo mảng với n phần tử
        double[] arr = new double[n];
        int[] arrInt = new int[n];
        //số thực
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử kiểu double arr[%d]: ",i);
            arr[i] = sc.nextDouble();
        }
        //số int
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập arrInt[%d]: ",i);
            arrInt[i] = sc.nextInt();
        }
        
        //Method tính tổng các phần tử trong mảng với điều kiện
        //Do các Method SumOFDivide yêu cầu đầu vào là array nên tham số phải là array

        System.out.println("Tổng các phần tử trong mảng là: " + SumOfArr(arr));
        System.out.println("Tổng các phần tử chia hết cho 3 và 5 là: "+ SumOfDivide3vs5(arr));
        System.out.println("Tổng các phần tử chia hết cho 3 là: "+ SumOfDivide3(arr));
        System.out.println("Tổng các phần tử chia hết cho 5 là: "+ SumOfDivide5(arr));
        System.out.println("Tổng các phần tử không chia hết cho 3 và 5 là: "+ SumOfNotDivide3vs5(arr));
    }
}
