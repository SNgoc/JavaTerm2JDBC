/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author asus
 */
public class S3_Comparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Movie>  mList = new ArrayList<>();
        
        //them cac phim vao danh sach
        mList.add(new Movie(5, 2020, "AAAA"));
        mList.add(new Movie(4, 2019, "BBBBBB"));
        mList.add(new Movie(3, 2021, "CCCCCC"));
        mList.add(new Movie(5, 2021, "DDDDD"));
        
        //in
        System.out.println("Danh sach cac phim truoc khi sort:");
        for (Movie movie : mList) {
            System.out.println(movie);
        }
        
        //goi ham sort
        Collections.sort(mList); //sort theo year do ham compareTo ben Movie tao sort theo year
        System.out.println("Danh sach cac phim sau khi sort:");
        for (Movie movie : mList) {
            System.out.println(movie);
        }
    }
    
}
