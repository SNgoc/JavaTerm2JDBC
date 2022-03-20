/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session9;

/**
 *
 * @author asus
 */
public class Session9 {
    //khai báo biến instance (không chia sẻ giữa các dối tượng, reset mới khi tạo 1 đối tượng mới, sẽ lấy lại giá trị ban đầu)
    int instanceCounter = 0;
    
    //khai báo biến static (chia sẻ giữa các đối tượng với nhau, không reset khi tạo lại 1 đối tượng mới, sẽ lấy giá trị update)
    static int staticCounter = 0;
    
    //Khai báo static block
    static {
        System.out.println("This is static block");
    }
    
    //Khai báo static method
    static void staticMethod(){
        System.out.println("This is static method");
    }
    
    //khai báo instance method
    public void displayCounter(){
        instanceCounter++;
        staticCounter++;
        System.out.println("Value of instanceCounter is "+ instanceCounter);
        System.out.println("Value of staticCounter is "+ staticCounter);
    }
    
    public static void main(String[] args) {
        
        //tự chạy toàn bộ
        staticMethod();
        //khởi tạo để gọi method instance
        Session9 s1 = new Session9();
        s1.displayCounter();
        //khởi tạo thêm 1 đối tượng khác
        Session9 s2 = new Session9();
        s2.displayCounter();
    }
}
