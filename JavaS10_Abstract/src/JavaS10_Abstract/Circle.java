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
public class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius*getPI()*2;
    }

    @Override
    public double getArea() {
        return radius*radius*getPI();
    }
}
