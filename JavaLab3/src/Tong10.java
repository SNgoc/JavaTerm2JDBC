/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Tong10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int sum = 0;
        int count = 1;
        do {        
            sum += count;
            count++;
        } while (count <=10);
        System.out.printf("Tong 10 so nguyen dau tien là: %d \n",sum);
    }
}
