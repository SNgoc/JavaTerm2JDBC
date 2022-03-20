
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
public class session8{

    
    
    public static void main(String[] args) {
        // TODO code application logic here
//        MyThread t1 = new MyThread("Thread 1: ");
//        MyThread t2 = new MyThread("Thread 2: ");
//        
//        //chạy t1, t2 với synchronized ở run() của MyThread (sẽ giống như chạy thread nguẫ nhiên bình thường, không theo thứ tự) 
//        //synchronized dùng cho Thread không hiệu quả, phải dùng join
//        t1.start();
//        t2.start();
//        
//        //tạo 1 đối tượng runnable
//        MyRunnable m1 = new MyRunnable();
//        Thread t3 = new Thread(m1);
//        Thread t4 = new Thread(m1);
//        
//        //tạo tên cho thread
//        t3.setName("Thread 3: ");
//        t4.setName("Thread 4: ");
//        
//        //chạy t3, t4 với synchronized ở run() của MyRunnable (sẽ chạy theo thứ tự) nên dùng cho Runnable
//        t3.start();
//        t4.start();
        
        
        //Multithread (2 thread chay //)
        //tạo 1 đối tượng CustomerS
        Customer c = new Customer();
        
        Thread t5 = new Thread() {//tạo 1 thread rút tiền
            @Override
            public void run() {
                try {//rút phải có try catch
                    c.withdraw(1500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(session8.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        t5.start();
        
        Thread t6 = new Thread(){
            @Override
            public void run() {//gửi không cần try catch
                c.deposit(3000);
            }
        };
        
        t6.start();
    }
    
}
