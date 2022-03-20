/*
BÀI TẬP
Bạn hãy viết chương trình hiển thị ra màn hình thông tin sau:

Id: 1001
Name: Quynh
Age: 24
Address: Ha Noi

----HƯỚNG DẪN
Bạn cần tạo ra các setter và getter cho lớp Person giống như sau:

class Person{
	private int id;
	private String name;
	private int age;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

public class Entry {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(1001);
		p.setName("Quynh");
		p.setAge(24);
		p.setAddress("Ha Noi");
		System.out.println("Id: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Address: " + p.getAddress());
	}
}
Ngoài việc sử dụng các setter để gán giá trị cho các biến private thì bạn cũng có thể sử dụng phương thức khởi tạo có tham số 
mà vẫn đảm bảo được tính đóng gói. Code mẫu sử dụng phương thức khởi tạo có tham số thay cho các setter:

class Person{
	private int id;
	private String name;
	private int age;
	private String address;

	public Person(int id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getId() {
		return id;
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
}

public class Entry {
	public static void main(String[] args) {
		Person p = new Person(1001, "Quynh", 24, "Ha Noi");
		System.out.println("Id: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Address: " + p.getAddress());
	}
}
Trong thực tế bạn nên sử dụng phương thức khởi tạo có tham số để khởi tạo giá trị cho các thuộc tính 
và sử dụng các setter để thay đổi giá trị cho các thuộc tính (ưu tiên phương thức khởi tạo có tham số trước).
 */

class Person {
    private int id;
    private String name;
    private int age;
    private String address;

//    Trong thực tế bạn nên sử dụng phương thức khởi tạo có tham số để khởi tạo giá trị cho các thuộc tính 
//    và sử dụng các setter để thay đổi giá trị cho các thuộc tính (ưu tiên phương thức khởi tạo có tham số trước)
    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    //sử dụng các setter để thay đổi giá trị cho các thuộc tính
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    //Method get
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
}

public class BT21_Tinh_dong_goi_tao_setter_getter_constructor {
    public static void main(String args[]) {
        Person p = new Person(1001, "Quynh", 24, "Ha Noi");
        p.setId(1001);
        p.setName("Quynh");
        p.setAge(24);
        p.setAddress("Ha Noi");
        
        System.out.println("Id: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Address: " + p.getAddress());
    }
}
