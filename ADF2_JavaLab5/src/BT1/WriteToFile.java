package BT1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
2. Tạo file WriteToFile.java, viết phương thức main để nhập 3 nhân viên từ bàn phím, sử dụng FileWriter để ghi thông tin vừa nhập vào tệp văn bản "worker.txt".
3. Tạo file ReadFromFile.java, sử dụng FileReader để đọc tệp "worker.txt" và in thông tin ra màn hình
 */


public class WriteToFile {
    String empId, empName;
    double salary;

    public WriteToFile(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    
    //main
    public static void main(String[] args) throws IOException {
        WriteToFile emp1 = new WriteToFile("1001", "aaa", 300);
        WriteToFile emp2 = new WriteToFile("1002", "bbb", 250);
        WriteToFile emp3 = new WriteToFile("1003", "ccc", 500);
        
        //Dùng FileOutputStream phải chuyển string về thành byte để ghi
        
        //ghi file : để ghi file thì phải chuyển dữ liệu về kiểu byte trước sau đó mới ghi vào file được (dùng getBytes)
        //tạo 1 file
        String filename = "worker.txt";
        //tạo 1 đối tượng để ghi file (write() chỉ ghi được 1 phần tử 1 lần, khổng thể ghi obj)
        FileOutputStream fout = new FileOutputStream(filename);
        String employee1 = emp1.empId + "\t" + emp1.empName + "\t" + emp1.salary + "\n";//khi khao bao string employee = id + name + salary thi emp.salary se tu convert tu double sang string
        fout.write(employee1.getBytes());// converting string into byte array
        
        String employee2 = emp2.empId + "\t" + emp2.empName + "\t" + emp2.salary + "\n";
        fout.write(employee2.getBytes());// converting string into byte array
        
        String employee3 = emp3.empId + "\t" + emp3.empName + "\t" + emp3.salary + "\n";
        fout.write(employee3.getBytes());// converting string into byte array
        
        //close file
        fout.close();
        System.out.println("Da ghi vao file worker.txt");
        
        
        //FILEWRITER
        /*
        Lớp FileWriter trong java được sử dụng để ghi các dữ liệu theo định dạng ký tự vào một file.
        Không giống như lớp FileOutputStream, 
        khi ghi dữ liệu bạn không cần phải chuyển đổi chuỗi thành mảng byte vì nó cung cấp phương thức để viết chuỗi trực tiếp.
        */
        //Dùng Filewriter thì không cần chuyển kiểu string về byte
         //tạo 1 file
        String filename2 = "worker2.txt";
        //tạo 1 đối tượng để ghi file (write() chỉ ghi được 1 phần tử 1 lần, khổng thể ghi obj)
        FileWriter fwout = new FileWriter(filename2);
        fwout.write(emp1.empId + "\t" + emp1.empName + "\t" + emp1.salary + "\n");
        fwout.write(emp2.empId + "\t" + emp2.empName + "\t" + emp2.salary + "\n");
        fwout.write(emp3.empId + "\t" + emp3.empName + "\t" + emp3.salary + "\n");
        fwout.close();
        System.out.println("Da ghi vao file worker2.txt");
    }
}
