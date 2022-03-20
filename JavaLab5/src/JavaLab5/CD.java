/*
Assignment
Viết chương trình Java quản lý kho dĩa CD, bao gồm các chức năng : thêm mới, tìm kiếm và in toàn bộ
danh sách CD trong kho.
Hướng dẫn :
a. Tạo project ass4
b. Tạo Java Class CD, mô tả cấu trúc 1 dĩa CD như sau:
i. Dữ liệu (fields – variable): id, title, type, price, year
ii. Hàm dựng (constructors):
➔ Không tham số CD(), gọi hàm input()
➔ Có tham số CD(String, String, String, int, int)
iii. Phương thức:
➔ void input() : cho phép nhập dữ liệu vô các fields của 1 đối tượng CD.
Lưu ý: type chỉ nhận giá trị Audio, hoặc Video
➔ void print() : cho phép xuất thông tin chi tiết của 1 CD
c. Tạo Java Main Class CDTest, để thực hiện chức năng quản lý hệ thống kho dữ liệu CD, có nội
dung như sau:
i. Dữ liệu (fields – variable):
- cdList (mảng chứa CD),
- counter (biến đếm số lượng dĩa CD hiện đang lưu trữtrong danh sách cdList),
- max (hằng, kích thước tối đa của mảng cdList).
ii. Hàm dựng không tham số:
khởi tạo mảng cdList (có kích thước theo hằng max), và reset biến counter về 0
iii. Phương thức (Methods):
1. void add(): thêm 1 CD mới vô cdList, nếu mảng không còn chổ trống in ra thông báo
lỗi.
2. void search(String cid): tìm kiếm CD trong danh sách theo mã số (cid) và in chi tiết cúa
CD đó ra nếu tìm thấy, ngược lại thông báo lỗi.
3. void displayAll (): In ra bảng danh sáchcác CD đang lưu trữ trong kho. Lưu ý sẽ in
thông báo lỗi nếu kho chưa có dữ liệu
4. void menu (): xây dựng hệ thống thực đơn cho phép thêm, tìm kiếm và in danh sách
các CD có trong kho.
5. static void main (): tạo 1 đối tượng kiểu CDTest, gọi phương thức menu() trên đối
tượng này để thi hành chương trình.
d. Biên dịch và thi hành chương trình.
 */
package JavaLab5;

import java.util.Scanner;


public class CD {
    private String id, title, type;
    private int price, year;

    public CD() {
        id = "C00";
        title = "AAA";
        type = "Audio";
        price = 1300;
        year = 2021;
    }

    public CD(String id, String title, String type, int price, int year) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.price = price;
        this.year = year;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
    
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.print("ID:");
        id = sc.nextLine();
        System.out.print("Title:");
        title = sc.nextLine();
        do {            
           System.out.print("Type (Video or Audio):");
           type = sc.nextLine();
        } while (!"Video".equals(type) && !"Audio".equals(type));
        System.out.print("Price:");
        price = sc.nextInt();
        System.out.print("Year:");
        year = sc.nextInt();
    }
    
    public void print(){
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
           System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Year: " + getYear());
    }
}
