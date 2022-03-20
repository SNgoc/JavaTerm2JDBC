package Application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import Electronics.Television;
import Electronics.TelevisionCatalog;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Inventory {

     public void menu(){
        Scanner sc = new Scanner(System.in);
        TelevisionCatalog tv = new TelevisionCatalog();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Add a new television                        *");
            System.out.println("*        2.Search televisions by brand                 *");
            System.out.println("*        3.Display all televisions                     *");
            System.out.println("*        4.Display high-valued televisions             *");
            System.out.println("*        5.Delete televisions by ID                    *");
            System.out.println("*        6.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Add a new television:");
                    tv.add();
                    break;
                case "2":
                    System.out.println("Search televisions by brand:");
                    tv.searchByBrand();
                    break;
                case "3":
                    System.out.println("Display all televisions :");
                    tv.displayAll();
                    break;
                case "4":
                    System.out.println("Display high-valued televisions:");
                    tv.displayHighValue();
                    break;
                case "5":
                    System.out.println("Delete televisions by ID:");
                    tv.deleteByID();
                    break;
                case "6":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"6".equals(opt));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Inventory test = new Inventory();
        test.menu();
    }
}

