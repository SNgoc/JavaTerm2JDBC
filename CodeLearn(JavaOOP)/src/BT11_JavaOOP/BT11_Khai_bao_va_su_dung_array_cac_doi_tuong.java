/*
Bài tập
Bạn hãy điền code vào dấu ... để màn hình hiển thị ra thông tin sau:

Name: Tuan
Age: 24
Name: Cuong
Age: 25
Name: Duc
Age: 24
Hướng dẫn
Bạn cần lưu ý rằng việc khai báo và sử dụng mảng các đối tượng không giống với khai báo và sử dụng mảng các kiểu dữ liệu nguyên thủy như int, double, String, ...

Để sử dụng được các phần tử trong mảng bạn cần phải khởi tạo cho từng phần tử. Ví dụ:

// Khai báo mảng students với n phần tử
Student[] students = new Student[n];
for (int i = 0; i < n; i++) {
	// Khởi tạo các phần tử trong mảng students
	students[i] = new Student();
}
 */
package BT11_JavaOOP;

class Student{
    private String name;
    private int age;

    //constructor có tham số
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class BT11_Khai_bao_va_su_dung_array_cac_doi_tuong {
    public static void main(String[] args) {
        //Để sử dụng được các phần tử trong mảng bạn cần phải khởi tạo cho từng phần tử.
        // Khai báo mảng students với 3 phần tử
        Student[] s = new Student[3];
        
        s[0] = new Student("Tuan", 24);
        s[1] = new Student("Cuong", 25);
        s[2] = new Student("Duc", 24);
        
        for (int i = 0; i < 3; i++) {
            s[i].display();
        }
    }
}
