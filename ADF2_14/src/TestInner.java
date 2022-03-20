/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class TestInner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //inner
        InnerClass in = new InnerClass();
        in.n = 10;
        InnerClass.Test t = in.new Test();
        System.out.println("Result = " + t.add(3));
        
        
        System.out.println("result 2 = " + in.calculate(10, 4, new params() {
            @Override
            public int runIt(int a, int b) {
                return a-b;
            }
        }));
        
        System.out.println("result 2 = " + in.calculate(10, 4, (a,b)-> a+b));      
    }
}    
