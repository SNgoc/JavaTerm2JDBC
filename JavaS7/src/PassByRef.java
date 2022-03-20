/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
class Circle
{
    int r; //radius
}

public class PassByRef {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // tạo 1 đối tượng của class Circle
        Circle c = new Circle(); //khi không tạo 1 contructor ko có tham số thì nó mặc định sẽ tự có. Nó sẽ gọi tới phương thức constructor ko có tham số
        int rad = 3;
        
        //Tạo 1 đối tượng của class PassByRef để có thể sử dụng method calArea
        PassByRef obj = new PassByRef();
        c.r = 4;
        obj.calArea(c, rad); //c: thông số thật sự(argument); rad: thông số thật sự (argument)
        System.out.println("Method main: R of c is " + c.r);
        System.out.println("Method main: rad is " + rad);
    }
    
    /*
    **Phương thức (method) calArea của class PassByRef
    * name: calArea
    * parameter::
        *@cir: Circle
        * @radius: int
    * return void
    */
    public void calArea(Circle cir, int radius)
    {
        double s = 3.14*radius*radius;
        System.out.println("Area of Circle is " + s);
        cir.r = 5;
        radius = 6;
        System.out.println("In method calArea: bán kính là " + cir.r);
        System.out.println("In method calArea: Radius là " + radius);
    }
    
}
