/*
5.	Tạo lớp Product, bao gồm :
a.	Các fields dữ liệu:
-	String id, name
-	Int price
-	float in_qty =0, out_qty=0

b.	Method:
-	void input(): nhập dữ liệu cho các field sau, yêu cầu kiểm tra dữ liệu nhập:
i.	Id phải có dạng Pxxx với x : ký số
ii.	name: không được để trống
iii.	price > 0

-	void output() : xuất nội dung của 1 sp ra màn hình trên 1 dòng có dạng như sau: id, name, price, in_qty, out_qty, qoh [= in_qty - out_qty ], amt [=qoh*price]
-	String toString() : biểu diễn nội dung của đối tượng sản phẩm dưới dạng chuỗi

 */
package BT4;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Product implements Serializable{
    String id, name;
    int price;
    float in_qty = 0;
    float out_qty = 0;

    public Product() {
    }

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public float getIn_qty() {
        return in_qty;
    }

    public float getOut_qty() {
        return out_qty;
    }
    
    public float getQoh(){
        return in_qty - out_qty;
    }
    
    public float getAmt(){
        return getQoh()*price;
    }
    /*
    -	void input(): nhập dữ liệu cho các field sau, yêu cầu kiểm tra dữ liệu nhập:
i.	Id phải có dạng Pxxx với x : ký số
ii.	name: không được để trống
iii.	price > 0

    */
    void input(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;
        
        //id
        //nhap id (tao regular expression pattern)
        p = Pattern.compile("P[0-9]{3}");
        while (true) {            
            System.out.print("id(Pxxx):");
            id = sc.nextLine().trim();
            m = p.matcher(id); //kiem tra id co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo paattern
                break;
            } else {
                System.out.println("id khong dung, phai Pxxx , x la ky so");
            }
        }
        
        //name
        //nhap name (tao regular expression pattern)
        // trong compile pattern phai dung \\ khong dung \ duoc
        p = Pattern.compile("\\w{2,}");
        while (true) {            
            System.out.print("Name:");
            name = sc.nextLine().trim(); // nếu yeu cau khoang trang khong xai trim()
            m = p.matcher(name); //kiem tra name co nhap dung theo pattern khong
            if (m.matches()) {//neu dung theo pattern
                break;
            } else {
                System.out.println("Name phai co it nhat 2 ky tu");
            }
        }
        
        //price>0
        while (true) {
            System.out.print("Price:");            
            try {
                price = Integer.parseInt(sc.nextLine().trim());
                if (price > 0) {
                    break;
                }
                System.out.println("Price must > 0");
            } catch (Exception e) {
                System.out.println("Wrong format " + e.getMessage());
            }
        }
    }
    /*
    -	void output() : xuất nội dung của 1 sp ra màn hình trên 1 dòng có dạng như sau: 
    id, name, price, in_qty, out_qty, qoh [= in_qty - out_qty ], amt [=qoh*price]
    */
    void output(){
        System.out.printf("id:%s, name:%s, price:%d, in_qty:%.2f, out_qty:%.2f, qoh:%.2f, amt:%.2f",getId(),getName(),getPrice(),getIn_qty(),getOut_qty(),getQoh(),getAmt());
        System.out.println();
    }

    //-	String toString() : biểu diễn nội dung của đối tượng sản phẩm dưới dạng chuỗi
    @Override
    public String toString() {
        return String.format("id:%s \tname:%s \tprice:%d \tin_qty:%.2f \tout_qty:%.2f \tqoh:%.2f \tamt:%.2f",getId(),getName(),getPrice(),getIn_qty(),getOut_qty(),getQoh(),getAmt());
    }
    
    
}
