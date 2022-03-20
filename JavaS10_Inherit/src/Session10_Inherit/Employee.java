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
public class Employee {
    //field
    public String id, name;
    public double salary;
    
    //constructor
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public double getIncomeTax(){
        return (salary*10)/100;
    }
    
    private double getTax(){
        return getIncomeTax();
    }
    
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + getTax());
    }
}
