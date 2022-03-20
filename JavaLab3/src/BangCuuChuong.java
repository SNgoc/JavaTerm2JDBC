
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
public class BangCuuChuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên N: ");
        int n = sc.nextInt();
        int i = 1;
        while (i<10) {            
            System.out.printf("%d * %d = %d \n",n,i,n*i);
            i++;
        }
    }
}
