/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT28_Tao_class_Account;

/**
 *
 * @author asus
 */
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Account account1 = new Account(1000, "Tuan", 2000);
        account1.display();
        account1.withdraw(2100);
        account1.deposit(600);
        System.out.println("Balance: " + account1.getBalance());
        account1.withdraw(2100);
        System.out.println("Balance: " + account1.getBalance());
    }
}
