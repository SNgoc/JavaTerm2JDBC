/*
 Đây là bài đầu tiên trong series học lập trình hướng đối tượng với Java, trước khi
tới với khóa học này bạn cần có một số kiến thức cơ bản như biến, câu điều kiện,
vòng lặp, phương thức. Nếu bạn là người mới bắt đầu học lập trình thì hãy tham
khảo khóa học Java cơ bản tại đây (https://codelearn.io/learning/detail/java-coban) trước.

Bài tập
Bạn hãy cho biết lập trình hướng đối tượng là gì?

Lý thuyết

Lập trình hướng đối tượng được hiểu đơn giản là một phương pháp để giải quyết
bài toán lập trình mà khi áp dụng code sẽ trở nên dễ phát triển và dễ bảo trì hơn.
Đây là một phương pháp tiên tiến, phù hợp để phát triển hầu hết các ứng dụng
hiện nay. Phương pháp này sẽ giải quyết bài toán bằng cách chia chương trình
thành các đối tượng, với mỗi đối tượng sẽ có các thuộc tính (dữ liệu) và hành vi
riêng (phương thức).

Để có cái nhìn trực quan về lập trình hướng đối tượng, bạn hãy xem chương trình
sau:

    class Student {
        String name;
        int age;
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        }
    }

    public class Entry {
        public static void main(String[] args) {
            Student student1 = new Student();
            student1.name = "Linh";
            student1.age = 24;
            student1.display();
        }
    }

Kết quả khi chạy chương trình:
Name: Linh
Age: 24

Chương trình trên tạo ra một đối tượng học sinh, sau đó thực hiện gán tên và tuổi
cho đối tượng này và hiển thị thông tin của đối tượng ra màn hình.

Ví dụ này chỉ để bạn có cái nhìn qua và cảm nhận được về phương pháp lập trình
hướng đối tượng nên đừng lo nếu bạn không hiểu được các đoạn code. Có thể
thấy lập trình hướng đối tượng là phương pháp mà giải quyết các bài toán thông
qua các đối tượng. Trước khi đi sâu hơn, bạn cần biết một số khái niệm cơ bản
trong lập trình hướng đối tượng sau:

1. Lớp (class) là nơi định nghĩa thông tin về các đối tượng, bạn cũng có thể
hiểu lớp là một kiểu dữ liệu mà biến của kiểu dữ liệu này được coi như một
đối tượng. Như trong ví dụ trên thì Student là lớp dùng để mô tả thông tin
về các đối tượng học sinh.
Ví dụ về lớp: Học sinh, giáo viên, xe ô tô, …

2. Đối tượng (object) là một thể hiện của lớp, bạn có thể hiểu đối tượng là một
biến. Như trong ví dụ trên thì biến student1 là một đối tượng đại diện cho
thông tin của một học sinh.

3. Thuộc tính (attribute): là các đặc điểm của đối tượng, như trong ví dụ trên
thì name và age là hai thuộc tính của đối tượng học sinh.
Ví dụ về thuộc tính: tên, tuổi, chiều cao, cân nặng, năm sinh, ...

4. Phương thức (method): là hành vi (hành động) của đối tượng, như ví dụ trên
thì display() là một phương thức dùng để giới thiệu bản thân của học sinh.
Ví dụ về phương thức: giới thiệu bản thân, học bài, chạy, ...
 */
