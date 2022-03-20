/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobuiltinfi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author asus
 */
public class DemobuiltInFI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String data = "Aptech";
        Predicate<String> pre = s->s.equals(data);
        boolean result = pre.test("Aptech");
        if (result) {
            System.out.println("Equal");
        } else {
            System.out.println("Wrong");
        }
        
        Consumer<String> cons = s->{System.out.println(s.toUpperCase());};//đưa về 1 string và return về bên trong nó
        cons.accept("nero saro");
        
        Function<String,Integer> func = s->s.length();//đếm độ dài string
        System.out.println("Length: " + func.apply("Hello World"));
        
        Function<Integer,Function<Integer,Integer>> op1 = a1 -> b1 -> a1 + b1;
        System.out.println("10 + 8 = " + op1.apply(10).apply(8));
        
        Supplier<String> supp = ()->"Hello, new World";
        String hi = supp.get();//gán string cho variable
        System.out.println(hi);
    }
    
}
