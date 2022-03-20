/*
5. Tạo file ReadObject, sử dụng ObjectInputStream để đọc dữ liệu từ tệp "nhanvien.bin" và in ra màn hình
 */
package BT1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ReadObject implements Serializable{
    
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
    
    void readObj() throws IOException, ClassNotFoundException{
        File file = new File("nhanvien.bin");
        if (emplist.isEmpty()) {
            System.out.println("No data");
        
        if (file.exists() == false) {
            System.out.println("File chua ton tai");
            file.createNewFile();
            System.out.println("Created new file");
            return;
        }
        //QUAN TRỌNG: Fix lỗi KHI SỬ DỤNG ObjectInputStream để read file thì không bị lỗi khi file chưa có data
        if (file.length() == 0) {
            System.out.println("File is empty, please add data first");
            return;
        }
        ObjectInputStream fin = new ObjectInputStream(new FileInputStream("nhanvien.bin"));
        emplist = (HashSet<Employee>) fin.readObject();//thêm lại data vào emplist để không bị no data
        fin.close();
        }
        for (Employee employee : emplist) {
            System.out.println("----------");
            System.out.println(employee);
        }
    }
    
    //menu
        void menu() throws IOException, ClassNotFoundException{
            Scanner sc = new Scanner(System.in);
            //THEM READFILE() VÀO THÌ MỚI ĐỌC DỮ LIỆU ĐƯỢC
            //do read file có phương thức add dữ liệu vào emplist nên phải chạy readFile() đầu tiên để thêm data vào list trước thì mới hiển thị dữ liệu trong list đc
            //không chay sẽ bị No data nếu chạy lệnh hiển thị nhân viên trước vì file chưa được đọc và phân tích để thêm vào emplist
            //còn nếu chạy method readFile() trước thì không bị
            readObj();
            String opt = "0";
            do {
                System.out.println("Chọn lệnh:");
                System.out.println("1.Them nhan vien");
                System.out.println("2.Hien thi nhan vien");
                System.out.println("3.Ghi file");
                System.out.println("4.Doc file");
                System.out.println("5.Exit");
                opt = sc.nextLine().trim();                
                    switch(opt){
                    case "1":
                        addEmp();
                        break;
                    case "2":
                        display();
                        break;
                    case "3":
                        createAndSave();
                        break;
                    case "4":
                        readObj();
                        break;
                    case "5":
                        System.out.println("Exit!!!");
                        break;
                    default:
                        System.out.println("Sai lenh, chon lai 1-5");
                        break;
                }
            } while (!opt.equals("5"));
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // TODO code application logic here
        
        ReadObject test = new ReadObject();
        test.menu();
        
    }
    
}
