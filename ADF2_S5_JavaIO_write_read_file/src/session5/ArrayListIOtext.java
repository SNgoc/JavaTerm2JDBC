/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ArrayListIOtext {

    // tao 1 obj arraylist chua ds cac employee
        ArrayList<Employee> emplist = new ArrayList<>();
        
        //method them nhan vien
        void addEmp(){
            Employee emp = new Employee();
            emp.input();
            emplist.add(emp);
        }
        
        //method display
        void display(){
            if (emplist.isEmpty()) {
                System.out.println("No data");
                return;
            }
            for (Employee employee : emplist) {
                System.out.println(employee);
            }
        }
        
        //method ghi vao file
        String filename = "Employee.txt";
        void CreateAndSaveFile() throws FileNotFoundException{
            //1.tạo luồng output và kết nối đến tập tin filename
            /*
            Lớp PrintStream trong java cung cấp các phương thức để ghi dữ liệu vào một stream khác. 
            Lớp PrintStream tự động làm sạch dữ liệu vì vậy không cần gọi phương thức flush(). 
            Hơn nữa, các phương thức của nó không ném ngoại lệ IOException.
            */
            PrintStream ps = new PrintStream(filename);//tự động ghi thêm dữ liệu vào phía dưới, không đè lên dữ liệu cũ
            //2.ghi dữ liệu từ emplist vào filename
            emplist.forEach(e->ps.println(e));//dung lambda expression
            //3.close file
            ps.close();
        }
        
        //method đọc file và phân tích dữ liệu file txt rồi thêm vào lại emplist[]
        void readFile() throws FileNotFoundException, IOException{
            if (emplist.isEmpty()) {//fix lỗi trùng dữ liệu khi có sẵn dữ liệu trong file
                File f = new File(filename);//tao doi tuong file cho filename
                if (f.exists() == false) {
                    System.out.println("File chua ton tai");
                    return;
                }
            
            //1.mở luồng file để đọc file
            /*
            Lớp BufferedReader trong java được sử dụng để đọc văn bản từ một input stream dựa trên các ký tự (character stream). 
            Nó có thể được sử dụng để đọc dữ liệu theo dòng (line by line) bằng phương thức readLine(). Nó giúp hiệu suất nhanh. Nó kế thừa lớp Reader.
            */
            //Nó được sử dụng để tạo ra thể hiện của BufferedReader mà sử dụng kích thước mặc định cho một bộ đệm đầu vào.
            BufferedReader buf = new BufferedReader(new FileReader(filename));
            
            //2.đọc từng dòng, sau đó phân tích dữ liệu và đối tượng để thêm vào danh sách
            //thêm dữ liệu vào lại emplist để lấy ra không bị No data
            
            String line = null;
            String[]arr;
            //ĐỌC FILE và phận tích data sau đó lưu vào emplist
            //nếu dùng readLine() thì không cần ép kiểu sang char giống read(), readLine chỉ có trong lớp BufferedReader
            while(buf.ready()){//Nó được sử dụng để kiểm tra liệu các input stream đã sẵn sàng để được đọc.
                line = buf.readLine();//trả về 1 dòng, không cần phải ép kiểu giống khi dùng read()
                // thay thế chuỗi gốc thành chuỗi ngắn gọn hơn
                //ID: "E01", Name: "Hung" -> "E01", "Hung" => chỉ cần bỏ "Id: "..trong toString() của employee.java vì khi println obj vẫn sử dụng toString() để trả về
                
                //Cách 1: CHỈ DÙNG KHI TOSTRING SỬ DỤNG RETURN "ID: " + ID + ",NAME: " + NAME + ... (SỬ DỤNG %s, id thì không dùng)
                //LƯU Ý: PHẢI THIẾT KẾ PATTERN GIỐNG VỚI CHUỖI NHẬP VÀO CỦA TOSTRING()
                //Pattern cho RETURN "ID: " + ID + ",NAME: " + NAME + ... 
//                String lineNew = line.replaceAll("\\w+[:]\\s", ""); //(("\\w+[:]\\s", "") NGHĨA LÀ "ID: " + ID... CÒN "" LÀ THAY THẾ "ID: " BẰNG RỖNG(TỨC XÓA)
//                
//                //chuyển chuỗi mới thành mảng arr
//                arr = lineNew.split(",");//cắt chuỗi trong toString()"ID: " + ID + ",NAME: " + NAME + ... NGAY DẤU , và thêm vào arr[]

                //Cách 2: CHỈ DÙNG KHI TOSTRING SỬ DỤNG RETURN ("ID:%s\tName:%s\Salary:%f",id,name,salary);
                //LƯU Ý: PHẢI THIẾT KẾ PATTERN GIỐNG VỚI CHUỖI NHẬP VÀO CỦA TOSTRING()
                //Pattern cho RETURN ("ID:%s\tName:%s\Salary:%f",id,name,salary);
                // \\w chỉ thay thế cho 1 ký tự trong chuỗi (vd: Id chỉ thay d) còn \\w+ là toàn bộ 1 ký tự trở lên (vd:Id thay hết)
                String lineNew = line.replaceAll("\\w+?[:]", ""); //CHỈ DÙNG KHI TOSTRING SỬ DỤNG RETURN ("ID:%s\tName:%s\Salary:%f",id,name,salary);
                
                //chuyển chuỗi mới thành mảng arr
                arr = lineNew.split("\t");//cắt chuỗi trong toString() ngay tại \t và thêm vào arr[]
                
                //tạo 1 đối tượng employee mới từ dữ liệu trong mảng
                if (arr.length == 4) {//do employee có 4 tham số input là id, name, salary, dept nên arr.length  == 4
                    Employee e = new Employee();
                    e.id = arr[0].trim(); //thêm vào arr theo index
                    e.name = arr[1].trim();
                    e.salary = Double.parseDouble(arr[2].trim());
                    e.dept = arr[3].trim();
                    
                    //thêm đối tượng mới vào ds
                    emplist.add(e);//PHẢI CÓ DÒNG NÀY ĐỂ ADD VÀO EMPLIST LẠI THÌ KHI ĐỌC FILE MỚI KHÔNG BỊ LỖI NO DATA
                }
            }
            //3.close file
            buf.close();
            }
        }
        
        //menu
        void menu() throws IOException{
            Scanner sc = new Scanner(System.in);
            //THEM READFILE() VÀO THÌ MỚI ĐỌC DỮ LIỆU ĐƯỢC
            //do read file có phương thức add dữ liệu vào emplist nên phải chạy readFile() đầu tiên để thêm data vào list trước thì mới hiển thị dữ liệu trong list đc
            //không chay sẽ bị No data nếu chạy lệnh hiển thị nhân viên trước vì file chưa được đọc và phân tích để thêm vào emplist
            //còn nếu chạy method readFile() trước thì không bị
            readFile();
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
                        CreateAndSaveFile();
                        break;
                    case "4":
                        readFile();
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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        ArrayListIOtext test = new ArrayListIOtext();
        test.menu();
    }
    
}
