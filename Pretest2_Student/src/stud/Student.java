/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Student {
    private int Id;
    private String name, batch;
    private float MatMark, PhysicMark, ChemicMark;

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public float getMatMark() {
        return MatMark;
    }

    public float getPhysicMark() {
        return PhysicMark;
    }

    public float getChemicMark() {
        return ChemicMark;
    }

    public Student() {
//        Id = 1001;
//        name = "AAA";
//        batch = "math";
//        MatMark = 7.5f;
//        PhysicMark = 6.5f;
//        ChemicMark = 6.6f;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("ID:");
            try {
                //cach 2 khong can dung sc.nextLine();
                Id = Integer.parseInt(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                if (Id < 100 ) {
                    throw new Error("Id must greater than 100 or equal");//tu tao loi cho minh
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
        
        while (true){
            System.out.print("Name (not null):");
            try {
                name = sc.nextLine();
                if (name.isEmpty()) {
                    throw new NullPointerException("null");//tu tao loi cho minh
                }
                else{
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        while (true){
            System.out.print("Batch (not null):");
            try {
                
                batch = sc.nextLine();
                if (batch.isEmpty()) {
                    throw new NullPointerException("null");//tu tao loi cho minh
                }
                else{
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        while (true) {
            System.out.print("Math:");
            try {
                //cach 2 khong can dung sc.nextLine();
                MatMark = Float.parseFloat(sc.nextLine());//chuyen doi tu string sang float sau khi nhap
                if (MatMark < 0 || MatMark > 100 ) {
                    throw new Error("Math must in range from 0.0 to 100.0");//tu tao loi cho minh
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
        
        while (true) {
            System.out.print("Physic:");
            try {
                //cach 2 khong can dung sc.nextLine();
                PhysicMark = Float.parseFloat(sc.nextLine());//chuyen doi tu string sang float sau khi nhap
                if (PhysicMark < 0 || PhysicMark > 100 ) {
                    throw new Error("Physic must in range from 0.0 to 100.0");//tu tao loi cho minh
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
        
        while (true) {
            System.out.print("Chemic:");
            try {
                //cach 2 khong can dung sc.nextLine();
                ChemicMark = Float.parseFloat(sc.nextLine());//chuyen doi tu string sang float sau khi nhap
                if (ChemicMark < 0 || ChemicMark > 100 ) {
                    throw new Error("Chemic must in range from 0.0 to 100.0");//tu tao loi cho minh
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
    }
    
    //Create average() to calculate the average marks of student
    public float average(){
        return (getMatMark() + getPhysicMark() + getChemicMark())/3;
    }
    
    //Create print() method to print out the details of student. 
    //(Id, Name, mathMark,physicMark, chemyMark and average mark.)
    public void print(){
        System.out.println("****************");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Batch: " + getBatch());
        System.out.println("Math: " + getMatMark());
        System.out.println("Physic: " + getPhysicMark());
        System.out.println("Chemic: " + getChemicMark());
        System.out.println("Average mark: " + average());
    }

    @Override
    public String toString() {
        return String.format("Id:%d, name:%s, batch:%s, math:%f, physic:%f, chemic:%f, average mark:%f",
                getId(),getName(),getBatch(),getMatMark(),getPhysicMark(),getChemicMark(),average());
    }
}
