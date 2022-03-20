/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author asus
 */
class Student{
    String id, name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //dung method nay de in ra value name khi dung stdList.get(key)
    @Override
    public String toString() {
        return name;
    }
}

public class S3_Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //HashMap la 1 array list gom key va value
        //tao 1 doi tuong kieu HashMap
        HashMap<String,Object> h1 = new HashMap<>(); // 1 map chua 2 parameter la string va object
        //them phan tu vao HashMap
        h1.put("Code", 1);// key la "Code", value la 1 (key la String, value la Object) (Object co the la String hoac int)
        h1.put("Fullname", "Nero");
        h1.put("Address", "SG");
        
        //duyet danh sach va in ra danh sach
        //cach 1: dung cho dev
        System.out.println("Danh sach la " + h1);
        
        //cach 2: in ra value cho nguoi dung
        System.out.println("ma so la: " + h1.get("Code"));
        System.out.println("Ten day du la: " + h1.get("Fullname"));
        System.out.println("Dia chi la: " + h1.get("Address"));
        
        //tao 1 doi tuong HashMap luu danh sach cac sinh vien
        HashMap<String, Student> stdList = new HashMap<>();
        
        //tao doi tuong student
        Student s = new Student("S1", "Nero");
        stdList.put(s.id, s);//gan id cua student lam key
        
        //tao them 1 doi tuong student khac
        s = new Student("S2", "Saro");
        stdList.put(s.id, s);
        
        //in thong tin student co trong danh sach
        Set<String> keys = stdList.keySet();
        
        //in ra danh sach cac keys
        for (String key : keys) {
            System.out.println("Keys: " + key);
        }
        
        for (String key : keys) {
            System.out.println("Keys: " + key + "Value: " + stdList.get(key));
        }
        
        //in ra danh sach cac gia tri
        for(Student std: stdList.values()){
            System.out.println(std);
        }
        
        //xoa phan tu trong danh sach bang key
        stdList.remove("S1");
        System.out.println("List sau khi xoa: " + stdList);
        
        //tim kiem theo key
        boolean result = stdList.containsKey("S2");
        if (result) {
            System.out.println("Tim thay");
        }
        else{
            System.out.println("Khong tim thay");
        }
        
        //tim kiem theo value
         boolean resultN = stdList.containsValue("Nero");
        if (resultN) {
            System.out.println("Tim thay");
        }
        else{
            System.out.println("Khong tim thay");
        }
    }
    
}
