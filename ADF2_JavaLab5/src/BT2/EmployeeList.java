/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class EmployeeList {

    HashSet<Employee> emplist = new HashSet<>();
    
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
    
    void searchByName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input name to search:");
        String name = sc.nextLine().trim();
        if (emplist.isEmpty()) {
            System.out.println("No data");
            return;
        }
        for (Employee employee : emplist) {
            if (employee.name.contains(name)) {
                System.out.println("------------");
                System.out.println(employee);
            }
        }
    }
    
    void display(){
        if (emplist.isEmpty()) {
            System.out.println("No data");
            return;
        }
        System.out.println("All list employee:");
        for (Employee employee : emplist) {
            System.out.println(employee);
        }
    }
    
    //In danh sách nhân viên có thâm niên công tác trên years năm
    void display(int years){
        if (emplist.isEmpty()) {
            System.out.println("No data");
            return;
        }
        System.out.println("List employee co tham nien cong tac tren " + years + " nam");
        //lấy ra năm hiện tại
        //tạo 1 obj localdate
        LocalDate now = LocalDate.now();//obj ngày hiện tại
        //lấy ra năm hiện tại
        int nowYear = now.getYear();
        for (Employee employee : emplist) {
            if (nowYear - employee.joinedYear > years) {
                System.out.println(employee);
            }
        }
    }
    //ghi va đọc file
    //tạo file
    File filename = new File("NV.txt");
    
    //Ghi ds nv vô tập tin vb “NV.txt”
    void writeFileText() throws IOException{
        FileWriter fw = new FileWriter(filename);//(filename,true) nghĩa là nếu file đã tồn tại dữ liệu thì ghi tiếp phía dưới
        for (Employee employee : emplist) {
//            if (employee.equals(emp)) {
//                System.out.println("Duplicate id");
//                return;
//            }
            fw.write(employee.toString() + "\n");//chuyển obj emp thành string sử dụng method toString() chuyển thành string rồi write
            fw.flush();
        }
        fw.close();
        System.out.println("File was written");
    }
    
    //Đọc tập tin văn bản “NV.txt”, phân tích dữ liệu và lưu vô danh sách empList
    void readFileText() throws FileNotFoundException, IOException{
        if (emplist.isEmpty()) {//fix lỗi ghi trùng dữ liệu khi có sẵn dữ liệu trong file
            
            if (filename.exists() == false) {
                System.out.println("File chua ton tai");
                filename.createNewFile();
                System.out.println("Created a file");
                return;
            }
            //check file có dữ liệu hay chưa
            if (filename.length() == 0) {
                System.out.println("File is empty, please addd data first");
                return;
            }
        
            //đọc file sử dụng BufferedReader

            BufferedReader br = new BufferedReader(new FileReader(filename));//sử dụng để tạo ra thể hiện của BufferedReader mà sử dụng kích thước mặc định cho một bộ đệm đầu vào.

    //        //nếu dùng read thì phải ép sang kiểu char mới print đc data
    //        int chreader = 0;
    //        System.out.println("Doc file dung FileReader:");
    //        while ((chreader = fr.read()) != -1) {
    //            System.out.print((char)chreader);
    //        }

            //ĐỌC FILE và phận tích data sau đó lưu vào emplist
            //nếu dùng readLine() thì không cần ép kiểu sang char giống read(), readLine chỉ có trong lớp BufferedReader

            //Tạo mảng arr để add vào emplist lại
            String arr[];
            while (br.ready()) {   //chạy loop để add chuỗi         
                String line = br.readLine();//trả về 1 dòng, không cần phải ép kiểu giống khi dùng read()
                //Thay thế id:sv01 thành "" (tức xóa id:)
                //QUAN TRỌNG: PATTERN PHẢI ĐÚNG, NẾU SAI SẼ BỊ LỖI NumberFormatException do cắt sai
                // \\w chỉ thay thế cho 1 ký tự trong chuỗi (vd: Id chỉ thay d) còn \\w+ là toàn bộ 1 ký tự trở lên (vd:Id thay hết)
                String lineNew = line.replaceAll("\\w+[:]", "");//CHỈ DÙNG KHI TOSTRING SỬ DỤNG RETURN ("ID:%s\t Name:%s\ Salary:%f",id,name,salary);
                //chuyển chuỗi mới thành mảng arr
                //cắt chuỗi thêm vào arr ngay \t7
                
                arr = lineNew.split("\t");
                //thêm phần tử từ arr vào obj employee
                if (arr.length == 5) {
                    //tạo đối tượng employee để add phần tử từ arr
                    Employee emp = new Employee();
                    //lưu ý: phải add đúng thứ tự id,name.. trong to string, nếu id nằm trước thì add arr[0] trước, không sẽ bị đảo vị trí
                    emp.id = arr[0].trim(); 
                    emp.name = arr[1].trim();
                    emp.address = arr[2].trim();
                    emp.salary = Double.parseDouble(arr[3].trim());
                    emp.joinedYear = Integer.parseInt(arr[4].trim());

                    //add data vào lại emplist
                    emplist.add(emp);
                }
            }
            for (Employee employee : emplist) {
                System.out.println(employee);
            }
            //đóng buffered
            br.close();
        }
    }
    
    //menu
    void menu() throws IOException{
        Scanner sc = new Scanner(System.in);
        //THEM READFILE() VÀO THÌ MỚI ĐỌC DỮ LIỆU ĐƯỢC
        readFileText();
        String opt = "0";
        do {
            System.out.println("Chọn lệnh:");
            System.out.println("1.Them nhan vien");
            System.out.println("2.Tim kiem nhan vien theo ten");
            System.out.println("3.Liet ke tat ca nhan vien");
            System.out.println("4.Liet ke cac nhan vien co tham nien cong tac tuy chon");
            System.out.println("5.Ghi file");
            System.out.println("6.Doc file");
            System.out.println("7.Exit");
            opt = sc.nextLine().trim();                
                switch(opt){
                case "1":
                    addEmp();
                    break;
                case "2":
                    searchByName();
                    break;
                case "3":
                    display();
                    break;
                case "4":
                    System.out.print("Nhap so nam: ");
                    try {
                        int year = sc.nextInt();
                        sc.nextLine();
                        display(year);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "5":
                    writeFileText();
                    break;
                case "6":
                    readFileText();
                    break;
                case "7":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Sai lenh, chon lai 1-7");
                    break;
            }
        } while (!opt.equals("7"));
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        EmployeeList test = new EmployeeList();
        test.menu();
    }
    
}
