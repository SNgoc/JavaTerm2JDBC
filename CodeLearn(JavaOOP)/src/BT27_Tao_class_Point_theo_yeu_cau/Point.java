/*
 Bài tập
Bạn hãy tạo ra lớp Point trong file Point.java với thông tin giống như sau:



Giải thích:

Point là lớp lưu thông tin về tọa độ một điểm trong hệ tọa độ 2 chiều.
x, y là các thuộc tính chỉ hoành độ, tung độ của đối tượng lớp Point.
Point() là phương thức khởi tạo không tham số
Point(x: double, y: double) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho thuộc tính x (hoành độ) và y (tung độ).
setX(x: double), getX(), setY(y: double), getY() là các setter và getter mà bạn đã biết.
setXY(x: double, y:double) là phương thức dùng để thay đổi giá trị cho thuộc tính x và y.
distance(x: double, y:double) là phương thức trả về khoảng cách giữa đối tượng hiện tại và điểm có hoành độ x, tung độ y.
distance(another: Point) là phương thức trả về khoảng cách giữa đối tượng hiện tại và đối tượng another (another cũng là một đối tượng thuộc lớp Point).
Chương trình dùng để test lớp Point:

public class Entry {
	public static void main(String[] args) {
		Point p1 = new Point(1.5, 6.7);
		Point p2 = new Point(2.8, 3.2);
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(2.34, 7.8));
	}
}
Kết quả khi chạy chương trình:

3.7336309405188937
1.384052022143676
 */
package BT27_Tao_class_Point_theo_yeu_cau;


public class Point {
    private double x,y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    /*
    phương thức trả về khoảng cách giữa đối tượng hiện tại và điểm có hoành độ x, tung độ y.
    */
    public double distance(double x, double y){
        return Math.sqrt((this.x - x)*(this.x-x) + (this.y-y)*(this.y-y));
    }
    
    /*
    distance(another: Point) là phương thức trả về khoảng cách giữa đối tượng hiện tại và đối tượng another (another cũng là một đối tượng thuộc lớp Point).
    
    cái "distance(another: Point)" ý là hàm distance có 1 tham số có kiểu là Point, tên là another (thực ra thì nó tên gì cũng được, đặt cho dễ hiểu thôi).
    another là một Point, trong Point có hàm distance, nên cũng có thể gọi hàm distance từ another bằng cách dùng dấu ' chấm ' .
    
    Khác nhau Point another và Point another=new Point(); (2 cái như nhau chỉ khác cách làm)
    Point another là thêm tham số với đối tượng là another, còn nếu dùng cái còn lại thì không cần tham số another
    */
    public double distance(Point another) {
	return distance(another.getX(), another.getY());
    }
}
