/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class session7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//        // tạo 1 đối tượng thread
//        MyThread t1 = new MyThread();
//        t1.start();
//        
//        MyThread t2 = new MyThread();
//        t2.start();
//        
//        //tao 1 doi tuong runnable
//        MyRunnable m1 = new MyRunnable();
//        Thread t3 = new Thread(m1);//phải tạo dòng này thì mới chạy m1 được, khác với thread không cần tạo
//        t3.start();
        
        //tạo 1 đối tượng NewThread
        NewThread n1 = new NewThread("Thread 1: ");
        NewThread n2 = new NewThread("Thread 2: ");
        
        //tạo ưu tiên chạy thread theo thứ tự (chỉ có ý nghĩa khi 2 thread cùng chờ 1 lúc)
        n1.setPriority(3);//ưu tiên thấp
        n2.setPriority(6);//ưu tiên cao hơn
        n1.start();
        n1.join(); //dùng join thì ưu tiên n1 chạy xong hết thì n2 mới được chạy dù n1 ưu tiên thấp hơn (nếu không có join thì sẽ chạy ngẫu nhiên)
//        n1.join(333); // 333 là n1 chỉ được ưu tiên trong 333 mili giây, sau 333 giây thì các thread khác tiếp tục chạy
        n2.start();
        
        System.out.println("Main Thread is finished");//main cũng là 1 thread, nếu không có join thì sẽ chạy main đầu tiên (main được ưu tiên cao chỉ sau join vì main chạy đầu tiên)
    }
    
}
