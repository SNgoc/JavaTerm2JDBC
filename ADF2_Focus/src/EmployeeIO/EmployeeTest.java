/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeIO;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class EmployeeTest {
    
    //menu
    public void menu() throws IOException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        EmployeeList emp = new EmployeeList();
        emp.readFile();
        int opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Add new Employee                            *");
            System.out.println("*        2.Display Employee                            *");
            System.out.println("*        3.Save list of employee                       *");
            System.out.println("*        4.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = Integer.parseInt(sc.nextLine().trim());
            switch(opt){
                case 1:
                    emp.addNew();
                    break;
                case 2:
                    System.out.print("Input empId to display:");
                    String id = sc.nextLine().trim();
                    emp.displayEmployee(id);
                    break;
                case 3:
                    emp.save();
                    break;
                case 4:
                    System.out.println("Exit!!!");
                    //tự động chạy file employees.txt sau khi thoát chương trình
                    Runtime.getRuntime().exec(new String[] { "C:\\windows\\notepad.exe", "N:\\Progarms\\Java\\ADF2_Focus\\employees.txt" });
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(opt != 4);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        EmployeeTest test = new EmployeeTest();
        test.menu();
    }
    
}
