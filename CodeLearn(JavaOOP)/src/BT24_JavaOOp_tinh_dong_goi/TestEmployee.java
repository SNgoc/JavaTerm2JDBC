/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT24_JavaOOp_tinh_dong_goi;

/**
 *
 * @author asus
 */
public class TestEmployee {

    public static void main(String args[]) {
        Employee e = new Employee(1, "Kien", "Hoang", 1000);
        System.out.println("Id: " + e.getId());
        System.out.println("Name: " + e.getFullName());
        System.out.println("Salary: " + e.getSalary());
    }
}
