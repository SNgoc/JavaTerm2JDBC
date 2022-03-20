/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Customer {
    int amount = 1000;
    synchronized void withdraw(int m) throws InterruptedException{// throw để sử dụng wait()
        System.out.println("Preparing to withdraw money...");
        if (m > amount) {
            System.out.println("Not enough money");
            wait();//phải có synchronized mới sử dụng đc
        }
        
        amount -= m;
        System.out.println("Withdraw successfully");
    }
    
    synchronized void deposit(int m){
        System.out.println("Deposit...");
        amount += m;
        System.out.println("Deposit successfully");
        notify();//phải có synchronized mới sử dụng đc
    }
}
