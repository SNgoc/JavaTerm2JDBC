/*
Tạo Java Main Class CDTest, để thực hiện chức năng quản lý hệ thống kho dữ liệu CD, có nội
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

 */
package JavaLab5;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class CDtest {

    CD cd0 = new CD();
    int max;
    int counter;
    CD[] cdlist;

    public CDtest() {
        max = 10;
        counter = 0;
        cdlist = new CD[max];
    }
    
    //Method
    void add(){
        if (counter == max) {
            System.out.println("He thong full, khong them duoc nua.");
            return;
        }
        //tao 1 doi tuong CD
        CD cd1 = new CD();
        cd1.input();
        cdlist[counter] = cd1;
        counter++;
    }
    
    void search(String cid){
        Scanner sc = new Scanner(System.in);
        if (counter == 0 && cd0.getId().equals(cid)) {
            System.out.println("Tim thay san co id " + cd0.getId());
            System.out.println("He thong chua co du lieu moi");
            return;
        }
        boolean isFound = false;
        for (int i = 0; i < counter; i++) {
            if (cdlist[i].getId().equals(cid)) {
                System.out.println("Tim thay san co id " + cdlist[i].getId());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Khong tim thay CD co id " + cid);
        }
    }
    
    void displayAll(){
        if (counter == 0) {
            cd0.print();
            System.out.println("He thong chua co du lieu moi");
            return;
        }
        
        for (int i = 0; i < counter; i++) {
            cdlist[i].print();
        }
    }
    
    public void menu(){
        Scanner sc = new Scanner(System.in);
        CDtest cdT = new CDtest();
        String n;
        do {
            System.out.println("********************************************************");
            System.out.println("*        1.Them CD                                     *");
            System.out.println("*        2.Tim kiem CD                                 *");
            System.out.println("*        3.In CD                                       *");
            System.out.println("*        4.Thoát                                       *");
            System.out.println("********************************************************");
            System.out.print("Nhap lenh:");
            n = sc.nextLine();
            switch(n){
                case "1":
                    System.out.println("Them CD :");
                    cdT.add();
                    break;
                case "2":
                    System.out.println("Tim kiem CD :");
                    System.out.println("Nhap ma so can tim");
                    String cid = sc.nextLine();
                    cdT.search(cid);
                    break;
                case "3":
                    System.out.println("In CD:");
                    cdT.displayAll();
                    break;
                case "4":
                    System.out.println("Quit!!!");
                    break;
                default:
                    System.out.println("Sai lệnh, mời nhập lại!!!");
            }
        } while(!"4".equals(n));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        CDtest test = new CDtest();
        test.menu();
    }
    
}
