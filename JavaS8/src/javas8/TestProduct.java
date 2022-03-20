/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas8;

/**
 *
 * @author asus
 */
public class TestProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // tạo 1 đối tượng product
        Product p = new Product();
        p.output();
        
        Product p1 = new Product("P02", "Iphone 4", 400);
        //p1.output();
        System.out.println(p1); //sử dụng @override vên Product.java để println đc p1
    }
}
