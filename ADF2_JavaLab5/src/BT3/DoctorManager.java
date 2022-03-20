/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Optional;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class DoctorManager {
    
    TreeMap<String, Doctor>doctorList;
    

    public DoctorManager() {
        doctorList = new TreeMap<>();
//        try {
//            readFile();
//        } catch (IOException ex) {
//            Logger.getLogger(DoctorManager.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DoctorManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            readFile2();
        } catch (IOException ex) {
            Logger.getLogger(DoctorManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void add(){
        //tạo 1 obj doctor
        Doctor dr = new Doctor();
        dr.input();
        //add va check duplicate           
        // phương thức keySet()
        // sẽ trả về 1 Set chứa key có trong hashMap
        //dung string d vi key id duoc khai bao kieu string
        // String d la de so sanh key d voi key cua dr la id do id la String
        for (String id : doctorList.keySet()) {
            if (dr.getId().equals(id)) {
                System.out.println("Duplicate key id");
                return;
            }
        }
        //add vào doctorList và gán key là id
        doctorList.put(dr.getId(), dr);
    }
    
    //In toàn bộ danh sách bác sĩ ra màn hình.
    void display(){
        if (doctorList.isEmpty()) {
            System.out.println("No data, please read file data first");
            return;
        }
        for (Doctor dr : doctorList.values()) {
            System.out.println("----------");
            System.out.println(dr);
        }
    }
    
    //Tìm bác sĩ có mã số id, và in thông tin chi tiết của bs đó ra màn hình. Nếu ko tìm thấy, in thông báo lỗi.
    void display(String id){
        if (doctorList.isEmpty()) {
            System.out.println("No data, please read file data first");
            return;
        }
        
        boolean found = false;
        for (Doctor dr : doctorList.values()) {
            if (dr.getId().contains(id)) {
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
    
    File fname = new File("doctor.txt");
    //Ghi danh sách bác sĩ vô file có tên chứa trong field ‘fname’. HD : sử dụng lớp File, ObjectOutputStream.
    void saveFile() throws FileNotFoundException, IOException{
        ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(fname));
        fout.writeObject(doctorList);
        fout.close();
        System.out.println("File was written");
    }
    
    //ghi file dùng printstream
    void saveFile2() throws FileNotFoundException{
        PrintStream out = new PrintStream(fname);
        for (Doctor d : doctorList.values()) {
            out.println(d);
        }
        out.close();
        System.out.println("File was written");
    }
    //Đọc file có tên chứa trong field ‘fname’ (nếu có) và fill vào danh sách bác sĩ. HD : sử dụng lớp File, ObjectInputStream.
    
    void readFile() throws IOException, ClassNotFoundException{
        if (doctorList.isEmpty()) {//dòng này để không bị lỗi ghi trùng dữ liệu
            if (fname.exists() == false) {
                System.out.println("File chua ton tai");
                fname.createNewFile();
                System.out.println("Da tao file fname");
                return;
            }
            //check file có dữ liệu hay chưa
            //QUAN TRỌNG: Fix lỗi KHI SỬ DỤNG ObjectInputStream để read file thì không bị lỗi khi file chưa có data
            if (fname.length() == 0) {
                System.out.println("File is empty, please add data first");
                return;
            }
            //khi sử dụng readObject() thì không cần phân tích dữ liệu rồi cắt chuỗi thêm vào giống read()
            //Lưu ý: readObject() chỉ có trong ObjectInputStream
            //QUAN TRỌNG: KHI SỬ DỤNG ObjectInputStream để read file thì file không được rỗng data không sẽ bị lỗi
            ObjectInputStream fin = new ObjectInputStream(new FileInputStream(fname));
            doctorList = (TreeMap<String,Doctor>) fin.readObject();//đọc và nhập lại dữ liệu từ file data vào doctorList để không bị No data      
            //close
            fin.close();
            
        }
        System.out.println("File was read");
        for (Doctor dr : doctorList.values()) {
            System.out.println(dr);
        }
    }
    
    //đọc file dùng fileinputstream
    void readFile2() throws IOException{
        //check file có dữ liệu hay chưa
        //QUAN TRỌNG: Fix lỗi KHI SỬ DỤNG ObjectInputStream để read file thì không bị lỗi khi file chưa có data
        if (fname.length() == 0) {
            System.out.println("File is empty, please add data first");
            return;
        }
        doctorList.clear();//xóa dữ liệu cũ trước khi đọc dữ liệu mới từ file lên
        BufferedReader in = new BufferedReader(new FileReader(fname));
        
        try {
            while (in.ready()) {
                String buf = in.readLine().replaceAll("\\w+[:]", "");
                //hàm tách chuỗi thành mảng để add vào list,thay thế cho split trong array và không cần đếm điề kiện phần tử arr.length = 4 để add chuỗi
                StringTokenizer tok = new StringTokenizer(buf, "\t");
                Doctor dr = new Doctor();
                dr.setId(tok.nextToken());
                dr.setName(tok.nextToken());
                dr.setSpecialization(tok.nextToken());
                dr.setAvailHours(Integer.parseInt(tok.nextToken()));
                //dr.setAvailDate(sdf.parse(tok.nextToken())); //dùng khi var là kiểu Date
                doctorList.put(dr.getId(), dr);
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
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Them bac si moi                             *");
            System.out.println("*        2.In toan bo bac si                           *");
            System.out.println("*        3.Tim kiem bac si theo id                     *");
            System.out.println("*        4.Doc file chua danh sach bac si              *");
            System.out.println("*        5.Ghi file chua danh sach bac si              *");
            System.out.println("*        6.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Them bac si moi:");
                    add();
                    break;
                case "2":
                    System.out.println("In toan bo bac si:");
                    display();
                    break;
                case "3":
                    System.out.println("Tim kiem bac si theo id:");
                    String idFind = sc.nextLine().trim();
                    display(idFind);
                    break;
                case "4":
                    System.out.println("Doc file chua danh sach bac si:");
                    //readFile();
                    readFile2();
                    break;
                case "5":
                    System.out.println("Ghi file chua danh sach bac si:");
                    //saveFile();
                    saveFile2();
                    break;
                case "6":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"6".equals(opt));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        DoctorManager test = new DoctorManager();
        test.menu();
    }
    
}
