/*
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
 */
package Car;
import Assignment7.Vehicle;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Car extends Vehicle{
    private boolean GPS;

    public Car() {
        super(null, null, null, 0, 0, 0);
        GPS = true;
    }

    
    public Car(String ID, String name, String brand, double speed, double weight, double price, boolean GPS) {
        super(ID, name, brand, speed, weight, price);
        this.GPS = GPS;
    }

    @Override
    protected void accept() {
        Scanner sc = new Scanner(System.in);
        super.accept(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("GPS is installed:");
        GPS = sc.nextBoolean();
    }

    @Override
    public String toString() {//Dung cho arraylist
        return ("ID car: " + getID() + "\nName car: " + getName() + "\nBrand: " + getBrand()
                + "\nSpeed: " + getSpeed() + "\nWeight: " + getWeight() + "\nPrice: " + getPrice()
                + "\nGPS: " + GPS); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void printInfo(){
        System.out.println("Thong tin chi tiet:");
        System.out.println("ID: " + getID());
        System.out.println("Name:" + getName());
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Weight: " + getWeight());
        System.out.println("Price: " + getPrice());
        System.out.println("GPS: " + GPS);
    }

    @Override
    public double getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isGPS() {
        return GPS;
    }
}
