/*
 Creates an abstract class named Product in package Goods.
- Protected Fields id, name
- Public constructor to initialise the above fields.
- Method:
- Protected void accept() : allow user input data into data fields.
- Public abstract void printInfo() : abtract method used to print details of an product. 
 */
package Goods;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public abstract class Product {
    protected String id, name;

    // Public constructor to initialise the above fields
    public Product() {
        id = "1001";
        name = "A01";
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    protected void accept(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("ID(not null):");
            id = sc.nextLine();
        } while (id.isEmpty());
        
        do {            
            System.out.print("Name (not null):");
            name = sc.nextLine();
        } while (name.isEmpty());
    }
    public abstract void printInfo();
}
