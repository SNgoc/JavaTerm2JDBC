/*
4. Tạo file WriteObject, tạo một mảng gồm 3 nhân viên, nhập thông tin nhân viên, sử dụng ObjectOutputStream để ghi mảng nhân viên này vào tệp "nhanvien.bin".
5. Tạo file ReadObject, sử dụng ObjectInputStream để đọc dữ liệu từ tệp "nhanvien.bin" và in ra màn hình
 */
package BT1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashSet;

/**
 *
 * @author asus
 */
public class WriteObject implements Serializable{
    
    public HashSet<Employee> emplist = new HashSet<>();
    void addEmp(){
        Employee emp = new Employee();
        emp.input();
        for (Employee employee : emplist) {
            if (employee.equals(emp)) {
                System.out.println("Duplicate id");
                return;
            }
        }
        emplist.add(emp);
        System.out.println("Added");
    }
    
    void display(){
        if (emplist.isEmpty()) {
            System.out.println("No data");
            return;
        }
        for (Employee employee : emplist) {
            System.out.println("------------------");
            System.out.println(employee);
        }
    }
    
    //tạo và ghi đối tượng vào file chỉ định
    
    void createAndSave() throws FileNotFoundException, IOException{
        //tạo file
        File file = new File("nhanvien.bin");

        //tao objoutput để sau đó tạo file của obj để ghi obj vào 
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        //ghi Array HashSet list vào file
        out.writeObject(emplist);
        System.out.println("File was written");
        //close file
        out.close();
    }
    
    

    
}
