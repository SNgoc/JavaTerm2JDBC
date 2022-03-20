
import static java.lang.Thread.sleep;
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
public class MyRunnable implements Runnable{

    @Override
    synchronized public void run() { //chỉ áp dụng được với runnable (thread sẽ chạy theo thứ tự)
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i); //do runnable không thể access trực tiếp vào getName nên phải sử dụng cách này
            try {
                sleep(333);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
