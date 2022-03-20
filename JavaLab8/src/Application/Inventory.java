/*

5 Create main class Inventory in package Application that allows user to manage the laptops
accepted into system through the menu system as follows:
1. Add a new laptop
2. Search laptop by name
3. Display all laptops
4. Remove a laptop by id
5. Exit
 */
package Application;
import Goods.LaptopCatalog;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Inventory {

     public void menu(){
        Scanner sc = new Scanner(System.in);
        LaptopCatalog lap = new LaptopCatalog();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Add a new laptop                            *");
            System.out.println("*        2.Search laptop by name                       *");
            System.out.println("*        3.Display all laptops                         *");
            System.out.println("*        4.Remove a laptop by id                       *");
            System.out.println("*        5.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Nhap lenh:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Add a new laptop   :");
                    lap.addLaptop();
                    break;
                case "2":
                    System.out.println("Input name to search:");
                    String name = sc.nextLine();
                    lap.search(name);
                    break;
                case "3":
                    System.out.println("Display all laptops:");
                    lap.displayAll();
                    break;
                case "4":
                    System.out.print("Input ID to remove a laptop by id:");
                    String ID = sc.nextLine();
                    lap.remove(ID);
                    break;
                case "5":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Sai lệnh, mời nhập lại!!!");
            }
        } while(!"5".equals(opt));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Inventory test = new Inventory();
        test.menu();
    }
    
}
