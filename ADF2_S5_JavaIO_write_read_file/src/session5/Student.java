/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5;

import java.io.Serializable;

/**
 *
 * @author asus
 */
public class Student implements Serializable{ //them dong nay de chay file ObjInputOutputStream.java khong bi loi
    String name, gender;

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Gender: " + gender;
    }
    
}
