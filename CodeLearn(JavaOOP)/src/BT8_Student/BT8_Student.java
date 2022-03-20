/*
 Bài tập
Bạn hãy tạo ra lớp Student trong file Student.java với thông tin giống như sau:

String name;
int age;
Student()
getInformation(): void
display(): void

Giải thích: hình trên là mô tả của lớp Student với các thuộc tính và phương thức giống như sau:

name là thuộc tính kiểu String với phạm vi truy cập private.
age là thuộc tính kiểu int với phạm vi truy cập private.
Student() là phương thức khởi tạo không tham số có phạm vi truy cập là public.
getInformation() và display() là hai phương thức có phạm vi truy cập public.
Trong thực tế, bạn không nên viết code của hai class trong cùng 1 file giống như các bài tập ở phần trước 
(class Student và class Entry được viết trong cùng 1 file). Với mỗi một class bạn nên tạo ra 1 file riêng cho nó. 
Ví dụ: file Student.java sẽ chứa code của lớp Student, file Entry.java sẽ chứa code của lớp Entry, ...

Quay lại phần bài tập, cửa sổ code trong bài này chính là file Student.java, 
trong file này bạn cần tạo ra lớp Student với đầy đủ các thuộc tính và phương thức giống như đã mô tả 
(bạn chỉ cần khai báo các thuộc tính và phương thức, không cần viết code bên trong phương thức).

Lưu ý: khi nộp bài lên hệ thống, bạn không cần khai báo package.
 */
package BT8_Student;

import java.util.Scanner;

public class BT8_Student {
    private String name;
    private int age;

    //Phương thức khởi tạo không tham số
    public BT8_Student() {
    }
    
    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Name: ");
        name = sc.nextLine();
        System.out.print("Nhập Age: ");
        age = sc.nextInt();
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
