/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TestProduct {

    //menu
    public void menu() throws IOException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        ProductCatalog pc = new ProductCatalog();
        pc.readFile();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Them sp moi                                 *");
            System.out.println("*        2.Nhap kho 1 sp                               *");
            System.out.println("*        3.Xuat kho 1 sp                               *");
            System.out.println("*        4.In bao cao ton kho                          *");
            System.out.println("*        5.Luu ds ton kho sp vo file                   *");
            System.out.println("*        6.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Them sp moi :");
                    pc.addP();
                    break;
                case "2":
                    System.out.println("Nhap kho 1 sp:");
                    System.out.print("Id sp nhap kho:");
                    String id = sc.nextLine().trim();
                    System.out.print("Nhap so luong in_qty can them:");
                    float qty = Float.parseFloat(sc.nextLine().trim());
                    pc.setP(id, qty, true);
                    break;
                case "3":
                    System.out.println("Xuat kho 1 sp:");
                    System.out.print("Id sp Xuat kho:");
                    id = sc.nextLine().trim();
                    System.out.print("Nhap so luong out_qty can xuat:");
                    qty = Float.parseFloat(sc.nextLine().trim());
                    pc.setP(id, qty, false);
                    break;
                case "4":
                    System.out.println("In bao cao ton kho:");
                    pc.display();
                    break;
                case "5":
                    System.out.println("Luu ds ton kho sp vo fil6e:");
                    pc.saveFile();
                    break;
                case "6":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"6".equals(opt));
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        TestProduct test = new TestProduct();
        test.menu();
    }
    
}
