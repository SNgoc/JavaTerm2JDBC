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
public abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
    public double getPI(){
        return 3.14;
    }
    
    public void display(){
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
    }
}
