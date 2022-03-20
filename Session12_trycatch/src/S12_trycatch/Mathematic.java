/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S12_trycatch;

/**
 *
 * @author asus
 */
public class Mathematic {
    public void devide(int num1, int num2){
        try {
            System.out.println("Begin");
            double result = num1/num2;
            System.out.println("Result:" + result);
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());//dung method getMessage() de hien thi loi gì
        }
        System.out.println("End");
    }
}
