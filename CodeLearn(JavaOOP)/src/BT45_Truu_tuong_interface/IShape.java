
package BT45_Truu_tuong_interface;

/*
Interface chỉ hiểu là chứa các biến và hàng số vì thế khi mà khởi tạo 1 biến or hằng số trong interface thì các class khác có thể kế thừa từ đó giúp mình ko cần phải nghi lại nữa , 
muốn sửa lại cái đã có trong lớp interface trong class mình đang làm và nó đang kế thừa thì chỉ việc Override lại ngay thằng cần sửa thôi.
 */

interface IShape {
    public double getArea();
    public double getPerimeter();
}
