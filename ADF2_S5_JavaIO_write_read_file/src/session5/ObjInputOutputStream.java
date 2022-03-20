/*
Lớp ObjectOutputStream trong java được sử dụng để ghi các kiểu dữ liệu nguyên thuỷ và các đối tượng Java vào một OutputStream. 
Chỉ có các đối tượng implements giao tiếp java.io.Serializable mới có thể được ghi vào stream.

Lớp ObjectInputStream trong java được sử dụng để đọc các đối tượng và dữ liệu nguyên thủy mà được ghi bằng việc sử dụng lớp ObjectOutputStream.
 */
package session5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class ObjInputOutputStream implements Serializable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // tao 1 doi tuong trong arraylist de quan ly student
        ArrayList<Student> list = new ArrayList<>();
        
        //them cac student vao ds
        list.add(new Student("Hung", "male"));
        list.add(new Student("Linh", "female"));
        list.add(new Student("Nero", "male"));
        
        //mở luồng object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.dat"));
        //ghi vào file
        out.writeObject(list);
        //đóng file
        out.close();
        
        //1. mở luồng ObjInputOutputStream de doc file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.dat"));
        //2.doc file
        ArrayList<Student> listresult = new ArrayList<>();
        listresult = (ArrayList<Student>)in.readObject();
        //3.close file
        in.close();
        
        //print ket qua ra man hinh
        for (Student s : listresult) {
            System.out.println(s);
        }
    }    
}
