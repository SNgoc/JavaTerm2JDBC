/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsDB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Student {
    private String studentId;
    private String studentName;
    private String email;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    void inputStudent(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;
        
        
        //id
        System.out.print("StudentId:");
        setStudentId(sc.nextLine().trim());
        
        //name
        System.out.print("StudentName:");
        setStudentName(sc.nextLine().trim());
        
        //Email must be right format (have @, dot symbol)
        p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        while (true) {            
            System.out.print("Email:");
            setEmail(sc.nextLine().trim());
            
            m = p.matcher(getEmail());
            if (m.matches()) {
                break;
            }
            System.out.println("Email must be right format (have @, dot symbol)");
        }
    }

    @Override
    public String toString() {
        return getStudentId() + " - " + getStudentName() + " - " + getEmail();
    }
}
