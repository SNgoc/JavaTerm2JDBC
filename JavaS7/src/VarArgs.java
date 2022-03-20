/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class VarArgs {

    public void sum(int...num)
    {
        int sum = 0;
        for (int x: num)
        {
            sum += x;
        }
        System.out.println("Sum is " + sum);
    }
    
    public int multiply(int...num)
    {
        int mul = 1;
        for (int x: num)
        {
            mul *= x;
        }
        return mul;
    }
    
    public static void main(String[] args) {
        //tạo 1 đối tượng của class VarArgs
        VarArgs obj = new VarArgs();
        obj.sum(2,3); //truyền 2 tham số
        obj.sum(3,5,7,9); //truyền 4 tham số
        int multi = obj.multiply(1,2,3,4);
        System.out.println("Multiply is "+ multi);
    }
}
