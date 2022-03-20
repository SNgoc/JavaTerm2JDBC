/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorMapIO;

import java.io.IOException;

/**
 *
 * @author asus
 */
public class DoctorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        DoctorDAO test = new DoctorDAO();
        test.menu();
    }
    
}
