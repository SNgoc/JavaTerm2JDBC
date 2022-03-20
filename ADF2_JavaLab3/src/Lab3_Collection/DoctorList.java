/*
2.	Tạo class DoctorList bao gồm :
a. Các f ields dữ liệu:
HashMap<String, Doctor> drList để lưu danh sách các bác sĩ.


b. Method :
1.	void add() : thêm 1 bác sĩ vô danh sách drList. Yêu cầu kiểm tra trùng mã .
2.	void remove(String drID) : Xóa bác sĩ có mã drID ra khỏi danh sách drList.

3.	void display() : In danh sách các bác sĩ thuộc chuyên khoa 2 ra màn hình.
4.	void display(StringdrName) : Tìm và in ra ds các bác sĩ có tên chứa trong đối số drName

 */
package Lab3_Collection;

import java.util.HashMap;
import java.util.Map;


public class DoctorList {
    //tao 1 hashmap co key la string va value la cac obj trong doctor
    HashMap<String, Doctor>drList = new HashMap<>();
    
    //method add()
    void add(){
        //tao 1 obj doctor
        Doctor dr = new Doctor();
        dr.input();
        
        //add va check duplicate           
            // phương thức keySet()
            // sẽ trả về 1 Set chứa key có trong hashMap
            //dung string d vi key id duoc khai bao kieu string
            // String d la de so sanh key d voi key cua dr la id do id la String
            for (String d : drList.keySet()) {
                if (dr.getId().equals(d)) {
                    System.out.println("Duplicate key id");
                    return;
                }
            }
            
            //them doctor vao hashmap va gan id la key
            drList.put(dr.getId(), dr);
    }
    
    //remove id
    void remove(String drID){
        if (drList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        /* phương thức containsKey() sẽ kiểm tra id doctor mới nhập vào
        có tồn tại trong drList hay chưa */
        if (drList.containsKey(drID)) {
            drList.remove(drID);
            System.out.println("Deleted");
        } else {
            System.out.println("Can't found id " + drID);
        }
    }
    
    //In danh sách các bác sĩ thuộc chuyên khoa 2 (level 2) ra màn hình.
    void display(){
        if (drList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        boolean found = false;
        //neu su dung HashMap thi khi su dung for each phai them .values() vao drList 
        //thi moi print duoc vi HashMap la kieu <key,values>
        for (Doctor d : drList.values()) {
            //Kiểm tra nếu HashMap chứa một phần tử có giá trị được chỉ định.
            if (d.getLevel().equals("level 2")) {
                System.out.println("---------------");
                System.out.println(d);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No dotor level 2");
        }
    }
    
    //display(StringdrName) : Tìm và in ra ds các bác sĩ có tên chứa trong đối số drName
    void display(String drName){
        if (drList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        boolean found = false;
        for (Doctor d : drList.values()) {
            if (d.getName().contains(drName)) {
                System.out.println("---------------");
                System.out.println(d);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Can't find doctor with keyword " + drName);
        }
    }
}
