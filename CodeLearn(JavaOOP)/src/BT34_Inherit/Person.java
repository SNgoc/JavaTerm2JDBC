/*
Bài tập
Bạn hãy tạo ra 3 lớp Person, Student, Teacher với thông tin giống như sau:



Giải thích:

Lớp Person

name, age, address là các thuộc tính chỉ tên, tuổi và địa chỉ của đối tượng.
Person(name: String, age: int, address: String) là constructor có tham số dùng để khởi tạo giá trị cho các thuộc tính.
display() là phương thức dùng để hiển thị thông tin của đối tượng ra màn hình. Ví dụ nếu name = "Khanh", age = 23, address = "Ha Noi" thì khi gọi phương thức này màn hình sẽ hiển thị ra:
Name: Khanh
Age: 23
Address: Ha Noi​
Các phương thức còn lại là các setter và getter.
Lớp Student

Lớp Student là lớp được kế thừa từ lớp Person.
Student(name: String, age: int, address: String, gpa: double) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
Phương thức setGpa() và getGpa() là các setter và getter.
display() là phương thức được ghi đè từ lớp Person, phương thức này dùng để hiển thị thông tin của đối tượng ra màn hình. Ví dụ, nếu name = "Khanh", age = 23, address = "Ha Noi", gpa = 9.0 thì khi gọi phương thức này màn hình sẽ hiển thị ra:
Name: Khanh
Age: 23
Address: Ha Noi​
GPA: 9.0​
Lớp Teacher

Lớp Teacher là lớp được kế thừa từ lớp Person.
Teacher(name: String, age: int, address: String, salary: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
Phương thức setSalary() và getSalary() các setter và getter.
display() là phương thức được ghi đè từ lớp Person, phương thức này dùng hiển thị thông tin của đối tượng ra màn hình. Ví dụ, nếu name = "Tung", age = 34, address = "Ha Noi", salary = 1700 thì khi gọi phương thức này màn hình sẽ hiển thị ra:
Name: Tung
Age: 34
Address: Ha Noi​
Salary: 1700
Chương trình dùng để test các lớp trên:

public class Entry {
	public static void main(String[] args) {
		Student s = new Student("Khanh", 23, "Ha Noi", 9.0);
		s.display();
		System.out.println();
		Teacher t = new Teacher("Tung", 34, "Ha Noi", 1700);
		t.display();
	}
}
Kết quả khi chạy chương trình:

Name: Khanh
Age: 23
Address: Ha Noi
GPA: 9.0

Name: Tung
Age: 34
Address: Ha Noi
Salary: 1700
 */
package BT34_Inherit;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
    }
}
