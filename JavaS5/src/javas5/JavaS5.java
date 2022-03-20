/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaS5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        while(i<=5)
        {
            System.out.println(i+"");
            i++;
        }
        //do while
        int j=0;
        do
        {
            System.out.println(j+"");
            j++;
        }while(j<=5);
        //khai bao 1 mang arr bao gom 5 phan tu kieu int
        int[] arr={1,2,3,4,5};
        //dung vong for de duyet cac phan tu trong mang
        for(int k=0; k < arr.length;k++)
        {
            System.out.println(arr[k]+"-------------");
        }
        // dung for each de duyet cac phan tu trong mang (chỉ duyệt, không thể chỉnh sửa dữ liệu trong for each)
        for(int x:arr)
        {
            System.out.println(x+"");
        }
        
        /*
            *
            **
            *
            **
            ***
        */
        i = 0; j = 0;
        for (i=1;i<=5;i++)
        {
            
            for(j=1;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");//xuong dong
        }
        System.out.println("-------");
        for (i=1;i<=5;i++)
        {
            
            for(j=1;j<i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println("");//xuong dong
        }
        System.out.println("-------");
        // in cac so tu 1-5,chi in tu 1 -2 dung break
        i=1;
        while (i<=5)
        {
            
            System.out.println(i+"");
            i++;
            if (i==3)
            {
                break;
            }
        }
        System.out.println("-------");
        // in tu 1-5 dung continue
        i=1;
        while(i<=5)
        {
            
            if(i==2)
            {
                i++;
                continue;// bo qua bien hien tai,tiep tuc vong lap moi 
            }
            System.out.println(i+"");
            i++;
        }
        System.out.println("-------");
        for(int p=1;p<=5;p++)
        {
            if(p==2)
            {
                continue;
            }
            System.out.println(p+"");
        }
        
        System.out.println("------------------");
        //Nhập điểm <=100, nếu khng6 thỏa điều kiện thì bắt nhập lại
        int mark;
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.println("Nhập điểm <=100");
            mark = sc.nextInt();
            if (mark >= 0 && mark <= 100) {
                break;
            }
        }
        System.out.println("Điểm vừa nhập là "+ mark);
    }
    
}