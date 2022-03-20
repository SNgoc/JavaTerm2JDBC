/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaS4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mark;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap Diem:");
        mark =sc.nextInt();
        if (mark<40)
        {
            System.out.println("Fail");
            
        }
        else if(mark>=40 && mark<60)
        {
            System.out.println("Trung binh");
        }
        else if(mark>=60 && mark<70)
        {
            System.out.println("Kha");
        }
        else 
        {
            System.out.println("Gioi");
        }
         //tinh tien dien, neu xai 100kw , 1kw = 1200
         // neu xai nhieu hon 100kw, 1kw = 1500 vuot muc
         //neu xai nhieu hon 200kw, 1kw =2000 vuot muc
         
         
         int x;
         
         int sum;
        
         System.out.println("Nhap so kw :");
         x=sc.nextInt();
         if(x<=100)
         {
             sum=x*1200;
             
         }
         else if(x<=200)
         {
             sum=(x-100)*1500+(100*1200);
             
         }
         else
         {
             sum=(100*1200)+(100*1500)+(x-200)*2000;
             
         }
         System.out.println("tong tien la:"+sum);
    }
    
}