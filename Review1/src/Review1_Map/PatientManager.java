/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review1_Map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asus
 */
public class PatientManager {
    Map<String, Patient>paList = new HashMap<>();
    File fname = new File("patientMap.txt");
    
    void addNew(){
        Patient p = new Patient();
        p.input();
        
        for (String IdCheck : paList.keySet()) {
            if (p.getID().contains(IdCheck)) {
                System.out.println("Duplicate ID");
                return;
            }
        }
        
        paList.put(p.ID, p);
        System.out.println("Added");
    }
    
    void display(String id){
        if (paList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        boolean found = false;
        for (Patient pa : paList.values()) {
            if (pa.getID().equals(id)) {
                System.out.println("=======================");
                System.out.println(pa);
                found = true;
            }
        }
        
        if (found == false) {
            System.out.println("Can't find patient with id " + id);
        }
    }
    
    void save() throws FileNotFoundException{
        PrintWriter fout = new PrintWriter(new FileOutputStream(fname, true));
        for (Patient pa : paList.values()) {
            fout.println(pa);
        }
        fout.close();
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
            while (br.ready()) {//chạy loop để add chuỗi         
                String line = br.readLine();
//                String lineNew = line.replaceAll("\\w+", ""); //không sử dụng vì toString không có ký tự nào phía trước value
                
                arr = line.split("--");
                //thêm phần tử từ arr vào obj paList
                if (arr.length == 4) {
                    //tạo đối tượng patient để add phần tử từ arr
                    Patient pt = new Patient();
                    //lưu ý: phải add đúng thứ tự id,name.. trong to string, nếu id nằm trước thì add arr[0] trước, không sẽ bị đảo vị trí
                    pt.ID = arr[0].trim(); 
                    pt.name = arr[1].trim();
                    pt.gender = Boolean.parseBoolean(arr[2].trim());
                    pt.examDate = arr[3].trim();

                    //add data vào lại emplist
                    paList.put(pt.ID, pt);
                }
            }
            for (Patient patient : paList.values()) {
                System.out.println(patient);
            }
            //đóng buffered
            br.close();
        }
    }
}
