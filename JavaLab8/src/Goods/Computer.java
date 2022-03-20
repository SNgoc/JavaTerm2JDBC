/*
Creates an abstract class named Computer in package Goods.
- Fields ID, name, price
- Default constructor to initialize the above fields.
- Method
- void accept() : allow user input data into data fields.
Made validation for : ID, name is not null. Price must be greater than zero.
- void printInfo() : this is an abstract method used to print details of an product
 */
package Goods;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public abstract class Computer {
    private String ID, name;
    private int price;

    public Computer() {
        ID = "001";
        name = "No name";
        price = 0;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.print("ID:");
            ID = sc.nextLine();
            if (ID.isEmpty()) {
                System.out.println("ID is not allow null.");
            }
            else{
                break;
            }
        }
        while (true) {            
            System.out.print("Name:");
            name = sc.nextLine();
            if (name.isEmpty()) {
                System.out.println("Name is not allow null.");
            }
            else{
                break;
            }
        }
        do {            
            System.out.print("Price (must > 0):");
            price = sc.nextInt();
            sc.nextLine();
        } while (price <= 0);
    }
    
    abstract void printInfo();
}
