/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Dem_string_trong_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "hello world, helo, hello world, hell world";
        int count = 0;
        String strFind = "hello";
        int fromIndex = 0;
        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1) {                    
            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
        }
        System.out.println("count 'hello': " + count);
    }
    
}
