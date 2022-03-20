/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S12_throw;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Student {
    private String id, name;
    private int mark, age;
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID:");
        id = sc.nextLine();
        System.out.print("Name:");
        name = sc.nextLine();
        while (true) {            
            System.out.print("Mark:");
            try {
                mark = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                sc.nextLine();// dung dong nay de fix loi infinity loop
                System.out.println("Error: wrong format input");
            }
        }
        while (true) {            
            System.out.print("Age:");
            try {
                //cach 2 khong can dung sc.nextLine();
                age = Integer.parseInt(sc.nextLine()); //chuyen doi tu string sang int sau khi nhap
                break;
            } catch (Exception e) {
                System.out.println("Error: wrong format input");
            }
        }
        
        
    }
    void output(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student();
        s.input();
        s.output();
    }
    
}
