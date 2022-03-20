/*
6.	Tạo lớp ProductCatalog bao gồm :
a.	Các fields dữ liệu:

-	HashMap <String , Product> pList , lưu danh sách sản phẩm trong bộ nhớ. String fname [=TONKHO.DAT], chứa tên tập tin lưu danh sách sản phẩm

b.	Default contructor:
-	khởi tạo field pList, fname .
-	Đọc dữ liệu từ tập tin TONKHO.DAT (nếu có) vô danh sách pList

c.	void add() : Tạo và nhập thông tin chi tiết cho sản phẩm mới & lưu vô danh sách pList
d.	void set (String sID, float sQty, boolean isReceive) : nhập/xuất kho sản phẩm

if isReceive = true

{ thêm 1 lượng sQty của mặt hàng có mã số sID vô kho (in_qty += sQty) } else

{ xuất 1 lượng sQty của sản phẩm có mã số sID ra khỏi kho (out_qty += sQty) }

e.	void display() : In báo cáo tồn kho ( gọi hàm output() class Product )
f.	void saveFile() : Ghi danh sách sản phẩm vô tập tin TONKHO.DAT

 */
package BT4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author asus
 */
public class ProductCatalog {
    HashMap<String, Product>pList = new HashMap<>();
    File fname = new File("tonkho.dat");
    
    void addP(){
        Product p = new Product();
        p.input();
        for (String id : pList.keySet()) {
            if (p.getId().equals(id)) {
                System.out.println("Duplicate key id");
                return;
            }
        }
        pList.put(p.getId(), p);
        System.out.println("Added success");
    }
    
    /*
    d.	void set (String sID, float sQty, boolean isReceive) : nhập/xuất kho sản phẩm

if isReceive = true

{ thêm 1 lượng sQty của mặt hàng có mã số sID vô kho (in_qty += sQty) } else

{ xuất 1 lượng sQty của sản phẩm có mã số sID ra khỏi kho (out_qty += sQty) }

    */
    void setP(String sId, float sQty, boolean isReceive){
        if (pList.isEmpty()) {
            System.out.println("No data, please add data first");
            return;
        }
        boolean found = false;
        for (Product pr : pList.values()) {
            if (pr.getId().equals(sId) && isReceive == true) {
                pr.in_qty += sQty;
                System.out.println("Da nhap " + sQty + "vao ma " + sId);
                found = true;
            }
            if (pr.getId().equals(sId) && isReceive == false) {
                pr.out_qty += sQty;
                System.out.println("Da xuat " + sQty + "vao ma " + sId);
                found = true;
            }
        }
        
        if (found == false) {
            System.out.println("Khong tim thay san pham co ma " + sId);
        }
    }
    
    //void display() : In báo cáo tồn kho ( gọi hàm output() class Product )
    void display(){
        if (pList.isEmpty()) {
            System.out.println("No data, please add data first");
            return;
        }
        for (Product pr : pList.values()) {
            System.out.println("---------------");
            pr.output();
        }
    }
    
    //void saveFile() : Ghi danh sách sản phẩm vô tập tin TONKHO.DAT
    void saveFile() throws FileNotFoundException, IOException{
        ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(fname));
        fout.writeObject(pList);
        fout.close();
        System.out.println("Data was written to " + fname);
    }
    
    //-	Đọc dữ liệu từ tập tin TONKHO.DAT (nếu có) vô danh sách pList
    void readFile() throws IOException, ClassNotFoundException{
        if (pList.isEmpty()) {//dòng này để không bị lỗi ghi trùng dữ liệu, và để add data vào list
            if (fname.exists() == false) {
                System.out.println("File isn't not exist");
                fname.createNewFile();
                System.out.println("Created a file");
                System.out.println("Please run again.");
                return;
            }
            //check file có dữ liệu hay chưa
            if (fname.length() == 0) {
                System.out.println("File is empty, please add data first");
                return;
            }
            ObjectInputStream fin = new ObjectInputStream(new FileInputStream(fname));
            pList = (HashMap<String, Product>) fin.readObject();
            //close file
            fin.close();
        }
        System.out.println("Read data from " + fname);
    }

}
