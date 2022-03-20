/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop.session3;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Session3_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {// 1 Project chỉ có 1 main
        // TODO code application logic here
        String name;
        int age;
        boolean gender;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên:");
        name = sc.nextLine(); //Dùng để nhập string
        System.out.println("Nhập tuổi:");
        age = sc.nextInt(); //Nhập số int
        System.out.println("Nhập giới tính: true/nam, false/nữ");
        gender = sc.nextBoolean();//hiển thị true/false
        
        System.out.println("Tên của bạn là " + name);
        System.out.println("Tuổi của bạn là " + age);
        //System.out.println("Giới tính của bạn là " + gender);
        
        System.out.printf("Giới tính của bạn là: %s\n", gender?"nam":"nữ");// dùng toán tử 3 ngôi để khi nhập true là nam, nhập false là nữ
    }
}
