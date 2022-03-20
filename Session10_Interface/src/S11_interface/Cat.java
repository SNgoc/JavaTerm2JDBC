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
public class Cat implements IAnimal, IAnimalFood{//khi xai implements phai override du method trong iAnimal

    @Override
    public void sound() {
        System.out.println("meow meow");
    }

    @Override
    public void sleep() {
        System.out.println("Zgrr..Zgrr");
    }

    @Override
    public void foody() {
        System.out.println("Fish");
    }
    
}
