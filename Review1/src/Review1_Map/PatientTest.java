/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review1_Map;

import review1_ArrayList.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class PatientTest {
    PatientManager pm = new PatientManager();
    
    //menu
    void menu() throws IOException, ParseException{
        Scanner sc = new Scanner(System.in);
        //THEM READFILE() VÀO THÌ MỚI ĐỌC DỮ LIỆU ĐƯỢC
        pm.readFile();
        String opt;
        do {
            System.out.println("Choose:");
            System.out.println("1.New patient.");
            System.out.println("2.Display patient.");
            System.out.println("3.Save list of patients.");
            System.out.println("4.Exit");
            opt = sc.nextLine().trim();                
                switch(opt){
                case "1":
                    pm.addNew();
                    break;
                case "2":
                    System.out.print("ID to display: ");
                    String id = sc.nextLine().trim();
                    pm.display(id);
                    break;
                case "3":
                    pm.save();
                    break;
                case "4":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Sai lenh, chon lai 1-4");
                    break;
            }
        } while (!opt.equals("4"));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        // TODO code application logic here
        PatientTest test = new PatientTest();
        test.menu();
    }
    
}
