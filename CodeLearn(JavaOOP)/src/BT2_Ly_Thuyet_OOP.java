
import java.util.Scanner;

/*
LÝ THUYẾT
Bài trước bạn đã hiểu sơ qua về lập trình hướng đối tượng và đã biết một số khái niệm như lớp, đối tượng, thuộc tính và phương thức. 
Ở bài này bạn sẽ biết cách định nghĩa ra một lớp và sử dụng các đối tượng thuộc lớp này.

Về bản chất, lớp (class) là một kiểu dữ liệu do bạn tự định nghĩa và đối tượng chính là biến của kiểu dữ liệu này. Cú pháp để khai báo một lớp như sau:

class <tên_lớp> {
	// Khai báo danh sách các thuộc tính
	<kiểu_dữ_liệu> <tên_thuộc_tính>;
	...
	// Khai báo danh sách các phương thức
	public <kiểu_trả_về> <tên_phương_thức>(<kiểu_tham_số> <tên_tham_số>, ...) {
		...
	}
	...
}
Ví dụ bạn có thể tạo ra lớp Student với 2 thuộc tính là name, age và 2 phương thức là getInformation() và display() giống như sau:

class Student{
	String name;
	int age;
	public void getInformation() {
		
	}
	public void display() {
		
	}
}
Để khai báo đối tượng của một lớp bạn dùng từ khóa new. Ví dụ để khai báo một đối tượng thuộc lớp Student bạn làm như sau:

// Khai báo đối tượng s1 thuộc lớp Student
Student s1 = new Student();
Để truy xuất tới các thuộc tính và phương thức của một đối tượng bạn dùng toán tử ".":

class Student {
	String name;
	int age;

	public void display() {
		System.out.println("My name is " + name);
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student();
		// Gán giá trị cho thuộc tính name của đối tượng s1
		s1.name = "Long";
		// Gọi tới phương thức display của đối tượng s1
		s1.display();
	}
}
Kết quả khi chạy chương trình:

My name is Long
Có thể thấy lớp và đối tượng chỉ đơn giản là kiểu dữ liệu và biến. Kiểu dữ liệu này khác các kiểu dữ liệu thông thường như int, string, double, ... 
ở chỗ nó có thể chứa được các phương thức và kiểu dữ liệu khác.
 */

/*
BÀI TẬP
Bạn hãy viết chương trình khai báo lớp Student với thông tin giống như sau:

Giải thích: hình trên là mô tả của lớp Student với các thuộc tính và phương thức giống như sau:

name và age là hai thuộc tính dùng để lưu trữ tên và tuổi của đối tượng học sinh.
display() là phương thức dùng để hiển thị thông tin của đối tượng ra màn hình. 

Ví dụ, nếu đối tượng có thuộc tính name = "An", age = 24 thì khi gọi phương thức display() thì màn hình sẽ hiển thị ra:
Name: An
Age: 24
getInformation() là phương thức dùng để nhập dữ liệu cho thuộc tính name và age từ bàn phím. 

Ví dụ nếu bạn dùng phương thức này để nhập thông tin cho một đối tượng học sinh với name = "Kien", age = 28 như bên dưới:
Kien
28​
thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
Name: Kien
Age: 28
 */

class Student {
    String name;
    int age;
    
    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập name:");
        name = sc.nextLine();
        System.out.print("Nhập age:");
        age = sc.nextInt();
    }
    
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class BT2_Ly_Thuyet_OOP {
    public static void main(String args[]) {
        //khai báo đối tượng cho class
        Student s1 = new Student();
        // Gán giá trị cho thuộc tính name của đối tượng s1
        s1.name = "Long";
        s1.age = 22;
        // Gọi tới phương thức display của đối tượng s1
        s1.display();
        
        Student s2 = new Student();
        s2.getInformation();
        s2.display();
    }
}
