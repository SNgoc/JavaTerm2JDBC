/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeIO;

import DoctorMapIO.Doctor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class EmployeeList {
    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    
    //addNew
    void addNew(){
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        Pattern p = null; // tao obj pattern p
        Matcher m = null; // tao obj matcher m de so sanh voi pattern p
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("E[0-9]{3}-[0-9]{2}");//[2,4] là giới hạn số phía sau ít nhất 2 số và nhiều nhất 4 số từ 0-9, vd: S01 hoặc S0001 (S1 hoặc S00001 là sai)
        
        while (true) {            
            System.out.print("Id(Exxx-xx):");
            emp.setId(sc.nextLine().trim()); //trim là bỏ khoảng cách khi nhập string
            
            m = p.matcher(emp.getId());// kiem tra xem chuoi dua vao id co giong nhu chuoi id yeu cau o pattern khong
            if (m.matches()) {//method cua matcher
                break;
            }
            System.out.println("Wrong Id, must be E[xxx-xx] x is a digit");
        }
        
        //nhap name
        p = Pattern.compile("[\\w\\s]{1,}");//ten phai co it nhat 2 ky tu tro len
        while (true) {            
            System.out.print("Name:");
            emp.setName(sc.nextLine().trim());
            
            m = p.matcher(emp.getName());
            if (m.matches()) {
                break;
            }
            System.out.println("Name can not blank");
        }
        
        //gender: Gender must be Male or Female.
        while (true) {
            System.out.print("Gender:");            
            try {
                emp.setGender(sc.nextBoolean());
                sc.nextLine();
                if (emp.isGender() == true || emp.isGender() == false) {
                    break;
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Error " + e.getMessage());
            }
        }
        
        //nhap email: Email must be right format (have @, dot symbol)
        p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        while (true) {            
            System.out.print("Email:");
            emp.setEmail(sc.nextLine());
            
            m = p.matcher(emp.getEmail());
            if (m.matches()) {
                break;
            }
            System.out.println("Email must be right format (have @, dot symbol)");
        }
        
        //add va check duplicate
        for (Employee employee : employeeList) {
            if (employee.equals(emp)) {
                System.out.println("Duplicate id");
                return;
            }
        }
        employeeList.add(emp);
        System.out.println("Added");
    }
    
    //display
    void displayEmployee(String id){
        if (employeeList.isEmpty()) {
            System.out.println("No data, please add data first");
            return;
        }
        
        boolean found = false;
        for (Employee e : employeeList) {
            if (e.getId().contains(id)) {
                System.out.println("-----------");
                System.out.println(e);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Can't find employee with id " + id);
        }
    }
    
    //save file
    File fname = new File("employees.txt");
    
    void save() throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter(fname));
        for (Employee employee : employeeList) {
            pw.println(employee.toString());
            pw.flush();
        }
        //close
        pw.close();
        System.out.println("File was written");
    }
    
    void readFile() throws FileNotFoundException, IOException{
        if (fname.exists() == false) {
            System.out.println("File chua ton tai");
            return;
        }
        //check file có dữ liệu hay chưa
        //QUAN TRỌNG: Fix lỗi KHI SỬ DỤNG ObjectInputStream để read file thì không bị lỗi khi file chưa có data
        if (fname.length() == 0) {
            System.out.println("File is empty, please add data first");
            return;
        }
        employeeList.clear();//xóa dữ liệu cũ trước khi đọc dữ liệu mới từ file lên
        BufferedReader fin = new BufferedReader(new FileReader(fname));

        try {
            while (fin.ready()) {
                //String buf = in.readLine().replaceAll("\\w+[:]", ""); //dùng replaceAll khi string kiểu: Id:%s
                //hàm tách chuỗi thành mảng để add vào list,thay thế cho split trong array và không cần đếm điề kiện phần tử arr.length = 4 để add chuỗi
                String buf = fin.readLine();
                StringTokenizer tok = new StringTokenizer(buf, "***");//phải cắt đúng, chú ý cả khoảng trắng
                Employee emp = new Employee();//tạo đối tượng emp
                emp.setId(tok.nextToken().trim());
                emp.setName(tok.nextToken().trim());
                //vì gender đã chuyển sang Male, Female nên phải chuyển thành thành true/false trước khi add vào lại list
                if (tok.nextToken().equals("Male")) {
                    emp.setGender(true);
                } else {
                    emp.setGender(false);
                }
                emp.setEmail(tok.nextToken().trim());
                employeeList.add(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            fin.close();
        }
    }
}
