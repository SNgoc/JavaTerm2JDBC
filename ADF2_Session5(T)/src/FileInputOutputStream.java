
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nnstu
 */
public class FileInputOutputStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //ghi file
//        mở 1 đối tượng 
        FileOutputStream fout = new FileOutputStream("file.txt");
        //ghi vào file
        String s = "Ghi file dung FileOutPutStream";
        byte[] obj = s.getBytes();
        fout.write(obj);
        //đóng file
        fout.close();
        
        //kết thúc ghi file
        
        //đọc file
        //mở 1 đối tượng
        FileInputStream fin = new FileInputStream("file.txt");
        //đọc file
        int ch;
        while((ch = fin.read()) != -1)
        {
            System.out.print((char)ch);
        }
        //đóng file
        fin.close();
        
        //kết thúc đọc file
    }

    
    
}
