/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;
import emp.Employee;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Worker implements Employee{
    private String name;
    private double salary; 
    private int workday;
    public Worker() {
    }

    public Worker(String name, double salary, int workday) {
        this.name = name;
        this.salary = salary;
        this.workday = workday;
    }  

    public static double getBasic() {
        return basic;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkday() {
        return workday;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Name (not null):");
            try {
                
                name = sc.nextLine();
                if (name.isEmpty()) {
                    throw new NullPointerException("Loi null");//tu tao loi cho minh
                }
                else{
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        while (true) {
            System.out.print("Workday( >0):");
            try {
                //cach 2 khong can dung sc.nextLine();
                workday = Integer.parseInt(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                if (workday < 0 || workday > 31) {
                    throw new Error("Workday must in range from 0 to 31");//tu tao loi cho minh
                }
                else{
                    break;
                }
            }
            //catch nhieu loi, muon catch loi throw thi catch loi phai giong voi kieu loi throw
            catch (NumberFormatException e) {
                System.out.println("Error: Wrong format input.");
            }
            catch (Error e){
                System.out.println(e.getMessage());
            }
        }
        
        salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return workday*basic/22;
    }

    @Override
    public void display() {
        System.out.println("*******************");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Workday: " + getWorkday());
    }

    @Override
    public String toString() {
        return String.format("Name: %s, salary: %f, workday: %d",getName(),calculateSalary(),getWorkday());
    }
}
