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
public class Session10_Inherit {
    public static void main(String[] args) {
        //tạo 1 đối tượng employee
        Employee emp = new Employee("E01", "Saro", 3000);
        emp.display();
        
        Manager m = new Manager("N03", "Nero", 10000, 2000);
        m.display();
        m.getIncomeTax(); //không bị lỗi do khai báo public và thừa kế từ class employee
        
        double tax = m.getIncomeTax();
        System.out.println("Tax 0f manager is "+ tax);
        
        
        //TEST POLYMORPHISM (tính đa hình)
        Employee o = new Manager("E03", "AAA", 3000, 500);
        o.display();
    }
}
