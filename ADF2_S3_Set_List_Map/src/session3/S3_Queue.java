/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author asus
 */
public class S3_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> q = new PriorityQueue<>();
        
        //them phan tu
        q.offer("A1");
        q.offer("A2");
        q.offer("A3");
        System.out.println("List queue: " + q);
        
        //xoa phan tu: FIFO
        q.poll();
        System.out.println("List queue sau khi xoa: " + q);
        
        //them phan tu bang method add
        q.add("A4");
        
        //tim kiem phan tu
        boolean result = q.contains("A3");
        if (result) {
            System.out.println("Co ton tai phan tu A3");
        }
        else{
            System.out.println("Khong ton tai phan tu A3");
        }
    }
    
}
