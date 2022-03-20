/*
Create class LaptopCatalog in package Goods for managing a collection of Computers
- Fields:
max, cnt, cList – array of laptops
No-arg constructor to initialize the all the fields.
- Methods:
- addLaptop() - add a new laptop into array
- search (String laptopName) - search laptops by the name accepted by user.
- displayAll() - display all computers.
- remove(String laptopID): remove laptop by id
 */
package Goods;

public class LaptopCatalog {
    private final int max = 10;
    private int cnt = 0;
    Laptop[] cList = new Laptop[max];
    public void addLaptop(){
        if (cnt == max) {
            System.out.println("Full slot");
            return;
        }
        //Tao doi tuong Laptop truoc
        Laptop lap = new Laptop();
        
        //nhap thong tin laptop
        lap.accept();
        //them tung laptop vao danh sach
        cList[cnt] = lap;
        cnt++;
    }
    
    public void search(String laptopName){
        if (cnt == 0) {
            System.out.println("Chua co du lieu");
            return;
        }
        boolean found = false;
        for (int i = 0; i < cnt; i++) {
            if (cList[i].getName().contains(laptopName)) {
                System.out.println("San pham bao gom " + laptopName);
                System.out.println(cList[i]);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Khong tim thay san pham bao gom " + laptopName);
        }
    }
    
    public void displayAll(){
        if (cnt == 0) {
            System.out.println("Chua co du lieu");
            return;
        }
        for (Laptop laptop : cList) {
            if (laptop == null) {//them doan nay vi for each se duyet het cac phan tu trong array ke ca phan tu rong
                return;
            }
            System.out.println(laptop);
        }
    }
    
    public void remove(String laptopID){
        if (cnt == 0) {
            System.out.println("Chua co du lieu");
            return;
        }
        for (int i = 0; i < cnt; i++) {
            if (cList[i].getID().equals(laptopID)) {
                for (int j = i; j <= cnt - 1; j++) {
                    cList[j] = cList[j+1];
                }
                System.out.println("Da xoa san pham co ID " + laptopID);
                cnt--;
                return;
            }
        }
        System.out.println("Khong tim thay san pham co ID " + laptopID);
    }
}
