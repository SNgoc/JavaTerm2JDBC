/*
Create class Laptop derives from Computer, in package Goods, consists of:
- Field webcam (y/n), QoH (số lượng tồn kho)
- Constructors to initialize the all fields.
- Override methods:
- accept() : allow user to input details for a laptop:
Recall method accept() of super class.
- printInfo() : display details of an laptop.
- toString() : return a string presenting all the details of a product as follows:
id, name, webcam, price, QoH, amount (= price*QoH)
 */
package Goods;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Laptop extends Computer{
    private String webcam;//(y/n) neu y la true, n la false
    private int QoH; //so luong ton kho

    public Laptop() {
        webcam = "No";
        QoH = 0;
    }

    public Laptop(String webcam, int QoH) {
        this.webcam = webcam;
        this.QoH = QoH;
    }

    public String isWebcam() {
        return webcam;
    }

    public int getQoH() {
        return QoH;
    }

    @Override
    void accept() {
        Scanner sc = new Scanner(System.in);
        super.accept(); //To change body of generated methods, choose Tools | Templates.
        
        while (true) {            
            System.out.print("Webcam(y/n):");
            webcam = sc.nextLine();
            if (webcam.equals("y")) {
                webcam = "Yes";
                break;
            }
            if (webcam.equals("n")) {
                webcam = "No";
                break;
            }
            else{
                System.out.println("Wrong format.");
            }
        }
        do {            
            System.out.print("QoH(>=0):");
            QoH = sc.nextInt();
        } while (QoH < 0);
    }

    @Override
    void printInfo() {
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Webcam: " + isWebcam());
        System.out.println("QoH(hang ton): " + getQoH());
    }

    @Override
    public String toString() {
        return "ID: " + getID() + "\nName: " + getName() + "\nWebcam: " + isWebcam() + "\nPrice: " + getPrice() + "\nQoH: " + getQoH()
                + "\nAmount: " + (getPrice()*getQoH());
    }
   
}
