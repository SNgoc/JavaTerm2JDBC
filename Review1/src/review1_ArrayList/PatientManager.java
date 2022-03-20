/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1_ArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class PatientManager {
    ArrayList<Patient> paList = new ArrayList<>();
    File fname = new File("patient.txt");
    
    void addNew(){
        Patient p = new Patient();
        p.input();
        for (Patient patient : paList) {
            if (patient.getID().equals(p.getID())) {
                System.out.println("Duplicate ID");
                return;
            }
        }
        paList.add(p);
        System.out.println("Added");
    }
    
    void display(String id){
        if (paList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        boolean found = false;
        for (Patient patient : paList) {
            if (patient.getID().equals(id)) {
                System.out.println("=====================");
                System.out.println(patient);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Can't find id " + id);
        }
    }
    
    void save(){
        PrintWriter fout;
        try {
            fout = new PrintWriter(new FileOutputStream(fname,true));
            paList.forEach((p) -> {fout.println(p);});
            fout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PatientManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("File was written");
    }
    
    void readFile() throws IOException, ParseException{
        System.out.println("Read a File");
        if (paList.isEmpty()) {
            if (fname.exists() == false) {
                System.out.println("File chua ton tai");
                fname.createNewFile();
                System.out.println("Created a file");
                return;
            }
            //check file có dữ liệu hay chưa
            if (fname.length() == 0) {
                System.out.println("File is empty, please addd data first");
                return;
            }
            
            BufferedReader br = new BufferedReader(new FileReader(fname));

            String arr[];
            while (br.ready()) {   //chạy loop để add chuỗi         
                String line = br.readLine();
//                String lineNew = line.replaceAll("\\w+", ""); //không sử dụng vì toString không có ký tự nào phía trước value
                
                arr = line.split(" - ");
                //thêm phần tử từ arr vào obj paList
                if (arr.length == 4) {
                    //tạo đối tượng patient để add phần tử từ arr
                    Patient pt = new Patient();
                    //lưu ý: phải add đúng thứ tự id,name.. trong to string, nếu id nằm trước thì add arr[0] trước, không sẽ bị đảo vị trí
                    pt.ID = arr[0].trim(); 
                    pt.name = arr[1].trim();
                    pt.gender = Boolean.parseBoolean(arr[2].trim());
                    SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
                    pt.examDate = dateformat.parse(arr[3].trim());

                    //add data vào lại emplist
                    paList.add(pt);
                }
            }
            for (Patient patient : paList) {
                System.out.println(patient);
            }
            //đóng buffered
            br.close();
        }
    }
}
