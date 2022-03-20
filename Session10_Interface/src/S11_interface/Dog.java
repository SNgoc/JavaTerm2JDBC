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
public class Dog implements IAnimal, IAnimalFood{//implements da truu tuong

    @Override
    public void sound() {
        System.out.println("Wow wow");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzzz");
    }

    @Override
    public void foody() {
        System.out.println("Meat");
    }
}
