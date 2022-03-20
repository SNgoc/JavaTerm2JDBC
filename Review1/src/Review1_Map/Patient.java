/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review1_Map;

import review1_ArrayList.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Patient {
    String ID, name;
    boolean gender;
    String examDate;

    public Patient() {
        ID = "";
        name = "";
        gender = true;
        examDate = null;
    }

    public Patient(String ID, String name, boolean gender, String examDate) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.examDate = examDate;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * @return the examDate
     */
    public String getExamDate() {
        return examDate;
    }

    /**
     * @param examDate the examDate to set
     */

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        return getID() + "--" + getName() + "--" + (gender ? "Male" : "Female") + "--" + getExamDate();
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;
        
        //id
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("I[0-9]{4}");
        while (true) {            
            System.out.print("ID(Ixxxx):");
            ID = sc.nextLine().trim();
            m = p.matcher(ID); //kiem tra id co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo paattern
                break;
            } else {
                System.out.println("id khong dung, phai Ixxxx , x la ky so");
            }
        }
        
        //name
        //nhap name (tao regular expression pattern)
        // trong compile pattern phai dung \\ khong dung \ duoc
        p = Pattern.compile("\\w{2,}");
        while (true) {            
            System.out.print("Name:");
            name = sc.nextLine().trim(); // nếu yeu cau khoang trang khong xai trim()
            m = p.matcher(name); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Name phai co it nhat 2 ky tu");
            }
        }
        
        //gender (true/false)(M/F)
        while (true) {
            System.out.print("Gender:");            
            try {
                gender = sc.nextBoolean();
                sc.nextLine();
                if (gender == true || gender == false) {
                    break;
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(e.getMessage());
            }
        }
        
        //examDate
        // trong compile pattern phai dung \\ khong dung \ duoc
        p = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[- /](0[1-9]|1[012])[- /](19|20)\\d\\d$");//pattern for date except 30, 31 - Feb
        while (true) {            
            System.out.print("Date(dd-mm-yy):");
            examDate = sc.nextLine().trim(); // nếu yeu cau khoang trang khong xai trim()
            m = p.matcher(examDate); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Wrong input");
            }
        }
    }
}
