/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S12_throw;

/**
 *
 * @author asus
 */
public class Mathematic {
    public void devide(int num1, int num2){
        if (num2 == 1){
            throw new ArithmeticException("Loi tu tao chia cho 1");//tu tao loi cho minh
        }
        else{
            System.out.println("Ket qua: " + num1/num2);
        }
    }
}
