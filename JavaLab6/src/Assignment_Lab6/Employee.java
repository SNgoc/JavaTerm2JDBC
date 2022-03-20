/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Lab6;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Employee {
    private String id, name, position;
    private int baseSalary;

    public Employee() {
        baseSalary = 100;
    }

    public Employee(String id, String name, String position, int baseSalary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
    
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Id:");
        id = sc.nextLine();
        System.out.print("Name:");
        name = sc.nextLine();
        System.out.print("Position:");
        position = sc.nextLine();
        do {            
            System.out.print("Base salary (100-2000USD):");
            baseSalary = sc.nextInt();
        } while (baseSalary < 100 || baseSalary > 2000);
    }
    
    public void print(){
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Position: " + getPosition());
        System.out.println("Base Salary: " + getBaseSalary());
    }

    //dung cai nay de print array list
    @Override
    public String toString() {
        return "ID: " + getId() + "\nName: " + getName() + "\nPosition: " + getPosition() + "\nBase Salary: " + getBaseSalary();
    }
    
}
