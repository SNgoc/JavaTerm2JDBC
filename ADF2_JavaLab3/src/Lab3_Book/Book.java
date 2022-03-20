/*
1.	Tạo class Book bao gồm :
a.	Các fields dữ liệu:
i.	String id, title, author, publisher
ii.	int pages, price

b.	Các contructors để khởi tạo giá trị ban đầu cho các field dữ liệu.

c.	Method :
-	void input() : nhập chi tiết cho 1 quyển sách và kiểm tra dữ liệu hợp lệ như sau :
-	id : Bxxxx, với x là ký số.
-	title : tựa sách. ít nhất 2 ký tự chữ, số hoặc khoảng trắng.
-	author, pubisher : tên tác giả, nhà xuất bản: ko được để trống
-	pages: số trang , từ 5 – 2000.
-	price : đơn giá, >0

-	String toString() : override method này để biểu diễn nội dung của 1 đối tượng sách dưới dạng chuỗi.

 */
package Lab3_Book;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author asus
 */
public class Book {
    private String id,title,author,publisher;
    private int pages, price;

    public Book(String id, String title, String author, String publisher, int pages, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        //khai bao pattern
        Pattern p = null;
        Matcher m = null;
        
        //id
        p = Pattern.compile("B[0-9]{4}");
        while (true) {
            System.out.print("Nhap id:");
            id = sc.nextLine().trim();
            m = p.matcher(id);
            if (m.matches()) {//neu dung pattern
                break;
            }
            System.out.println("id khong hop le, Bxxxx (x la so)");
        }
        
        //title: ít nhất 2 ký tự chữ, số hoặc khoảng trắng.
        p = Pattern.compile("\\w{2,}|\\s\\s");
        while (true) {   
            System.out.print("Nhap title:");
            title = sc.nextLine();//khong xai trim() do yeu cau khoang trang
            m = p.matcher(title);
            if (m.matches()) {//neu dung pattern
                break;
            }
            System.out.println("it nhat 2 ky tu chu, so hoac khoang trang");
        }
        
        //author: khong duoc de trong
        p = Pattern.compile("\\w{1,}");
        while (true) {
            System.out.print("Nhap author:");
            author = sc.nextLine().trim();
            m = p.matcher(author);
            if (m.matches()) {
                break;
            }
            System.out.println("Khong duoc de trong");
        }
        
        //publisher: khong duoc de trong
        p = Pattern.compile("\\w{1,}");
        while (true) {
            System.out.print("Nhap publisher:");
            publisher = sc.nextLine().trim();
            m = p.matcher(publisher);
            if (m.matches()) {
                break;
            }
            System.out.println("Khong duoc de trong");
        }
        
        //pages: tu 5-2000
        while (true) {            
            System.out.print("Pages:");
            try {
                pages = Integer.parseInt(sc.nextLine().trim());
                if (5 <= pages && pages <= 2000) {
                    break;
                }
                System.out.println("Pages phai tu 5-2000");
            } catch (Exception e) {
                System.out.println("Wrong format " + e.getMessage());
            }
        }
        
        //price: >0
        while (true) {            
            System.out.print("Price:");
            try {
                price = Integer.parseInt(sc.nextLine().trim());
                if (price > 0) {
                    break;
                }
                System.out.println("Price > 0");
            } catch (Exception e) {
                System.out.println("Wrong format" + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("id:%s\ttitle:%s\tauthor:%s\tpublisher:%s\npages:%d\tprice:%d",getId(),getTitle(),getAuthor(),getPublisher(),getPages(),getPrice());
    }

    //ghi de method equals trong hashset để so sánh 2 obj của Book
    @Override
    public boolean equals(Object obj) {//bắt buộc phải là Object mặc định, không được để Book vì sẽ lỗi không @Override, Book sẽ gán cho obj bên dưới
        /* instance of:
        sử dụng để kiểm tra một đối tượng có phải là thể hiện của một kiểu dữ liệu cụ thể không (lớp, lớp con, interface).
        instanceof trong java được gọi là toán tử so sánh kiểu vì nó so sánh thể hiện với kiểu dữ liệu. 
        Nó trả về giá trị boolean là true hoặc false. Nếu bạn dùng toán tử instanceof với bất kỳ biến nào mà có giá trị null, giá trị trả về sẽ là false.
        */
        if (obj instanceof Book) {
            Book anotherB = (Book) obj;//khoi tao 1 doi tuong anotherB của Book, gán thuộc tính lop Book cho obj de so sanh anotherB với cac phan tu voi obj
            //tao 1 method equals check duplicate id, title
            //cách ghi đè phương thức equals() trong lớp này để xác nhận rằng hai đối tượng Student có các thuộc tính giống nhau được coi là bằng nhau
            if (this.id.equals(anotherB.id) || (this.title.equals(anotherB.title) && this.author.equals(anotherB.author))) {
                return true;
            }
        }
        return false;
    }
    
}
