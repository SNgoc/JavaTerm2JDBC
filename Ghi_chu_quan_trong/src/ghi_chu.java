
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class ghi_chu {
    static int n = 0;
    int m = 0;
    public void display(){
        System.out.println("static n:" + n);
        System.out.println("m: " + m);
        n++;
        m++;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int num = 0;
        do {            
            num++;
            sum += num;
            if (sum > 4) {
                break;
            }
        } while (num < 5);
        System.out.println(sum);
        ghi_chu test = new ghi_chu();
        ghi_chu test1 = new ghi_chu();
        test.display();
        test1.display();
        
        String str = "Id:%d \tName:%s \tAge:%d \tSalary:%d";
        System.out.printf(str,1001,"Nero",27,500);
        System.out.println();
        String str2 = str.replaceAll("\\w[:]", "");// \\w chỉ thay thế 1 ký tự
        String str3 = str.replaceAll("\\w+[:]", ""); // \\w+ thay thế từ 1 ký tự trở lên
        System.out.println(str2);
        System.out.println(str3);
        
        //cách input cho biến kiểu Date
        Scanner sc = new Scanner(System.in);
        Date examDate = null;
        while (true) {            
            System.out.print("Enter the Date:");
            String date = sc.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
            try {
                //Parsing the String
                examDate = dateFormat.parse(date);
                break;
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println("Wrong format, please try again");
                System.out.println(e.getMessage());
            }
        }
        System.out.println(examDate);
    }
}
