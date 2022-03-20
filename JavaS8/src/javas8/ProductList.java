/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas8;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ProductList {
    //tạo 1 danh sách các sản phẩm
    final int max = 10; //const(hằng số)
    int count = 0; //số lượng product thực tế chứa trong ds list
    Product[] list = new Product[max]; //tạo 1 ds các product có max list là 10
    
    Product p = new Product(); //tạo 1 đối tượng Product
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
        if (count == max) {
            System.out.println("Đã thêm đủ product");
            return;
        }
        Product p = new Product();
        p.input(); //nhập product
        
        list[count] = p;
        count++;
    }
    
    //method xem product
    public void display()
    {
        if (count == 0) {
            System.out.println("Không có product nào");
            return;
        }
        //for-each chạy tới cuối hiển thi null những list chưa input
//        for (Product p : list) {
//            System.out.println(p);
//            //p.output
//        }
        
        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }
    
    //method xóa product
    public void delete(String p_id)
    {
        if (count == 0) {
            System.out.println("Không có product nào để xóa");
            return;
        }
        
        for (int i = 0; i < count; i++) 
        {
            if (list[i].id.equals(p_id)) {
                for (int j =i; j <=count-1; j++) {
                    list[j] = list[j+1];
                }
                System.out.println("Xóa thành công!!!");
                count--;
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm phù hợp mã số để xóa");
    }
    
    //method xem product
    public void search(String p_name)
    {
        if (count == 0) {
            System.out.println("Không có product nào");
            return;
        }
        //for-each chạy tới cuối hiển thi null những list chưa input
//        for (Product p : list) {
//            System.out.println(p);
//            //p.output
//        }
        int cntProduct = 0; //Tạo biến đếm để tìm sản phẩm
        for (int i = 0; i < count; i++) 
        {
            if (list[i].name.contains(p_name)) {//contains là tìm gần đúng tên sản phẩm (tìm với 1 ký tự giống nhau)
                System.out.println(list[i]);
                cntProduct++;
            }
        }
        if (cntProduct == 0) {
            System.out.println("Không tìm thấy sản phẩm phù hợp mã số");
        }
    }
}
