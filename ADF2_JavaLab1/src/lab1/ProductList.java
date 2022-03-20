/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class ProductList {
    ArrayList<Product> prList = new ArrayList<>();
    
    public void addProduct(){
        Product p = new Product();
        p.input();
        prList.add(p);
    }
    
    public void displayAll(){
        if (prList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        for (Product product : prList) {
            if (product == null) {
                return;
            }
            System.out.println(product);
        }
    }
    
    public void searchByName(String name){
        if (prList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        
        boolean found = false;
        for (Product product : prList) {
            if (product.getName().contains(name)) {
                System.out.println(product);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Can't find");
        }
    }
}
