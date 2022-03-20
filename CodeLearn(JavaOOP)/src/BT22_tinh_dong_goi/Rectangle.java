/*
 Bài tập
Bạn hãy tạo ra lớp Rectangle với thông tin giống như sau:
-length,width: double
+Rectangle()
+Rectangle(length,width:double)
+setLength(length:double):void
+getLength():double
+setWidth(width:double):void
+getWidth():double
+getArea():double
+getPerimeter():double

Giải thích:

length và width là hai thuộc tính chỉ chiều dài và chiều rộng của hình chữ nhật.
Rectangle() là phương thức khởi tạo không tham số.
Rectangle(length: double, width: double) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính length và width.
setLength(length: double), getLength(), setWidth(width: double), getWidth() là các setter và getter bạn đã học ở các bài trước.
getArea() là phương thức trả về diện tích hình chữ nhật.
getPerimeter() là phương thức trả về chu vi hình chữ nhật.
Chương trình để test lớp Rectangle trên:

public class Entry {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4, 5);
		System.out.println("Area: " + r.getArea());
		System.out.println("Perimeter: " + r.getPerimeter());
		r.setLength(2);
		r.setWidth(3);
		System.out.println("Area: " + r.getArea());
		System.out.println("Perimeter: " + r.getPerimeter());
	}
}
Kết quả khi chạy chương trình:

Area: 20.0
Perimeter: 18.0
Area: 6.0
Perimeter: 10.0
 */

package BT22_tinh_dong_goi;


public class Rectangle {
     private double length, width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    public double getArea(){
        return length * width;
    }
    
    public double getPerimeter(){
        return (length+width)*2;
    }
}
