/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class RatingCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.rating < m2.rating) {
            return -1;//return ve -1 la xep m1 truoc m2
        }
        else if (m1.rating > m2.rating) {
            return 1;
        }
        else{
            return 0;
        }
    }  
}

class NameCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.name.compareTo(m2.name);//so sanh string voi string (method cua san cua class String
    }
    
}

public class S3_Comparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Movie> mList = new ArrayList<>();
        
        //them cac phim vao danh sach
        mList.add(new Movie(5, 2020, "AAAA"));
        mList.add(new Movie(4, 2019, "EEEEE"));
        mList.add(new Movie(3, 2021, "CCCCCC"));
        mList.add(new Movie(5, 2021, "DDDDD"));
        
        //in
        System.out.println("Danh sach cac phim truoc khi sort:");
        for (Movie movie : mList) {
            System.out.println(movie);
        }
        //goi ham sort theo year
        Collections.sort(mList); //sort theo year do ham compareTo ben Movie tao sort theo year
        System.out.println("\nDanh sach cac phim sau khi sort theo year:");
        for (Movie movie : mList) {
            System.out.println(movie);
        }
        
        //sort theo name
        NameCompare np = new NameCompare();
        Collections.sort(mList, np);
        System.out.println("\nDanh sach cac phim sau khi sort theo name:");
        for (Movie movie : mList) {
            System.out.println(movie);
        }
        
        //sort theo rating
        RatingCompare rp = new RatingCompare();
        Collections.sort(mList, rp);
        System.out.println("\nDanh sach cac phim sau khi sort theo rating:");
        for (Movie movie : mList) {
            System.out.println(movie);
        }
    }
    
}
