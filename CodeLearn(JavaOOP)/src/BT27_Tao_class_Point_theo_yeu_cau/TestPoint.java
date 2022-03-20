/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT27_Tao_class_Point_theo_yeu_cau;

/**
 *
 * @author asus
 */
public class TestPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Point p1 = new Point(1.5, 6.7);
        Point p2 = new Point(2.8, 3.2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2.34, 7.8));
    }
}
