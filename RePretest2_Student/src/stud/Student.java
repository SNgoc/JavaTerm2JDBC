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
    private float Matmark, PhysicMark, ChemicMark;

    public Student() {
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public float getMatmark() {
        return Matmark;
    }

    public float getPhysicMark() {
        return PhysicMark;
    }

    public float getChemicMark() {
        return ChemicMark;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Id:");
            try {
                //cach 2 khong can dung sc.nextLine();
                Id = Integer.parseInt(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                if (Id < 100) {
                    throw new Error("Id must greater or equal than 100");//tu tao loi cho minh
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
            System.out.print("Name:");
            try {
                name = sc.nextLine();
                if (name.isEmpty()) {
                    throw new NullPointerException("name cannot null");//tu tao loi cho minh
                }
                else{
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        while (true){
            System.out.print("Batch:");
            try {
                batch = sc.nextLine();
                if (batch.isEmpty()) {
                    throw new NullPointerException("batch cannot null");//tu tao loi cho minh
                }
                else{
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        
        while (true) {
            System.out.print("Math Mark:");
            try {
                //cach 2 khong can dung sc.nextLine();
                Matmark = Float.parseFloat(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                if (Matmark < 0 || Matmark > 100) {
                    throw new Error("Math Mark must in range from 0.0 to 100.0");//tu tao loi cho minh
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
            System.out.print("Physic Mark:");
            try {
                //cach 2 khong can dung sc.nextLine();
                PhysicMark = Float.parseFloat(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                if (PhysicMark < 0 || PhysicMark > 100) {
                    throw new Error("Physic Mark must in range from 0.0 to 100.0");//tu tao loi cho minh
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
            System.out.print("Chemic Mark:");
            try {
                //cach 2 khong can dung sc.nextLine();
                ChemicMark = Float.parseFloat(sc.nextLine());//chuyen doi tu string sang int sau khi nhap
                if (ChemicMark < 0 || ChemicMark > 100) {
                    throw new Error("Chemic Mark must in range from 0.0 to 100.0");//tu tao loi cho minh
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
    
    public float average(){
        return (Matmark+PhysicMark+ChemicMark)/3;
    }
    
    public void print(){
        System.out.println("**********************");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Math mark: " + getMatmark());
        System.out.println("Physic mark: " + getPhysicMark());
        System.out.println("Chemic mark: " + getChemicMark());
        System.out.println("Average mark: " + average());
    }

    @Override
    public String toString() {
        return String.format("Id:%d, name:%s, batch:%s, math:%f, physic:%f, chemic:%f, average mark:%f",getId(),getName(),getBatch(),getMatmark(),getPhysicMark(),getChemicMark(),average());
    }

}
