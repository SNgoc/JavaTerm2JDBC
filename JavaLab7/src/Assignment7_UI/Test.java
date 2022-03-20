/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7_UI;
import Car.VehicleCatalog;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Test {

   public void menu(){
        Scanner sc = new Scanner(System.in);
        VehicleCatalog vc = new VehicleCatalog();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Add a new car                               *");
            System.out.println("*        2.Display all cars                            *");
            System.out.println("*        3.Search car by brand name                    *");
            System.out.println("*        4.Display all cars having GPS module          *");
            System.out.println("*        5.Display high-rank car                       *");
            System.out.println("*        6.Quit                                        *");
            System.out.println("********************************************************");
            System.out.print("Nhap lenh:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Add a new car   :");
                    vc.addCar();
                    break;
                case "2":
                    System.out.println("Display all cars  :");
                    vc.displayAll();
                    break;
                case "3":
                    
                    System.out.print("Search car by brand name:");
                    String brand = sc.nextLine();
                    System.out.println("In DS Car the price:");
                    vc.searchByBrand(brand);
                    break;
                case "4":
                    System.out.print("Display all cars having GPS module :");
                    vc.displayAllGPS();
                    break;
                case "5":
                    System.out.println("Display high-rank car has price greater than price was input:");
                    vc.displayHighRankCar();
                    break;
                case "6":
                    System.out.println("Quit!!!");
                    break;
                default:
                    System.out.println("Sai lệnh, mời nhập lại!!!");
            }
        } while(!"6".equals(opt));
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Test test = new Test();
        test.menu();
    }
    
}
