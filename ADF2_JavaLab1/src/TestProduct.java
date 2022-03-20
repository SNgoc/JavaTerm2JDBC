
import java.util.Scanner;
import lab1.ProductList;

/*
1.	Tạo class exception TestProduct bao gồm các hàm dựng thông báo lỗi sai.

2.	Tạo class Product bao gồm :
a.	Các fields dữ liệu:
i.	String id, name, mfg
ii.	int unitPrice, qoh

b.	Các contructors để khởi tạo giá trị ban đầu cho các field dữ liệu.

c.	Method void input() : nhập và kiểm tra thông tin chi tiết cho sản phẩm : - id : Fxxxx (food) hoặc Bxxxx (beverage), với x là ký số.

- name : ít nhất 2 ký tự. - unitPrice, qoh > 0

- mfg: US hoặc VN hoặc TL

d.	Method  String standardlizeMFG() : trả về chuỗi mô tả đầy đủ tên quốc gia sản xuất của field
mfg: US => United State, VN => Vietnam, TL => Thailand

f. Override method toString() để biểu diễn nội dung của 1 đối tượng sp dưới dạng chuỗi, với nội dung của field mfg được thay thế bằng hàm standardlizeMFG().


3.	Tạo class ProductList bao gồm : a. Các f ields dữ liệu:

ArrayList<Product> prList để lưu danh sách sản phẩm.

c. Method :
1.	void addProduct() : thêm 1 sản phẩm vô danh sách prList.
2.	void displayAll() : In toàn bộ danh sách sản phẩm ra màn hình.
3.	void searchByName(String name) : Tìm và in ra ds các sp có tên chứa trong đối số name


4.	Tạo java main class TestProduct có menu để test chương trình

 */


public class TestProduct {

    public void menu(){
        Scanner sc = new Scanner(System.in);
        ProductList pl = new ProductList();
        String opt;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Create new product                          *");
            System.out.println("*        2.Search by name                              *");
            System.out.println("*        3.Show all product                            *");
            System.out.println("*        4.Exit                                        *");
            System.out.println("********************************************************");
            System.out.print("Input command:");
            opt = sc.nextLine();
            switch(opt){
                case "1":
                    System.out.println("Create new product:");
                    pl.addProduct();
                    break;
                case "2":
                    System.out.println("Search by name:");
                    String name = sc.nextLine().trim();
                    pl.searchByName(name);
                    break;
                case "3":
                    System.out.println("Show all product:");
                    pl.displayAll();
                    break;
                case "4":
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!!!");
            }
        } while(!"4".equals(opt));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TestProduct test = new TestProduct();
        test.menu();
    }
    
}
