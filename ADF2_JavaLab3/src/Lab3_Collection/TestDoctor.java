package Lab3_Collection;

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
public class TestDoctor {

    //menu
    public void menu(){
        Scanner sc = new Scanner(System.in);
        DoctorList HMapDoctor = new DoctorList();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Them bac si moi                             *");
            System.out.println("*        2.Xoa bac si ra khoi danh sach, theo ma so    *");
            System.out.println("*        3.Liet ke tat ca bac si co chuyen khoa 2      *");
            System.out.println("*        4.Tim kiem bac si theo ten                    *");
            System.out.println("*        5.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Them bac si moi:");
                    HMapDoctor.add();
                    break;
                case "2":
                    System.out.println("Xoa bac si ra khoi danh sach, theo ma so id:");
                    String idDel = sc.nextLine().trim();
                    HMapDoctor.remove(idDel);
                    break;
                case "3":
                    System.out.println("Liet ke tat ca bac si co chuyen khoa 2:");
                    HMapDoctor.display();
                    break;
                case "4":
                    System.out.println("Tim kiem bac si theo ten:");
                    String name = sc.nextLine().trim();
                    HMapDoctor.display(name);
                    break;
                case "5":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"5".equals(opt));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestDoctor test = new TestDoctor();
        test.menu();
    }
    
}
