
import java.util.Scanner;

/*
Bài tập
Sử dụng phương pháp lập trình hướng đối tượng để giải quyết bài tập sau:

Bạn hãy viết chương trình nhập từ bàn phím chiều dài và chiều rộng của một hình chữ nhật và hiển thị ra màn hình:

Area = {P1}
Perimeter = {P2}
Với {P1} và {P2} lần lượt là diện tích và chu vi của hình chữ nhật đó.

Ví dụ nếu bạn nhập:

4.5
5.5
Thì màn hình sẽ hiển thị ra:

Area: 24.75
Perimeter: 20.0

Hướng dẫn
Như bài trước bạn đã biết, phương pháp lập trình hướng đối tượng là phương pháp giải quyết các bài toán lập trình thông qua các đối tượng, 
do đó bài này bạn cần tạo ra một đối tượng thuộc lớp Rectangle (hình chữ nhật) giống như sau:



Trong đó:

length và width là hai thuộc tính chỉ chiều dài và chiều rộng của hình chữ nhật.
getInformation() là phương thức nhập dữ liệu cho thuộc tính length và width từ bàn phím.
display() là phương thức dùng để hiển thị thông tin về chu vi và diện tích của hình chữ nhật ra màn hình.
getArea() và getPerimeter() là hai phương thức trả về diện tích và chu vi của hình chữ nhật, hai phương thức này được dùng trong phương thức display().
 */

class Rectangle {
    double length, width;
    
    //Method
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập length:");
        length = sc.nextDouble();
        System.out.print("Nhập width:");
        width = sc.nextDouble();
    }
    
    public double getArea(){
        return length*width;
    }
    public double getPerimeter() {//chu vi
        return (length+width)*2;
    }
    
    //display
    public void display(){
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}


public class BT3_tinh_dien_tich_chu_vi_HCN {
    public static void main(String args[]) {
        //khai báo đối tượng
        Rectangle r1 = new Rectangle();
        //chạy OOP
        r1.getInformation();
        r1.display();
    }
}
