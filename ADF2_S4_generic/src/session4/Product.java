/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4;

/**
 *
 * @author asus
 */
public class Product<T> {//tao kieu T cho class product
    T id;//khai bao id theo kieu T
    String name;
    int price;

    public Product(T id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", name: " + name + ", price: " + price;
    }
    
}
