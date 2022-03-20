package session5;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
Lớp ObjectOutputStream trong java được sử dụng để ghi các kiểu dữ liệu nguyên thuỷ và các đối tượng Java vào một OutputStream. 
Chỉ có các đối tượng implements giao tiếp java.io.Serializable mới có thể được ghi vào stream.

Lớp ObjectInputStream trong java được sử dụng để đọc các đối tượng và dữ liệu nguyên thủy mà được ghi bằng việc sử dụng lớp ObjectOutputStream.
 */
/**
 *
 * @author nnstu
 */
public class ObjectInputOutputStream implements Serializable{

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //tạo một đối tượng arraylist để quản lý danh sách các sinh viên
        ArrayList<Student> stdList = new ArrayList<>();
        //thêm các sinh viên vào danh sách 
        stdList.add(new Student("Hung", "Male"));
        stdList.add(new Student("Linh", "Female"));
        stdList.add(new Student("Bao", "Male"));

        //mở luồng object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.dat"));
        //ghi vào file
        out.writeObject(stdList);
        //đóng file
        out.close();

        //mở luồng để đọc file
        ObjectInputStream oit = new ObjectInputStream(new FileInputStream("student.dat"));
        //đọc file 
        ArrayList<Student> listResult = new ArrayList<>();
        listResult = (ArrayList<Student>) oit.readObject();
        //đóng file
        oit.close();
        //xuất kết quả ra màn hình 
        for (Student student : listResult) {
            System.out.println(student);
        }

    }
}
