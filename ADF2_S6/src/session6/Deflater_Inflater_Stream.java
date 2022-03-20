/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/*Nén và giải nén file stream
 */
public class Deflater_Inflater_Stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // tạo 1 luồng output để ghi vào file
        DeflaterOutputStream dout = new DeflaterOutputStream(new FileOutputStream("deflater.txt"));
        for (int i = 0; i < 10; i++) {
            dout.write(i);//ghi vào file
        }
        dout.close();
        
        //tạo 1 luồng input để đọc file nén deflater
        InflaterInputStream readIn = new InflaterInputStream(new FileInputStream("deflater.txt"));
        //đọc file nén deflater
        //tạo 1 biến để lưu data giải nén và đọc
        int var = 0;
        while ((var = readIn.read()) != -1) {//không cần ép kiểu vì kiểu ghi vào file là int không phải char         
            System.out.println(var);
        }
        readIn.close();
    }
    
}
