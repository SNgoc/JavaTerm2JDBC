/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author asus
 */
public class ReadFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Doc file");
        //đọc file
        //mở 1 đối tượng
        FileInputStream fin = new FileInputStream("worker.txt");
        //đọc file
        int ch = 0;
        System.out.println("Doc file dung FileInputStream");
        while((ch = fin.read()) != -1)//xuất dữ liệu kiểu byte ra var ch sau đó ép kiểu sang char để đọc
        {
            /*
            Sau khi thực hiện chương trình trên, bạn sẽ nhận được một ký tự duy nhất từ file đó là 87 (dưới dạng byte). 
            Để xem đó là ký tự gì, bạn cần phải chuyển đổi nó thành kiểu dữ liệu char.
            */
            
            System.out.print((char)ch);//dung char de ep kieu
        }
        //đóng file
        fin.close();
        //kết thúc đọc file
        
        //đọc file dùng FileReader
        /*
        Lớp FileReader trong java được sử dụng để đọc dữ liệu từ file. 
        Nó trả về dữ liệu theo định dạng byte như lớp FileInputStream.
        Đây là lớp định hướng ký tự được sử dụng để xử lý file trong java.
        */
        //mở 1 file
        FileReader fr = new FileReader("worker2.txt");
        //đọc file
        int chreader = 0;
        System.out.println("Doc file dung FileReader:");
        while ((chreader = fr.read()) != -1) {
            
            System.out.print((char)chreader);
        }
        //đóng file
        fr.close();
    }
    
}
