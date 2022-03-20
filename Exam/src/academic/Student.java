/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academic;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Student {
    int stuID;
    String stuName, stdAddress;
    int year_of_birth;

    public Student() {
        stuID = 1;
        stuName = "AAA";
        stdAddress = "Street";
        year_of_birth  = 1975;
    }

    public Student(int stuID, String stuName, String stdAddress, int year_of_birth) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.stdAddress = stdAddress;
        this.year_of_birth = year_of_birth;
    }

    public int getStuID() {
        return stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("stuID:");
            try {
                //cach 2 khong can dung sc.nextLine();
                stuID = Integer.parseInt(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                break;
            }
            //catch nhieu loi, muon catch loi throw thi catch loi phai giong voi kieu loi throw
            catch (NumberFormatException e) {
                System.out.println("Error: stuID must be integer");
            }
        }
        
        while (true){
            System.out.print("stuName:");
            try {
                stuName = sc.nextLine();
                if (stuName.isEmpty()) {
                    throw new NullPointerException("stuName cannot null");//tu tao loi cho minh
                }
                else{
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        while (true){
            System.out.print("stdAddress:");
            try {
                stdAddress = sc.nextLine();
                if (stdAddress.isEmpty()) {
                    throw new NullPointerException("stdAddress cannot null");//tu tao loi cho minh
                }
                else{
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        while (true) {
            System.out.print("year_of_birth:");
            try {
                //cach 2 khong can dung sc.nextLine();
                year_of_birth = Integer.parseInt(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                if (year_of_birth < 1970 || year_of_birth > 2005) {
                    throw new Error("year_of_birth must greater than 1970 and less than 2005");//tu tao loi cho minh
                }
                else{
                    break;
                }
            }
            //catch nhieu loi, muon catch loi throw thi catch loi phai giong voi kieu loi throw
            catch (NumberFormatException e) {
                System.out.println("Error: year_of_birth must be integer.");
            }
            catch (Error e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void display(){
        System.out.println("********************");
        System.out.println("StuID: " + getStuID());
        System.out.println("StuName: " + getStuName());
        System.out.println("StdAddress: " + getStdAddress());
        System.out.println("Year_of_birth: " + getYear_of_birth());
    }
}
