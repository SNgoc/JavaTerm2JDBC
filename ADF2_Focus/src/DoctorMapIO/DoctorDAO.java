/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorMapIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class DoctorDAO {
    Map<String, Doctor> doctorMap;

    //•	Create a constructor to initialize doctorMap filed.
    public DoctorDAO() {
        doctorMap = new HashMap<>();
    }
    
    void addDoctor(){
        Doctor dr = new Doctor();
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;
        
        //id
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("B[0-9]{4}");
        while (true) {            
            System.out.print("docId(B[xxxx]):");
            dr.setDoctorId(sc.nextLine().trim());
            m = p.matcher(dr.getDoctorId()); //kiem tra id co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo paattern
                break;
            } else {
                System.out.println("Wrong docId, must be B[xxxx] xxxx is 4 digits");
            }
        }
        //name
        //nhap name (tao regular expression pattern)
        // trong compile pattern phai dung \\ khong dung \ duoc
        p = Pattern.compile("[\\w\\s]{2,}");
        while (true) {            
            System.out.print("Name:");
            dr.setName(sc.nextLine()); // do yeu cau khoang trang nen khong xai trim()
            m = p.matcher(dr.getName()); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Name must be at least 2 characters");
            }
        }
        //speciality (chuyen mon): 
        //nhap level (tao regular expression pattern)
        p = Pattern.compile("PT|CC|HS|GM|DK",Pattern.CASE_INSENSITIVE);// \\s la pattern 1 space " " (khong the dung \s)
        while (true) {            
            System.out.print("Speciality (PT|CC|HS|GM|DK):");
            dr.setSpeciality(sc.nextLine().trim());
            m = p.matcher(dr.getSpeciality()); //kiem tra specialization co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Wrong, please try again");
            }
        }
        //hourExam so gio trong (tu 0-24h)
        while (true) {
            System.out.print("hourExam:");            
            try {
                dr.setHourExam(Float.parseFloat(sc.nextLine().trim()));
                if (dr.getHourExam() > 0) {
                    break;
                }
                System.out.println("hourExam must be larger than 0");
            } catch (Exception e) {
                System.out.println("Wrong format " + e.getMessage());
            }
        }
        
        //add va check duplicate           
        // phương thức keySet()
        // sẽ trả về 1 Set chứa key có trong hashMap
        //dung string d vi key id duoc khai bao kieu string
        // String id la de so sanh key id voi key cua dr la id do id la String
        for (String id : doctorMap.keySet()) {
            if (dr.getDoctorId().equals(id)) {
                System.out.println("Duplicate key id");
                return;
            }
        }
        //add vào doctorList và gán key là id
        doctorMap.put(dr.getDoctorId(), dr);
        System.out.println("Added");
    }
    
    //•	Define method Search(String id) : to display the doctor (has id in parameter).
    void Search(String id){
        if (doctorMap.isEmpty()) {
            System.out.println("No data, please add data first");
            return;
        }
        
        boolean found = false;
        for (Doctor dr : doctorMap.values()) {
            if (dr.getDoctorId().contains(id)) {
                System.out.println("-----------");
                System.out.println(dr);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Can't find doctor with id " + id);
        }

//        //Cách 2:
//        Optional<Doctor>dr = doctorList.values().stream().filter(p->p.getId().equals(id)).findFirst();
//        if (dr.isPresent()) {
//            System.out.println(dr.get());//lấy giá trị doctor ra và print
//        }
//        else{
//            System.out.println("Not exist");
//        }
    }
    
        //ghi va đọc file
    //tạo file
    File filename = new File("doctor.txt");
    
    //Ghi ds nv vô tập tin vb “NV.txt”
    //Ghi ds nv vô tập tin vb “NV.txt”
    void saveFile() throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter(filename));//(filename,true) nghĩa là nếu file đã tồn tại dữ liệu thì ghi tiếp phía dưới bất kể data trùng
        for (Doctor dr : doctorMap.values()) {
            pw.println(dr.toString());//chuyển obj dr thành string sử dụng method toString() chuyển thành string rồi write
            pw.flush();
        }
        pw.close();
        System.out.println("File was written");
    }
    
    //đọc file dùng filereader
    void readFile() throws IOException{
        if (filename.exists() == false) {
            System.out.println("File chua ton tai");
            return;
        }
        //check file có dữ liệu hay chưa
        //QUAN TRỌNG: Fix lỗi KHI SỬ DỤNG ObjectInputStream để read file thì không bị lỗi khi file chưa có data
        if (filename.length() == 0) {
            System.out.println("File is empty, please add data first");
            return;
        }
        doctorMap.clear();//xóa dữ liệu cũ trước khi đọc dữ liệu mới từ file lên
        BufferedReader in = new BufferedReader(new FileReader(filename));

        try {
            while (in.ready()) {
                //String buf = in.readLine().replaceAll("\\w+[:]", ""); //dùng replaceAll khi string kiểu: Id:%s
                //hàm tách chuỗi thành mảng để add vào list,thay thế cho split trong array và không cần đếm điề kiện phần tử arr.length = 4 để add chuỗi
                String buf = in.readLine();
                StringTokenizer tok = new StringTokenizer(buf, " - ");//phải cắt đúng, chú ý cả khoảng trắng
                Doctor dr = new Doctor();//tạo đối tượng dr
                dr.setDoctorId(tok.nextToken());
                dr.setName(tok.nextToken());
                dr.setSpeciality(tok.nextToken());
                dr.setHourExam(Float.parseFloat(tok.nextToken()));
                //dr.setAvailDate(sdf.parse(tok.nextToken())); //dùng khi var là kiểu Date
                doctorMap.put(dr.getDoctorId(), dr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            in.close();
        }
    }
    
    
    
    //menu
    public void menu() throws IOException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        readFile();
        int opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Add new Doctor                              *");
            System.out.println("*        2.Search Doctor                               *");
            System.out.println("*        3.Save file                                   *");
            System.out.println("*        4.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = Integer.parseInt(sc.nextLine().trim());
            switch(opt){
                case 1:
                    addDoctor();
                    break;
                case 2:
                    System.out.print("Input doctorId to search:");
                    String id = sc.nextLine().trim();
                    Search(id);
                    break;
                case 3:
                    saveFile();
                    break;
                case 4:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(opt != 4);
    }
}
