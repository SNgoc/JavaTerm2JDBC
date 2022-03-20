
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Id:%d \tName:%s \tAge:%d \tSalary:%d";
        System.out.printf(str,1001,"Nero",27,500);
        System.out.println();
        int i = 0;
        String str2 = str.replaceAll("\\w+[:]", "");
        System.out.println(str2);
        //dùng token để cắt chuỗi thay cho split, không cần phải đếm phần tử
        StringTokenizer tok = new StringTokenizer(str2, "\t");
        
        while (tok.hasMoreTokens()) {
            System.out.println(tok.nextToken());
            //System.out.println(str2);
        }
        
        
    }
    
}
