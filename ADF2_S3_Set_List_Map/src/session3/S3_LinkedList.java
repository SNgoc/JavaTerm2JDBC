/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author asus
 */
public class S3_LinkedList {//khong duoc dat ten class trung voi LinkedList vi se bi loi
    public static void main(String[] args) {
        //tao 1 doi tuong co kieu LinkedList
        LinkedList <String> obj = new LinkedList <String>();//giong ArrayList
        
        //them cac phan tu vao danh sach LinkedList
        obj.add("Nero");//add vao cuoi list
        obj.add("Saro");
        obj.addFirst("NSN");//them vao dau list
        obj.add(obj.size()/2, "AAA"); //them vao list tai vi tri chi dinh
        System.out.println("Danh sach dang co la " + obj);//in theo list mac dinh
        for (String string : obj) {
            System.out.println(string);// in xuong dong
        }
        //xoa pha tu trong danh sach LinkedList
        obj.remove();// xoa phan tu dau tien
        System.out.println("List sau khi dung remove() la " + obj);
        obj.removeLast();//xoa pha tu cuoi cung
        System.out.println("List sau khi dung removeLast() la " + obj);
        
        obj.add("Saro");
        System.out.println("Danh sach dang co la " + obj);//in theo list mac dinh
        
        //xoa 1 phan tu theo object -> return boolean
        obj.remove("AAA");//xoa phan tu duoc chi dinh
        System.out.println("List sau khi dung remove('AAA') la " + obj);
        
        //xoa 1 phan tu theo index -> return String
        obj.remove();
        System.out.println("Danh sach con lai la " + obj);//in theo list mac dinh
        
        //tim kiem phan tu trong danh sach
        boolean status = obj.contains("Saro");//gan cho status la true
        if (status) {//status kieu boolean nen dong nay nghia la true neu co pha tu Saro trong list, tra ve false neu khong co
            System.out.println("Danh sach co phan tu can tim kiem " + obj);
        }
        else{
            System.out.println("Danh sach khong co phan tu can tim kiem " + obj);
        }
        //so luong cac phan tu co trong danh sach
        int size = obj.size();
        System.out.println("So luong cac phan tu trong list la " + size);
        
        //get va set
        obj.get(0); //lay ra phan tu tai index 0
        System.out.println("Phan tu o vi tri obj[0] la " + obj.get(0));
        obj.set(0, "Nero");// thay the 1 phan tu co san trong list bang set (khong dung de add ma chi de change)
        System.out.println("Danh sach sau khi dung set thay doi phan tu [Saro] la " + obj);//in theo list mac dinh
        
        Vector<String> v = new Vector<>();//giong ArrayList, chi khac o capacity() tang 10 phan tu len
    }
}
