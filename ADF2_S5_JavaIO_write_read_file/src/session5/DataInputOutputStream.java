
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nnstu
 */
public class DataInputOutputStream {

    public static void main(String[] args) throws IOException {
        DataOutputStream dout = null;
        try {
            //tạo một luồng output để ghi dữ liệu
            dout = new DataOutputStream(new FileOutputStream("file.dat"));

            //ghi vào file
            dout.writeInt(3);
            dout.writeDouble(1.2);
            dout.writeBoolean(true);
            dout.writeChar('a');
        } catch (FileNotFoundException ex) {
            System.out.println("Lỗi" + ex.getMessage());
        } finally {//cho dù lỗi hay không lỗi thì vẫn chạy dòng này để đóng file
            if (dout != null) {
                dout.close();
            }
        }

        //đọc file
        DataInputStream din = null;
        din = new DataInputStream(new FileInputStream("file.dat"));
        int var1 = din.readInt(); //gán giá trị int 3 cho var 1
        double var2 = din.readDouble(); //gán giá trị double 1.2 cho var 2
        boolean var3 = din.readBoolean();//gán giá trị boolean true cho var 3
        char var4 = din.readChar();//gán giá trị char 'a' cho var 4
        
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
