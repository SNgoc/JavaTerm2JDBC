/*
Bạn hãy khai báo lớp Circle với thông tin giống như sau:

-radius: double
+Circle(radius:double)
+getArea():double
getCircumference():double

Giải thích:

radius là thuộc tính chỉ bán kính của đường tròn
Circle(radius: double) là phương thức khởi tạo có tham số dùng để gán giá trị cho thuộc tính radius
getArea() và getCircumference() là hai phương thức trả về diện tích và chu vi của hình tròn với pi (π) = 3.14.
Chương trình dùng để test lớp Circle:

public class Entry {
	public static void main(String[] args) {
		Circle c = new Circle(7);
		System.out.println(c.getArea());
		System.out.println(c.getCircumference());
	}
}
Kết quả khi chạy chương trình:

153.86
43.96
 */
package BT10_JavaOOP;

class Circle {

    private double radius;
    
    //Constructor ko tham số
    public Circle() {
    }
    
    //Constructor có tham số

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return radius*radius*3.14;
    }
    
    public double getCircumference() {
        return 2*radius*3.14;
    }
}

public class BT10_Cai_dat_class_circle {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
