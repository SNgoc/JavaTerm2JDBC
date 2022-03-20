/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassByValue;

/**
 *
 * @author asus
 */
public class DemoPassByValue {
    public int setVal(int n){
        n += 10;
        return n;
    }
    public static void main(String[] args) {
        int n = 10;
        DemoPassByValue obj = new DemoPassByValue();
        System.out.println("PassByValue after setVal is " + obj.setVal(n));
    }
}
