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
public class TestBT45 {


    public static void main(String[] args) {
        // Khai bao mang tu lop cha
        IShape[] shape = new IShape[3];
        //khai bao phan tu gan gia tri pha tu cho lop con
        shape[0] = new Rectangle(3.4, 5.3);
        shape[1] = new Circle(5.5);
        shape[2] = new Rectangle(7.4, 4.3);
        //xuat thong tin phan tu mang dung loop
        for (int i = 0; i < 3; i++) {
                System.out.println("Area of shapes[" + i + "]: " + shape[i].getArea());
                System.out.println("Perimeter of shapes[" + i + "]: " + shape[i].getPerimeter());
        }
    }
    
}
