package session2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
/*
lớp student:
thuộc tính: id, name, age, address
- id: string, gồm SXX[XX]: XX: là số, vd: S01 hoặc S0001
- name: string gồm: chữ thường hoặc số hoặc _, từ 2-20 ký tự
- age: int, >17
- address: string, SG[HN]DN
method: input, output
*/
public class Student {
    String id, name, address;
    int age;

    public Student() {
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;//method cua pattern
        
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("S[0-9]{2,4}");//[2,4] là giới hạn số phía sau ít nhất 2 số và nhiều nhất 4 số từ 0-9, vd: S01 hoặc S0001 (S1 hoặc S00001 là sai)
        
        while (true) {            
            System.out.print("Nhap id:");
            id = sc.nextLine().trim(); //trim là bỏ khoảng cách khi nhập string
            
            m = p.matcher(id);// kiem tra xem chuoi dua vao id co giong nhu chuoi id yeu cau o pattern khong
            if (m.matches()) {//method cua matcher
                break;
            }
            System.out.println("id khong hop le, vui long nhap lai");
        }
        
        //nhap name
        p = Pattern.compile("[a-z0-9_ ]{2,20}");
        while (true) {            
            System.out.print("Nhap ten:");
            name = sc.nextLine().trim();
            
            m = p.matcher(name);
            if (m.matches()) {
                break;
            }
            System.out.println("Ten khong hop le, vui long nhap lai");
        }
        
        //nhap tuoi
        while (true) {            
            try {
                System.out.print("Nhap tuoi:");//phai su dung dong nay khi parseInt khong se bi loi
                age = Integer.parseInt(sc.nextLine().trim());
                if (age > 17) {
                    break;
                }
                throw new Exception("Tuoi phai lon hon 17");
            } 
            catch (Exception e) {
                System.out.println("Tuoi khong hop le " + e.getMessage());
            }
        }
        
        //nhap address
        p = Pattern.compile("SG||HN||DN", Pattern.CASE_INSENSITIVE);//hoac SG, hoac HN, hoac DN
        while (true) {            
            System.out.println("Nhap address: SG||HN||DN");
            address = sc.nextLine().trim();
            m = p.matcher(address);
            if (m.matches()) {
                break;
            }
            System.out.println("dia chi khong dung, vui long nhap lai");
        }
    }
    
    //output
    public void output(){
        
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("address: " + genAddress());
        System.out.println("Su dung pattern cach 2");
        System.out.println("address: " + genAddress());
    }
    
    public String genAddress(){
        switch(address){
            case "SG":
                address = "Sai Gon";
                break;
            case "HN":
                address = "Ha Noi";
                break;
            default:
                address = "Da Nang";
                break;
        }
        return address;
    }
    
    //dung pattern
    public String genAddress1(){
        Pattern p = Pattern.compile("HN");
        Matcher m = p.matcher(address); // kiem tra xem chuoi dua vao address co giong nhu chuoi o pattern khong
        String s = m.replaceAll("Ha Noi");// khi chuoi nhap vao khong phai la HN thi se bo dong nay va xuong pattern SG
        
        p = Pattern.compile("SG");
        m = p.matcher(s); // khi chuoi nhap vao la SG thi se kiem tra s co phai la SG khong, neu co thi se chay replaceAll
        s = m.replaceAll("Sai Gon");
        
        p = Pattern.compile("DN");//nhu SG
        m = p.matcher(s);
        s = m.replaceAll("Da Nang");
        
        return s;//sau do tra ve s
    }
    
    public static void main(String[] args) {
        Student test = new Student();
        test.input();
        test.output();
    }
}
