/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session10_Inherit;

/**
 *
 * @author asus
 */
public class Manager extends Employee{
    //field
    public double allowance;//phụ cấp
    
    public Manager(String id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override //anotation(ghi chú đây là hàm override)
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Phụ cấp: " + allowance);
    }

    @Override
    public double getIncomeTax() {
        return (salary + allowance)*10/100; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
