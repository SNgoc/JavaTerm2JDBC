package session4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class ADF2_S4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tao 1 doi tuong Product co id la kieu string
        Product<String> p = new Product<>("P01", "Sony2", 1000); // <String> la de gan kieu string cho T trong Product<T> (tuc la id co kieu T la string)
        System.out.println(p);
        
        //tao 1 doi tuong Product co id la kieu Interger
        Product<Integer> p1 = new Product<>(11, "SamSung", 2000);//<Integer> la de gan kieu Integer cho T trong Product<T> (tuc la id co kieu T la Integer)
        System.out.println(p);
        
        //LUU Y; CHI CO id KHI KHAI BAO KIEU T moi doi kieu duoc, con name va price thi khong do da gan kieu co dinh tu dau la string va int
    }
    
}
