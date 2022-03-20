/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class JavaLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Chương trình kiểm tra IQ\n");
        
        String eng, apt;
        int math;
        String gKnow;
        int mark1,mark2,mark3,mark4;
        
        System.out.println("Dog là gì?");
        eng = sc.nextLine();
        System.out.println("Làm gì khi bị gặp gấu?");
        apt = sc.nextLine();
        System.out.println("1+1 = ");
        math = sc.nextInt();
        sc.nextLine();//Để sửa lỗi nextLine ko thực thi sau khi chạy nextInt
        System.out.println("Hành tinh nào lớn nhất trong hệ mặt trời?");
        gKnow = sc.nextLine();
        
        if ("dog".equals(eng)) {//sử dugn5 equal() để so sánh string
            mark1 = 10;
        } else {
            mark1 = 0;
        }
        if ("run".equals(apt)) {
            mark2 = 10;
        } else {
            mark2 = 0;
        }
        if (math == 2) {
            mark3 = 10;
        } else {
            mark3 = 0;
        }
        if ("jupiter".equals(gKnow)) {
            mark4 = 10;
        } else {
            mark4 = 0;
        }
        int Total;
        Total = mark1 + mark2 + mark3 + mark4;
        
        if (Total == 40) {
            Total += 10;
            System.out.printf("Bạn được thưởng thêm 10đ: %d", Total);
            System.out.println("\nYou are a genius");
        }
        if (Total == 30) {
            Total += 5;
            System.out.printf("Bạn được thưởng thêm 5đ: %d", Total);
            System.out.println("\nYou are intelligent");
        }
        if (Total == 20) {
            Total += 2;
            System.out.printf("Bạn được thưởng thêm 2đ: %d", Total);
            System.out.println("\nYour IQ level is average");
        }
    }
    
}
