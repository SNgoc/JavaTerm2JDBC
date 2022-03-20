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
public class Chickken implements IAnimal{//implements don truu tuong

    @Override
    public void sound() {
        System.out.println("cuck cuck");
    }

    @Override
    public void sleep() {
        System.out.println("Z...z..");
    }
}
