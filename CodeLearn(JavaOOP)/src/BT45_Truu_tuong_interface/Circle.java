/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT45_Truu_tuong_interface;

/**
 *
 * @author asus
 */
public class Circle implements IShape{
    private final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (pi*radius*radius);
    }

    @Override
    public double getPerimeter() {
        return (2*pi*radius);
    }
}
