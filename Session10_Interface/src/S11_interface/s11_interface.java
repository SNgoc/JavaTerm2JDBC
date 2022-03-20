/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_interface;

/**
 *
 * @author asus
 */
public class s11_interface {

    public static void main(String[] args) {
        // TODO code application logic here
        Dog d = new Dog();
        d.sound();
        d.sleep();
        d.foody();
        
        Cat c = new Cat();
        c.sound();
        c.sleep();
        c.foody();
        
        Chickken chick =new Chickken();
        chick.sound();
        chick.sleep();
    }
    
}
