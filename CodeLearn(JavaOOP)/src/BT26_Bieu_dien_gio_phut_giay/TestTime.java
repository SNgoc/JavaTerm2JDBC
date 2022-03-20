/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT26_Bieu_dien_gio_phut_giay;

/**
 *
 * @author asus
 */
public class TestTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Time t = new Time(12, 1, 1);
        t.display();
        t.setTime(23, 59, 59);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(7, 0, 0);
        t.display();
        t.previousSecond();
        t.display();
    }
}
