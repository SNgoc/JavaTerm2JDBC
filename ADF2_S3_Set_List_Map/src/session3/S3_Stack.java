/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.Stack;

/**
 *
 * @author asus
 */
public class S3_Stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); //stack lay tu tren xuong
        
        for (int i = 1; i < 6; i++) {
            s.push(i);//them vao 1 phan tu
        }
        System.out.println("Stack dang chua " + s);
        
        //goi phuong thuc peek (giong get)
        int element = s.peek();//peek chi lay phan tu o vi tri top
        System.out.println("Phan tu o vi tri top la " + element);
        
        //xoa phan tu
        s.pop();
        System.out.println("Stack sau khi xoa la " + s);
        
        //tim kiem phan tu
        int pos = s.search(1);
        if (pos == -1) {
            System.out.println("khong tim thay phan tu");
        }
        else{
            System.out.println("Tim thay phan tu o vi tri so " + pos);//do Stack lay tu tren xuong nen 1 la phan tu thu 4, 4 la phan tu thu 1
        }
    }
}
