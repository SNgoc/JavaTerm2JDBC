/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author asus
 */
public class JavaS8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cách 1: khởi tạo array và gán giá trị cho biến
        int[] arr1 = {1,2,3};
        
        //duyệt và in ra các phần tử trong array
        System.out.println("arr1:");
        for (int x : arr1) {
            System.out.println(x + " ");
        }
        
        //cách 2: khởi tạo array thông qua toán tử new 3 phần tử
        int [] arr2 = new int[3];
        //gán giá trị cho arr2 chỉ bao gồm 2 phần tử
        arr2[0] = 4;
        arr2[1] = 5;
        System.out.println("arr2: for-each");
        for (int x : arr2)
        {
            System.out.println(x + " ");
        }
        
        System.out.println("arr2: for");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(i + 1 + ":" + arr2[i]);
            
        }
        
        //khởi tạo array 2 chiều (1 chiều 1 vòng for, 2 chiều 2 vòng for)
        int[][] multiple_arr = new int[2][3];
        multiple_arr[0][0] = 1;
        multiple_arr[0][1] = 2;
        multiple_arr[1][0] = 3;
        multiple_arr[1][1] = 4;
        for (int i =0; i<2; i++) //hàng
        {
            for(int j = 0; j<3; j++)//cột
            {
                System.out.printf("arr[%d][%d]: " + multiple_arr[i][j] + " ",i,j);
            }
            System.out.println();
        }
        
        //Arraylist
        ArrayList arrlist = new ArrayList();
        
        arrlist.add("Cường"); //{Cường}
        arrlist.add("Tuấn"); //{Cường, Tuấn}
        arrlist.add("Phương"); //{Cường, Tuấn, Phương}
        arrlist.add("Hồng"); //{Cường, Tuấn, Phương, Hồng}
        //thêm vào phần tử tại index 1
        arrlist.add(1,"Hạnh"); //{Cường, Hạnh, Tuấn, Phương, Hồng}
        //thay thế phần tử tại index 0
        arrlist.set(0,"Tèo"); //{Tèo, Hạnh, Tuấn, Phương, Hồng}
        //xóa phần tử tại index 3
        arrlist.remove(3); //{Tèo, Hạnh, Tuấn, Hồng}
        
        //Duyệt các phần tử trong arraylist
        //for
        for (int i = 0; i < arrlist.size(); i++) {
            System.out.println(arrlist.get(i));
        }
        
        //for-each
        for (Object x : arrlist) {
            System.out.println(x);
        }
        
        //iterator (quét các phần tử trong array)
        Iterator iterArray = arrlist.iterator();
        System.out.println("Use iterator:");
        while (iterArray.hasNext()) {            
            System.out.println(iterArray.next());
        }
        
        //sort arraylist (sắp xếp các phần tử trong array theo thứ tự)
        Collections.sort(arrlist);
        System.out.println("Sau khi sort:");
        for (Object x : arrlist) {
            System.out.println(x);
        }
    }
    
}
