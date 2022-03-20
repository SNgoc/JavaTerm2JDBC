/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_Book;

import Lab3_Collection.DoctorList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TestBook {

    //menu
    public void menu(){
        Scanner sc = new Scanner(System.in);
        BookCatalog bk = new BookCatalog();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Them sach moi                               *");
            System.out.println("*        2.Xoa sach theo ma so                         *");
            System.out.println("*        3.Liet ke tat ca sach                         *");
            System.out.println("*        4.Tim kiem sach theo ten                      *");
            System.out.println("*        5.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Them sach moi:");
                    bk.add();
                    break;
                case "2":
                    System.out.println("Xoa sach theo ma so id:");
                    String idDel = sc.nextLine().trim();
                    bk.remove(idDel);
                    break;
                case "3":
                    System.out.println("Liet ke tat ca sach:");
                    bk.display();
                    break;
                case "4":
                    System.out.println("Tim kiem sach theo ten:");
                    String auname = sc.nextLine().trim();
                    bk.display(auname);
                    break;
                case "5":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"5".equals(opt));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TestBook test = new TestBook();
        test.menu();
    }
}
