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
public class S12_throw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mathematic m = new Mathematic();
        try {
            System.out.println("Begin");
            m.devide(3, 1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("End");
    }
    
}
