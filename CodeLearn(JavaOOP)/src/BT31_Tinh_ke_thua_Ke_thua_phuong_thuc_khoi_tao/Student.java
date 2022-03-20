
/*
Kế thừa có nghĩa là thừa hưởng lại, ví dụ như tài sản của ba mẹ sẽ được giao lại cho con cái.

Kế thừa trong lập trình (Inheritance) có nghĩa là một lớp sẽ thừa hưởng lại những thuộc tính, phương thức từ lớp khác.

Việc sử dụng kế thừa nhằm tái sử dụng code đã viết trước đó, thuận tiện trong việc bảo trì và nâng cấp chương trình.

Khai báo và sử dụng kế thừa
Cú pháp:

class <tên lớp con> extends <tên lớp cha> {

}
*/

package BT31_Tinh_ke_thua_Ke_thua_phuong_thuc_khoi_tao;

//Bây giờ ta chỉ cần cho lớp Student kế thừa Person như sau:
public class Student extends Person{
    public Student(String name, int dob) {
    /*
    Trong phương thức khởi tạo Student, ta sẽ dùng từ khóa super để cho lớp con truy cập các những thứ liên quan đến lớp cha. 
    Như ví dụ trên thì ta dùng super() để gọi phương thức khởi tạo lớp cha.
    Từ khóa super khác từ khóa this ở chỗ từ khóa super sẽ tham chiếu tới lớp cha còn từ khóa this sẽ tham chiếu tới lớp hiện tại. 
    Do đó bạn cũng có thể truy xuất tới các thuộc tính và phương thức của lớp cha bằng từ khóa super.
    */
        super(name, dob);
        
    }
    
    private double gpa;

    public Student(String name, int dob, double gpa) {
        super(name, dob);
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}
