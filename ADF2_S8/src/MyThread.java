
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    synchronized public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + i);
            try {
                sleep(333);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
