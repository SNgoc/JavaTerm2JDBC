/*
 Assignment
Write a Java application - Vehicle System - to manage the list of vehicles with the specification as follows:
1 Creates a class named Vehicle in package data.
- Declare protected fields: ID, name, brand, speed, weight, price
- Declare public Constructors: to initialize the above fields.
- Write method:
- protected void accept() : allow user input data into data fields.
Data must be validate so that: [ID, name, brand] is not null / [speed, price] must be greater
than zero.

2 Create class Car is derived from Vehicle, in package app, consists of:
- private field GPS (true/false)
- public constructors to initialize the all fields.
- override methods:
- protected void accept() : allow user to input additional details for a car: invoke method
accept() of super class.
- public String toString() : return a string that presents all details of a car
- write public methods:
- void printInfo() : print details of a car.
- boolean isGPS() : return value of field GPS
- boolean getPrice(): return value of field price

3 Create class VehicleCatalog in package app for managing a collection of Cars:
- declare fields: [max, next] int / [vehicleList] – an array of cars
- write public methods:
- void addCar() - add a new car into system
- void displayAll() - display all cars
- void searchByBrand (String sBrand) – search & display cars by the brand.
- void displayAllGPSCar() - display all cars having GPS module installed.
- void displayHighRankl() - display all cars having price greater than 50000

4 Create main class Test in package ui that allows user to manage cars accepted into system through the
menu system as follows:
1. Add a new car
2. Display all cars
3. Search car by brand name
4. Display all cars having GPS module
5. Display high-rank car
6. Exit
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Vehicle {
    protected String ID, name, brand;
    protected double speed, weight, price;

    public Vehicle(String ID, String name, String brand, double speed, double weight, double price) {
        this.ID = ID;
        this.name = name;
        this.brand = brand;
        this.speed = speed;
        this.weight = weight;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
    
    protected void accept(){
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.print("ID(not null):");
            ID = sc.nextLine().trim();// trim() la cat bo khoang trong space giua cach ky tu khi nhap vao
        } while (ID.isEmpty());
        
        do {            
            System.out.print("Name(not null):");
            name = sc.nextLine().trim();
        } while (name.isEmpty());
        
        do {
            System.out.print("Brand(not null):");
            brand = sc.nextLine().trim();
        } while (brand.isEmpty());
        
        do {            
            System.out.print("Speed(>0):");
            speed = sc.nextDouble();
            System.out.print("Weight(>0):");
            weight = sc.nextDouble();
            System.out.print("Price(>0):");
            price = sc.nextDouble();
        } while (speed<0 || weight<0 || price<0);
    }
}
