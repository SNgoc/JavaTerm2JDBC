
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nnstu
 */
public class ReaderWriter {

    public static void main(String[] args) throws IOException {
        Writer w = new FileWriter("file2.txt");
        String s = "Ghi file dung Writter";
        w.write(s);
        w.close();

        Reader r = new FileReader("file2.txt");
        int ch = 0;
        while ((ch = r.read()) != -1) {
            System.out.print((char) ch);
        }
        r.close();
    }
}
