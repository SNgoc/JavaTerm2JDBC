/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop.session3;

/**
 *
 * @author asus
 */
public class JavaOOPSession3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10; //Khai báo biến trong hàm main
        {
            int y = 20; //Khai báo biến y trong block
            x = y*3;
        }
        //y = 100; biến y chưa khai báo nên bị error
        System.out.println("Biến x là " + x);
        System.out.printf("Biến x là: %d",x); //dùng %d thì phải sử dụng printf
        
        String name = "Linh";
        System.out.println("\nTên của bạn là: "); // \n là xuống dòng
        System.out.println(name);
        System.out.printf("Tên của bạn là: %s", name); //dùng %s thì tên xuất ra chữ thường
        System.out.printf("\nTên của bạn là: %S \n", name); //dùng %s thì tên xuất ra chữ hoa
        
        //format
        String str1 = String.format("%d", x);
        System.out.println("X là " + str1);
        
        String str2 = String.format("|%10d|", x); // định dạng căn phía phải số x
        System.out.println("X là khi dùng %10d: " + str2);
        
        String str3 = String.format("|%-10d|", x); // định dạng căn bên trái số x
        System.out.println("X là khi dùng %-10d: " + str3);
        
        String str4 = String.format("|%010d|", x); // định dạng căn bên phải số x với số 0 mỗi khoảng
        System.out.println("X là khi dùng %010d: " + str4);
        
        // Shift right >> và Shift left << luôn là kiểu int
        System.out.printf("4<<3=%d \n", 4<<3); //Shift left với 3<<3 là lấy 3 nhân cho 2^3
        
        System.out.printf("8<<3=%d \n", 8>>3); //Shift right với 3>>3 là lấy 3 chia cho 2^3
           
    } 
}
