/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaptopIO;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Laptop {
    private String code;
    private String supplier;
    private String desciptions;

    public Laptop() {
        code = "";
        supplier = "";
        desciptions = "";
    }

    public Laptop(String code, String supplier, String desciptions) {
        this.code = code;
        this.supplier = supplier;
        this.desciptions = desciptions;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getDesciptions() {
        return desciptions;
    }

    public void setDesciptions(String desciptions) {
        this.desciptions = desciptions;
    }

    @Override
    public String toString() {
        return getCode() + " - " + getSupplier() + " - " + getDesciptions();
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;
        
        
        //id
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("L[0-9]{2}");
        while (true) {            
            System.out.print("Code laptop(L[xx]):");
            setCode(sc.nextLine().trim());
            m = p.matcher(getCode()); //kiem tra id co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo paattern
                break;
            } else {
                System.out.println("Wrong code, must be L[xx] xxxx is 2 digits");
            }
        }
        
        //supplier (tao regular expression pattern)
        // trong compile pattern phai dung \\ khong dung \ duoc
        p = Pattern.compile("[\\w\\s]{2,}");
        while (true) {            
            System.out.print("Supplier:");
            setSupplier(sc.nextLine()); // do yeu cau khoang trang nen khong xai trim()
            m = p.matcher(getSupplier()); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Supplier must be at least 2 characters");
            }
        }
        
        //descriptions 
        p = Pattern.compile("[\\w]{2,}");// \\s la pattern 1 space " " (khong the dung \s)
        while (true) {            
            System.out.print("Descriptions:");
            setDesciptions(sc.nextLine().trim());
            m = p.matcher(getDesciptions()); //kiem tra specialization co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Wrong, must be at least 2 char");
            }
        }
    }
    
    void display(){
        System.out.println("===================================");
        System.out.println(getCode() + " - " + getSupplier() + " - " + getDesciptions());
    }
}
