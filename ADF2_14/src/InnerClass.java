/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
@FunctionalInterface
interface params{
    int runIt(int a, int b);
}

public class InnerClass {
    public int n;
    public class Test{
        public int add(int a){
            return n + a;
        }
    }
    public int calculate(int a, int b, params p){
        return p.runIt(a, b);
    }
}
