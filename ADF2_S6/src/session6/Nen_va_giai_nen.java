/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6;

import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 *
 * @author asus
 */
public class Nen_va_giai_nen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DataFormatException {
        // TODO code application logic here
        String input = "Chuoi nay dung de nen su dung Deflater_Inflater aaaaaaaaaaaaaaaaaaaaa bbbbbbbbbbbbbbbbbbbbbbbbbbbb ccccccccccccccccccccc";
        //chuyen string ve byte
        byte[] inputObj = input.getBytes();//getBytes() tra ve kieu bytes
        System.out.println("Length trước khi nén string " + inputObj.length);
        
        //compress (nén data) Deflater
        byte[] output = new byte[100];
        Deflater def = new Deflater();
        //đưa vào
        def.setInput(inputObj);
        //đóng file
        def.finish();
        //tạo 1 obj để lưu string sau khi nén
        int newLength = def.deflate(output);
        System.out.println("Length của string sau khi nen " + newLength);
        
        //giải nén (decompress) Inflater
        Inflater inf = new Inflater();
        inf.setInput(output, 0, output.length); //đưa string nén vào để giải nén
        
        //tạo 1 buffer để lưu data được giải nén
        byte[] resultObj = new byte[1024];
        int resultLength = inf.inflate(resultObj);
        System.out.println("Length sau khi được giải nén(decompress) " + resultLength);
    }
    
}
