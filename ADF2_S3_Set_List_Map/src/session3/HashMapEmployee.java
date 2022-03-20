/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asus
 */

public class HashMapEmployee{

    //Tao 1 bien kieu HashMap de luu giu danh sach cac Employee
    HashMap<String, Employee>emplist = new HashMap<>();
    
    //tao method
    //method addEmp()
    void addEmp(){
        //tao 1 doi tuong nhan vien moi
        Employee emp = new Employee();
        emp.input();
        
        
        //kiem tra id co trung lap ko
        for (String k : emplist.keySet()) {//keySet() lay tat ca key trong list hashmap // String k la de so sanh id voi k do id la String
            if (emp.getId().equals(k)) {
                System.out.println("Duplicate ID");
                return;
            }
        }
        //them nhan vien vao danh sach (gan id cua emp lam key)
        emplist.put(emp.id, emp);
    }
    
    //methd display
    void display(){
        if (emplist.isEmpty()) {
            System.out.println("No data");
            return;
        }
        for (Employee e: emplist.values()){//neu su dung HashMap thi khi su dung for each phai them .values() vao emplist thi moi duoc vi HashMap la kieu <key,values>
            System.out.println("*************************");
            System.out.println(e);//phia tao toString() ben Employee truoc
        }
    }
    
    //method search
    void search(String emp_name){
        
         if (emplist.isEmpty()) {
            System.out.println("No data");
            return;
        }
        boolean found = false;
        for (Employee e: emplist.values()){//neu su dung HashMap thi khi su dung for each phai them .values() vao emplist thi moi duoc vi HashMap la kieu <key,values>
            if (e.name.contains(emp_name)) {
                System.out.println(e);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Can't found " + emp_name);
        }
    }
    
    //method delete
    void delete(String e_id){
        if (emplist.isEmpty()) {
            System.out.println("No data");
            return;
        }
        if (emplist.containsKey(e_id)) {//tim key theo e_id (su dung containsKey do e_id la key trong HashMap)
            emplist.remove(e_id);//xoa id
            System.out.println("Deleted");
        }
        else{
            System.out.println("Can't found id " + e_id);
        }
    }
    
    //method sort voi HashMap dung ArrayList
    void sortEmp(){
        //tao doi tuong list cua Employee, sau do lay value tu emplist gan sang cho empBySalary
        List<Employee> empBySalary = new ArrayList<>(emplist.values());
        
        if (emplist.isEmpty()) {
            System.out.println("No data");
            return;
        }
        //Code dung de sort trong HashMap (phai tao getter salary ben Employee truoc)
        Collections.sort(empBySalary, Comparator.comparing(Employee::getSalary));
        
        for (Employee e: empBySalary){//chay for each voi doi tuong e duyet list empBySalary de print sau khi sort
            System.out.println(e);
        }
    }
    
    //menu
    public void menu(){
        Scanner sc = new Scanner(System.in);
        HashMapEmployee HMapemp = new HashMapEmployee();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Create new emp                              *");
            System.out.println("*        2.Search by name                              *");
            System.out.println("*        3.Delete by id                                *");
            System.out.println("*        4.Sort by salary                              *");
            System.out.println("*        5.Show all empoyee                            *");
            System.out.println("*        6.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Create new emp:");
                    HMapemp.addEmp();
                    break;
                case "2":
                    System.out.println("Search by name:");
                    String name = sc.nextLine().trim();
                    HMapemp.search(name);
                    break;
                case "3":
                    System.out.println("Delete by id:");
                    String e_id = sc.nextLine().trim();
                    HMapemp.delete(e_id);
                    break;
                case "4":
                    System.out.println("Sort by salary:");
                    HMapemp.sortEmp();
                    break;
                case "5":
                    System.out.println("Show all empoyee:");
                    HMapemp.display();
                    break;
                case "6":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"6".equals(opt));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        HashMapEmployee testHMap = new HashMapEmployee();
        testHMap.menu();
    }
    
}
