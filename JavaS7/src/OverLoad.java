/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class OverLoad {

   public static void add(int x, int y)
   {
       int sum;
       sum = x+y;
       System.out.println("Sum of add(int x, int y) is " + sum);
   }
   
   public static void add(double x, double y)
   {
       double sum;
       sum = x+y;
       System.out.println("Sum of add(float x, float y) is " + sum);
   }
   
   public static void add(int x, int y, int z)
   {
       int sum;
       sum = x+y;
       System.out.println("Sum of add(int x, int y, int z) is " + sum);
   }
   
   public static void add(double x, double y, double z)
   {
       double sum;
       sum = x+y;
       System.out.println("Sum of add(double x, double y, double z) is " + sum);
   }
   
    public static void main(String[] args) {
        //tạo 1 đối tượng của class OverLoad
//        OverLoad ov = new OverLoad();
//        ov.add(1, 2);
//        ov.add(1.1, 2.2);
//        ov.add(1, 2, 3);
//        ov.add(1.1, 1.2, 1.3);
        
        //Khi các method có static thì không cần tạo đối tượng
        add(1, 2);
        add(1.1, 2.2);
        add(1, 2, 3);
        add(1.1, 1.2, 1.3);
    }
}
