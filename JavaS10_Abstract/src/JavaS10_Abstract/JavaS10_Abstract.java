/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaS10_Abstract;

/**
 *
 * @author asus
 */
public class JavaS10_Abstract {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle:");
        c.display();
        
        Square sq = new Square(5);
        System.out.println("Square:");
        sq.display();
    }
}
