/*
Bài tập
Bạn hãy tạo ra lớp Student với thông tin giống như sau:

-name: String
-gender: char
+Student()
+Student(name: String)
+Student(gender: char)
+Student(name: String, gender: char)
+display(): void

Giải thích:

name và gender là hai thuộc tính private của lớp Student.
Student() là phương thức khởi tạo không tham số dùng để khởi tạo giá trị cho name = "Unknown", gender = 'u'
Student(name: String) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính name và gender (this.name = name; gender = 'u').
Student(gender: char) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính gender và name (this.gender = gender, name = "Unknown").
Student(name: String, gender: char) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính name và gender.
display() là phương thức dùng để hiển thị thông tin của đối tượng ra màn hình.

Nếu gender = 'm' thì hiển thị ra màn hình "Gender: Male", nếu gender = 'f' thì hiển thị ra màn hình "Gender: Female", nếu gender = 'u' thì hiển thị ra màn hình "Gender: Unknown". 

Ví dụ:
Nếu name = "Thu", gender = 'f' thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Name: Thu
Gender: Female​
Nếu name = "Sang", gender = 'u' thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Name: Sang
Gender: Unknown
Nếu name = "Unknown", gender = 'u' thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Name: Unknown
Gender: Unknown​

Chương trình để test lớp Student:

public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student("Quang");
		s2.display();
		Student s3 = new Student('m');
		s3.display();
		Student s4 = new Student("Thu", 'f');
		s4.display();
	}
}
Kết quả khi chạy chương trình:

Name: Unknown
Gender: Unknown
Name: Quang
Gender: Unknown
Name: Unknown
Gender: Male
Name: Thu
Gender: Female
 */
package BT19_JavaOOP;

class Student{
    private String name;
    private char gender;

    public Student() {
        name = "Unknown";
        gender = 'u'; //gán ký tự char thì sử dụng ''
    }

    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Student(String name) {
        this.name = name;
        gender = 'u';
    }

    public Student(char gender) {
        name = "Unknown";
        this.gender = gender;
    }
    
    public void display(){
        if (gender == 'm') {
            System.out.println("Name: " + name);
            System.out.println("Gender: Male");
        }
        else if (gender == 'f') {
            System.out.println("Name: " + name);
            System.out.println("Gender: Female");
        }
        else{
            System.out.println("Name: " + name);
            System.out.println("Gender: Unknown");
        }
    }
}

public class BT19_Nap_chong_phuong_thuc {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Quang");
        s2.display();
        Student s3 = new Student('m');
        s3.display();
        Student s4 = new Student("Thu", 'f');
        s4.display();
    }
}
