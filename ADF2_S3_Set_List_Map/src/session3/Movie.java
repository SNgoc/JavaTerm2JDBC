/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

/**
 *
 * @author asus
 */
public class Movie implements Comparable<Movie>{
    double rating;
    int year;
    String name;

    public Movie(double rating, int year, String name) {
        this.rating = rating;
        this.year = year;
        this.name = name;
    }

    
    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\tYear: " + year + "\tRating: " + rating;
    }
}
