/*
 Bài tập
Bạn hãy tạo ra lớp Student với thông tin giống như sau:

-id, name, age, address, score

Giải thích:

id, name, age, address, score lần lượt là các thuộc tính chỉ mã, tên, tuổi, địa chỉ và điểm của đối tượng học sinh. 
Trong đó, thuộc tính score luôn phải được đảm bảo là không âm và nhỏ hơn hoặc bằng 10 (nếu score < 0 thì gán score = 0, nếu score > 10 thì gán score = 10).
Student() là phương thức khởi tạo không tham số.
Student(id: int, name: String, age: int, adderss: String, score: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính id, name, age, address, score
Các phương thức còn lại là các setter và getter mà bạn đã được học.
Chương trình để test lớp Student trên:

public class Entry {
	public static void main(String[] args) {
		Student s = new Student(1001, "Trung", 24, "Ha Noi", 5);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
		System.out.println(s.getScore());
		s.setScore(-7);
		System.out.println(s.getScore());
		s.setScore(15);
		System.out.println(s.getScore());
	}
}
Kết quả khi chạy chương trình:

1001
Trung
24
Ha Noi
5
0
10
 */

package BT23_JavaOOP_Tao_getter_setter;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;

    public Student(int id, String name, int age, String address, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.setScore(score);
    }

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
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

    public void setScore(int score) {
        if (score < 0) {
            this.score = 0;
        }
        else if (score > 10) {
            this.score = 10;
        }
        else{
            this.score = score;
        }
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

    public int getScore() {
        return score;
    }
    
}
