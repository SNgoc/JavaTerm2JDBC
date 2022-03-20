/*
 Create class Television derives from Product and implements ITax, in package Electronics.
- Fields: pprice, QoH (quantity on hand) and brand.
- Constructors to initialise the all fields.
- Override methods:
protected void accept() : allow user to input additional details of a television
invoke method accept() of super class.
public String toString() : return a string presenting all the details of a product as follows:
id, name, price, QoH, cost, amount (=cost*QoH, cost: price after TAX)
 */
package Electronics;
import Goods.Product;
import Goods.ITax;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Television extends Product implements ITax{

    private int price, QoH;
    private String brand;

    public Television() {
        super(null, null);
    }

    public Television(String id, String name, int price, int QoH, String brand) {
        super(id, name);
        this.price = price;
        this.QoH = QoH;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public int getQoH() {
        return QoH;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    protected void accept() {
        Scanner sc = new Scanner(System.in);
        super.accept(); //To change body of generated methods, choose Tools | Templates.
        do {            
            System.out.print("Price( >0):");
            price = sc.nextInt();
        } while (price <= 0);
        
        while (true) {            
            System.out.print("QoH( >0):");
            QoH = sc.nextInt();
            sc.nextLine();
            if (QoH > 0) {
                break;
            }
            System.out.println("QoH must greater than zero");
        }
        
        while (true) {           
            System.out.print("Brand( not null):");
            brand = sc.nextLine();
            if (!brand.isEmpty()) {
                break;
            }
            System.out.println("Brand must be not null");
        }
    }

    @Override
    public float getCost() {
        return (price * VAT_TAX_PERCENT)+price;
    }

    @Override
    public void printInfo() {
        System.out.println("Thong tin chi tiet san pham");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("QoH: " + getQoH());
        System.out.println("Brand: " + getBrand());
    }

    @Override
    public String toString() {
        return "Id: " + getId() + ", Name: " + getName() + ", Price: " + getPrice() + ", QoH: " + getQoH() + ", Cost: " + getCost() + ", Amount: " + (getCost()*QoH);
    }
}
