/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas8;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    String id, name; //default
    int price;
    
    //constructor không có tham số
    public Product()
    {
        id = "P01";
        name = "Iphone 3";
        price = 300;
    }
    
    //constructor có tham số
    
    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    //method nhập
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = sc.nextLine();
        System.out.println("Nhập name: ");
        name = sc.nextLine();
        System.out.println("Nhập price: ");
        price = sc.nextInt();
    }
    
    //method xuất
    public void output()
    {
        System.out.println("Thông tin Product: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
    
    @Override
    public String toString()
    {
        return String.format("ID: %s, Name: %s, Price: %d", id, name, price);
    }
}
