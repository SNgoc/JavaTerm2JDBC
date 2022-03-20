/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Product {
    private String id, name, mfg;
    private int unitPrice, qoh;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    

    public Product() {
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;//method cua pattern
        
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("F[a-z]{2,}|B[a-z]{2,}");//{4} là giới hạn số phía sau 4 số từ 0-9, vd: S01 hoặc S0001 (S1 hoặc S00001 là sai)
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
        p = Pattern.compile("[a-z0-9_ ]{2,}");//it nhat 2 ky tu tro len
        while (true) {            
            System.out.print("Nhap ten:");
            name = sc.nextLine().trim();
            
            m = p.matcher(name);
            if (m.matches()) {
                break;
            }
            System.out.println("Ten khong hop le, vui long nhap lai");
        }
        
        //nhap price
        while (true) {            
            try {
                System.out.print("Nhap price:");//phai su dung dong nay khi parseInt khong se bi loi
                unitPrice = Integer.parseInt(sc.nextLine().trim());
                if (unitPrice > 0) {
                    break;
                }
                throw new InvalidException("unitPrice phai lon hon 0");//InvalidException la ham dung bao loi tao truoc
            }
            catch (InvalidException i){
                System.out.println(i.getMessage());
            }
            catch (Exception e) {
                System.out.println("unitPrice khong hop le " + e.getMessage());
            }
        }
        
        //nhap QoH
        while (true) {            
            try {
                System.out.print("Nhap QoH:");//phai su dung dong nay khi parseInt khong se bi loi
                qoh = Integer.parseInt(sc.nextLine().trim());
                if (qoh > 0) {
                    break;
                }
                throw new InvalidException("unitPrice phai lon hon 0");//InvalidException la ham dung bao loi tao truoc
            }
            catch (InvalidException i){
                System.out.println(i.getMessage());
            }
            catch (Exception e) {
                System.out.println("qoh khong hop le " + e.getMessage());
            }
        }
        
        //nhap mfg
        p = Pattern.compile("US|VN|TL", Pattern.CASE_INSENSITIVE);//hoac SG, hoac HN, hoac DN
        while (true) {            
            System.out.println("Nhap mfg: US|VN|TL");
            mfg = sc.nextLine().trim();
            m = p.matcher(mfg);
            if (m.matches()) {
                break;
            }
            System.out.println("mfg khong dung, vui long nhap lai");
        }
    }

    public String standardlizeMfg() {
        switch(mfg){
            case "US":
                mfg = "United States";
                break;
            case "VN":
                mfg = "Vietnam";
                break;
            default:
                mfg = "ThaiLand";
                break;
        }
        return mfg;
    }

    @Override
    public String toString() {
        return String.format("id:%s, name:%s, mfg:%s, unitPrice:%d, qoh:%d",id,name,standardlizeMfg(),unitPrice,qoh);
    }
}
