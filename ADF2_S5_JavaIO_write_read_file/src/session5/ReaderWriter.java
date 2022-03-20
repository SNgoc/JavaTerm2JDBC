/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author asus
 */
public class ReaderWriter {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // 1. mở luồng writer de ghi file
        //tạo file tên file2.txt để ghi
        Writer w = new FileWriter("file2.txt");
        
        //2. ghi vao file
        String s = "Ghi file voi writer";
        //ghi chuỗi s vào file2.txt
        w.write(s);
        
        //3.close file
        w.close();
        
        //1.1 mở luồng reader để đọc file
        //tạo đối tượng dùng để đọc file2.txt
        Reader r = new FileReader("file2.txt");
        //2.2 đọc từ file
        int ch = 0;
        while ((ch = r.read()) != -1) {            
            System.out.print((char) ch);//ep kieu char de ra chữ
        }
        
        //3.3 close file
        r.close();
    }
    
}
