/*
2.	Tạo class BookCatalog bao gồm :
a. Các f ields dữ liệu:
HashSet<Book> bkList để lưu tất cả các quyển sách trong thư viện.

b. Method :
1.	void add() : thêm 1 sách mới vô bkList.  Yêu cầu kiểm tra trùng mã .
2.	void remove( String bkID ) : Xóa 1 quyển sách có mã số bkID ra khỏi  bkList.
3.	void display() : In danh mục các quyển sách trong thư viện .

4.	void display( String auName ) : Tìm và in ra các quyển sách có của tác giả có tên auName

 */
package Lab3_Book;

import java.util.HashSet;

/**
 *
 * @author asus
 */
public class BookCatalog {
    HashSet<Book> bkList = new HashSet<>();
    
    void add(){
        Book bk = new Book();
        bk.input();
        //kiem tra neu trung id hoac khac id nhung co title va author giong nhau thi deu xem nhu duplicate
        for (Book book : bkList) {//duyet phan tu, so sanh cac phan tu id, title and author của book voi cac phan tu trong bkList, su dung method equals cđã được override bên Book.java
            if (book.equals(bk)) {
                System.out.println("Duplicate id or Duplicate title and author: " + book.equals(bk));
                return;
            }
        }
        bkList.add(bk);
        System.out.println("Add success");
    }
    
    //remove
    void remove(String bkID){
        if (bkList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        boolean found = false;
        for (Book book : bkList) {
            if (book.getId().equals(bkID)) {
                bkList.remove(book);
                System.out.println("Deleted");
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No found id " + bkID);
        }
    }
    
    //display
    void display(){
        if (bkList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        for (Book book : bkList) {
            System.out.println("-------------------");
            System.out.println(book);
        }
    }
    
    //display(String auName)
    void display(String auName){
        if (bkList.isEmpty()) {
            System.out.println("No data");
            return;
        }
        boolean found = false;
        for (Book book : bkList) {
            if (book.getAuthor().contains(auName)) {
                System.out.println("-------------------");
                System.out.println(book);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No found id " + auName);
        }
    }
}
