
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Giaithua {

    /**
     * @param args the command line arguments
     */
    public static long tinhGiaithua(int n){
        long kq = 1;
        if (n==0 || n == 1) {
            return kq;
        }else{
            for (int i = 2; i <= n; i++) {
                kq *= i;
            }
            return kq;
        }
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số x tính giai thừa:");
        int x = sc.nextInt();
        System.out.printf("Kết quả giai thừa %d là: %d \n",x, Giaithua.tinhGiaithua(x));
    }
}
