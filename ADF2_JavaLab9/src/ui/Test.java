/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import BT2.Employee;
import BT2.EmployeeDAO;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Test {

    static void menu() throws SQLException{
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        EmployeeDAO empDAO = new EmployeeDAO();
        char opt = '0';
        do {            
            System.out.println("Nhap lua chon");
            System.out.println("1.Them emp vao db");
            System.out.println("2.update luong emp trong db");
            System.out.println("3.Xem tat ca emp trong db");
            System.out.println("4.Tim va in emp trong db theo id");
            System.out.println("5.Xoa emp theo ma so db");
            System.out.println("6.Exit");
            opt = sc.nextLine().charAt(0);
            switch(opt){
                case '1':
                    empDAO.insertDB(e);
                    break;
                case '2':
                    empDAO.updateDB(e);
                    break;
                case '3':
                    empDAO.getList();
                    break;
                case '4':
                    System.out.print("Input eName to display:");
                    String name = sc.nextLine().trim();
                    empDAO.getList(name);
                    break;
                case '5':
                    System.out.print("Input ID to delete:");
                    String id = sc.nextLine().trim();
                    empDAO.deleteDB(id);
                    break;
                case '6':
                    System.out.println("Exit!!!");
                    break;
               default:
                   System.out.println("Wrong input");
                   break;
            }
        } while (opt != '6');
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Test test = new Test();
        test.menu();
    }
    
}
