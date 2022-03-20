/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author asus
 */
public class S3_Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tao obj
        Set<String> hash_Set = new HashSet<>();
        
        //goi cac phuong thuc: them
        hash_Set.add(null); //HashSet cho phep add null
        hash_Set.add("Nero");
        hash_Set.add("Saro");
        hash_Set.add("NSN");
        hash_Set.add("WWW");
        hash_Set.add("Nero");//set khong cho phep add duplicate
        
        
        System.out.println("List set la " + hash_Set);
        
        //remove phan tu null
        hash_Set.remove(null);
        System.out.println("List set sau khi remove null la " + hash_Set);
        
        //chuyen HashSet thanh TreeSet
        Set<String> tree_SetEmpty = new TreeSet<>();// khoi tao 1 object rỗng (giong arraylist)
        System.out.println("Tree set khi import list vao la:");
        Set<String> tree_Set = new TreeSet<>(hash_Set);// khoi tao 1 object co 1 list co san duoc import vao (nen lam cach nay) (khong cho phep list co phan tu null)
        System.out.println("Danh sach Tree set khi import list " + tree_Set);
        
        //chuyen HashSet thanh LinkedHashSet
        LinkedHashSet<String> LhSet = new LinkedHashSet<>(hash_Set);
        System.out.println("Danh sach LinkedHashSet la " + LhSet);//khac list set la cac phan tu duoc link san toi
    }
    
}
