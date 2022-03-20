/*
Lý thuyết
Constructor (phương thức khởi tạo) trong Java được chia làm 2 loại là constructor không tham số (như bài trước bạn đã học) và constructor có tham số.

Một constructor mà có tham số truyền vào được gọi là constructor có tham số, xem ví dụ sau để hiểu rõ hơn:

class Student {
	public Student(String name) {
		System.out.println("My name is " + name);
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s = new Student("Viet");
	}
}
Kết quả khi chạy chương trình:

My name is Viet
Có thể thấy xâu "Viet" đã được truyền vào constructor của lớp Student.

Bạn cũng có thể gán giá trị cho các thuộc tính trong phương thức khởi tạo giống như chương trình sau:

class Student {
	String name;
	int age;

	public Student(String n, int a) {
		name = n;
		age = a;
	}

	public void show() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student("Linh", 24);
		s1.show();
	}
}
Kết quả khi chạy chương trình:

Name: Linh
Age: 24
Lưu ý: nếu tên tham số đầu vào trùng với tên thuộc tính của lớp thì bạn có thể truy xuất tới thuộc tính của lớp bằng từ khóa this và toán tử . giống như ví dụ sau:

class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student("Linh", 24);
		s1.show();
	}
}
Kết quả khi chạy chương trình:

Name: Linh
Age: 24
 */

/*
Bài tập
Bạn hãy điền code vào dấu ... để chương trình hiển thị ra màn hình thông tin sau:

Name: Long
Age: 24
Name: Kien
Age: 29
*/

class BT6_Student {
	String name;
	int age;

    public BT6_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

public class BT6_Constructor {
    public static void main(String args[]) {
        BT6_Student s1 = new BT6_Student("Long", 24);
        BT6_Student s2 = new BT6_Student("Kien", 29);
        s1.display();
        s2.display();
    }
}
