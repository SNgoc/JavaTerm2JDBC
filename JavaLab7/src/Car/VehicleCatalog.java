/*
3 Create class VehicleCatalog in package app for managing a collection of Cars:
- declare fields: [max, next] int / [vehicleList] – an array of cars (next giống counter trong các bài học trước)
- write public methods:
- void addCar() - add a new car into system
- void displayAll() - display all cars
- void searchByBrand (String sBrand) – search & display cars by the brand.
- void displayAllGPSCar() - display all cars having GPS module installed.
- void displayHighRankl() - display all cars having price greater than 50000
 */
package Car;

import java.util.Scanner;


public class VehicleCatalog {
    final int max =10;
    int next = 0;
    //mang chua cac cars
    Car[]vehicleList = new Car[max];
    public void addCar(){
        if (next == max) {
            System.out.println("Full slot");
            return;
        }
        //Tao doi tuong car truoc
        Car c = new Car();
        c.accept();//nhap thong tin xe
        
        //them tung xe vao danh sach
        vehicleList[next] = c;
        next++;
    }
    
    public void displayAll(){
        if (next == 0) {
            System.out.println("Chua co thong tin car");
            return;
        }
        for (int i = 0; i < next; i++) {
            vehicleList[i].printInfo();
        }
    }
    
    public void searchByBrand(String sBrand){
        if (next == 0) {
            System.out.println("Khong co xe nao het");
            return;
        }
        int count = 0;
        for (int i = 0; i < next; i++) {
            if (vehicleList[i].getBrand().contains(sBrand)) {
                vehicleList[i].printInfo();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay xe co brand " + sBrand);
        }
    }
    
    public void displayAllGPS(){
        if (next == 0) {
            System.out.println("Khong co xe nao het");
            return;
        }
        for (int i = 0; i < next; i++) {
            if (vehicleList[i].isGPS()) {
                vehicleList[i].printInfo();
            }
        }
    }
    
     public void displayHighRankCar(){
         Scanner sc = new Scanner(System.in);
        if (next == 0) {
            System.out.println("Khong co xe nao het");
            return;
        }
         System.out.print("Nhap price de sort:");
         int sortPrice = sc.nextInt();
        for (int i = 0; i < next; i++) {
            if (vehicleList[i].getPrice() > sortPrice) {
                vehicleList[i].printInfo();
            }
        }
    }
}
