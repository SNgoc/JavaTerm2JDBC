/*
Create class TelevisionCatalog in package Electronics for managing a collection of Televisions:
- Fields:
[max, count] int, tvList – array of Television.
- Default constructor to initialise the all the fields.
- Methods:
- Public void add() - add a new television into array
- Public void searchByBrand() - search televisions belong a brand name accepted by user.
- Public void displayAll() - display all televisions.
- Public void displayHighValue() – display televisions with the price above 500.
 */
package Electronics;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TelevisionCatalog {
    private final int max = 10;
    private int count = 0;
    Television[] tvList = new Television[max];
    
    public void add(){
        
        if (count == max) {
            System.out.println("Full list");
            return;
        }
        //khoi tao doi tuong tv trong add() thi moi khong bi ghi de data khi add vao array (neu tao ngoai thi se bi ghi de data cu)
        Television tv = new Television();
        //tvList[count].accept(); //khong the su dung cach nay voi array thuong vi se bi loi nullPointer
        tv.accept();
        
        //THUẬT TOÁN void add():thêm 1 nhân viên mới vô danh sách ds.
        //Lưu ý: kiểm tra nếu mã số bị trùng sẽ báo lỗi và từ chối thêm mới. Dùng hàm for each để duyệt từng phần tử trong mảng kiểm tra giá trị
        for (Television television : tvList) {
            if (television == null) {
                break;
            }
            if (television.getId().equals(tv.getId())) {
                System.out.println("Duplicate Id " + tv.getId());
                return;
            }
        }
        tvList[count] = tv;
        count++;
        System.out.println("Add success.");
    }
    
    public void searchByBrand(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input brand name to search:");
        String brandS = sc.nextLine();
        if (count == 0) {
            System.out.println("Chua co du lieu");
            return;
        }
        boolean found = false;
        for (Television television : tvList) {
            if (television == null) {
                break;
            }
            if (television.getBrand().contains(brandS)) {
                System.out.println(television);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Khong tim thay san pham co chua brand la " + brandS);
        }
    }
    
    public void deleteByID(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ID to delete:");
        String IdDel = sc.nextLine();
        if (count == 0) {
            System.out.println("Chua co du lieu");
            return;
        }
        for (int i = 0; i < count; i++)
        {
            if (tvList[i].getId().equals(IdDel)) {
                for (int j = i; j <=count-1; j++) {
                   tvList[j] = tvList[j+1];
                }
                System.out.println("Da xoa san pham co id " + IdDel);
                count--;
                return;
            }
        }
        System.out.println("Khong tim thay san pham co id " + IdDel);
    }
    
    public void displayAll(){
        if (count == 0) {
            System.out.println("Chua co du lieu");
            return;
        }
        for (Television television : tvList) {
            if (television == null) {
                break;
            }
            System.out.println("Thong tin san pham:");
            television.printInfo();
        }
    }
    
    public void displayHighValue(){
        if (count == 0) {
            System.out.println("Chua co du lieu");
            return;
        }
        boolean found = false;
        for (Television television : tvList) {
            if (television == null) {
                break;
            }
            if (television.getPrice() > 500) {
                System.out.println("Thong tin tv co gia tren 500:");
                System.out.println(television);
                found = true;
            }
        }
        if (found == false) {
               System.out.println("Khong co tv nao gia tren 500");
        }
    }
}
