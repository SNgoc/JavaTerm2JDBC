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
public class Square extends Shape{
    //Khai báo thuộc tính lớp
    int edge;

    public Square(int edge) {
        this.edge = edge;
    }
    
    @Override
    public double getPerimeter() {
        return edge*4;
    }

    @Override
    public double getArea() {
        return edge*edge;
    } 
}
