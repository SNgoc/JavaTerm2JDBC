/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT25_Bieu_dien_ngay_gio;

/**
 *
 * @author asus
 */
public class TestDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Date d = new Date(1, 1, 1997);
            d.display();
            d.setDate(12, 12, 2004);
            d.display();
            d.setMonth(3);
            d.display();
    }
}
