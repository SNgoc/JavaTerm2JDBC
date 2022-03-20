/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas8;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class ProductArrayList {
    //tạo 1 danh sách các sản phẩm
    ArrayList<Product> list = new ArrayList<Product>(); //tạo 1 ds các product có max list là 10 // thêm <Product> để không phải báo kiểu
    
    public static void main(String[] args) {
        int op = 0;
        String id, name;
        //tạo đối tượng productList để gọi các phương thức của nó như: insert, display,...
        ProductList plist = new ProductList();
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Menu:");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Xem sản phẩm");
            System.out.println("3.Xóa sản phẩm");
            System.out.println("4.Tìm kiếm sản phẩm");
            System.out.println("5.Thoát");
            System.out.println("Nhập lựa chọn:");
            op = sc.nextInt();
            sc.nextLine(); //giống fflush trong C (sau khi nhập số phải thêm dòng này để nhập chữ ko lỗi)
            switch(op)
            {
                case 1:
                    plist.insert(); //thêm product
                    break;
                case 2:
                    plist.display(); //hiển thị product
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa: ");
                    id = sc.nextLine();
                    plist.delete(id);
                    break;
                case 4:
                    System.out.println("Nhập name cần tìm: ");
                    name = sc.nextLine();
                    plist.search(name);
                    break;
                case 5:
                    break;
            }
        } while (op!=5);
    }
    
    //method thêm sản phẩm
    public void insert()
    {
        Product p = new Product();
        p.input();
        
        list.add(p);
    }
    
    //method xem product
    public void display()
    {
        if (list.size() == 0) {
            System.out.println("Không có product nào trong danh sách");
        }
        //for-each chạy tới cuối hiển thi null những list chưa input
//        for (Product p : list) {
//            System.out.println(p);
//            //p.output
//        }
        
        //nếu có thì duyệt
        for (Object p: list) {
            System.out.println(p);
        }
    }
    
    //method xóa product
    public void delete(String p_id)
    {
        for (int i = 0; i < list.size(); i++) {
//            if (((Product) (list.get(i))).id.equals(p_id)){ //làm dòng này nếu không them <Product> vào ArrayList
//                    list.remove(i);
//                    System.out.println("Đã xóa thành công");
//                    return;
//                }
//            }
                if (list.get(i).id.equals(p_id)){ //Thêm <Product> vào ArrayList ở trong để không làm dòng này
                    list.remove(i);
                    System.out.println("Đã xóa thành công");
                    return;
                }
            }

        System.out.println("Không tìm thấy sản phẩm cần xóa");
        }
    
    //method xem product
    public void search(String p_name)
    {
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.contains(p_name)) {
                System.out.println(list.get(i));
                cnt++;
            }
        }
        if(cnt == 0){
            System.out.println("Không tìm thấy product" + p_name);
        }
    }
}
