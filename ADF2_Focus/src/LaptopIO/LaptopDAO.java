/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaptopIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author asus
 */
public class LaptopDAO {
    TreeMap<String, Laptop>laptopList = new TreeMap<String, Laptop>();
    File fname = new File("Laptops.txt");
    
    void addLap(){
        Laptop lap = new Laptop();
        lap.input();
//        for (String code : laptopList.keySet()) {
//            if (lap.getCode().equals(code)) {
//                System.out.println("Duplicate code");
//                return;
//            }
//        }
        laptopList.put(lap.getCode(), lap);
        System.out.println("Added");
    }
    
    //Display()
    void Display(){
        if (laptopList.isEmpty()) {
            System.out.println("No data, please add data first");
            return;
        }
        for (Laptop lap : laptopList.values()) {
            lap.display();
        }
    }
    
    void standardize(){
        Scanner sc = new Scanner(System.in);
        if (laptopList.isEmpty()) {
            System.out.println("No data, please add data first");
            return;
        }
        System.out.print("Input code laptop to standardize:");
        String codeL = sc.nextLine().trim();
        
        boolean found = false;
        for (Laptop lap : laptopList.values()) {
            if (lap.getCode().equals(codeL)) {
                if (lap.getDesciptions().toUpperCase().equals("IBM")) {
                    lap.setDesciptions("Levono");
                    found = true;
                    System.out.println("Replaced IBM to Levono");
                } 
                if (lap.getDesciptions().toLowerCase().equals("compaq")) {
                    lap.setDesciptions("HP compaq");
                    found = true;
                    System.out.println("Replaced Compaq to HP compaq");
                }
            }
        }
        if (found == false) {
            System.out.println("Can't find a match to standardize with code " + codeL);
        }
    }
    
    
    //write
    void write() throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter(fname));
        for (Laptop lap : laptopList.values()) {
            pw.println(lap.toString());
            pw.flush();
        }
        //close
        pw.close();
        System.out.println("File was written");
    }
    
    //read
    void readFile() throws FileNotFoundException, IOException{
        if (fname.exists() == false) {
            System.out.println("File chua ton tai");
            return;
        }
        //check file có dữ liệu hay chưa
        //QUAN TRỌNG: Fix lỗi KHI SỬ DỤNG ObjectInputStream để read file thì không bị lỗi khi file chưa có data
        if (fname.length() == 0) {
            System.out.println("File is empty, please add data first");
            return;
        }
        laptopList.clear();//xóa dữ liệu cũ trước khi đọc dữ liệu mới từ file lên
        BufferedReader fin = new BufferedReader(new FileReader(fname));

        try {
            while (fin.ready()) {
                //String buf = in.readLine().replaceAll("\\w+[:]", ""); //dùng replaceAll khi string kiểu: Id:%s
                //hàm tách chuỗi thành mảng để add vào list,thay thế cho split trong array và không cần đếm điề kiện phần tử arr.length = 4 để add chuỗi
                String buf = fin.readLine();
                StringTokenizer tok = new StringTokenizer(buf, " - ");//phải cắt đúng, chú ý cả khoảng trắng
                Laptop lap = new Laptop();//tạo đối tượng lap
                lap.setCode(tok.nextToken());
                lap.setSupplier(tok.nextToken());
                lap.setDesciptions(tok.nextToken());
                //add to treemap
                laptopList.put(lap.getCode(), lap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            fin.close();
        }
    }
    
    //menu
    public void menu() throws IOException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        readFile();
        int opt;
        do {
            System.out.println("****************************************************************");
            System.out.println("*        1.Add new Laptop                                      *");
            System.out.println("*        2.Standardize the descriptions by the code of Laptop. *");
            System.out.println("*        3.Display all Laptops                                 *");
            System.out.println("*        4.Write to file                                       *");
            System.out.println("*        5.Exit                                                *");
            System.out.println("****************************************************************");
            System.out.print("Input command:");
            opt = Integer.parseInt(sc.nextLine().trim());
            switch(opt){
                case 1:
                    addLap();
                    break;
                case 2:
                    standardize();
                    break;
                case 3:
                    Display();
                    break;
                case 4:
                    write();
                    break;
                case 5:
                    System.out.println("Exit!!!");
                    Runtime.getRuntime().exec(new String[] { "C:\\windows\\notepad.exe", "N:\\Progarms\\Java\\ADF2_Focus\\Laptops.txt" });
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(opt != 5);
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LaptopDAO test = new LaptopDAO();
        test.menu();
    }
}
