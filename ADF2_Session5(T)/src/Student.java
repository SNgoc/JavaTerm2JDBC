
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnstu
 */
//nếu không implements Serializable sẽ báo lỗi khi run 
public class Student implements Serializable{
    String name,gender;

    public Student() {
    }

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Name: "+name+"\nGender: "+gender);
    }
    
    
}
