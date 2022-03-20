/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas6;

import jdk.nashorn.internal.objects.annotations.Constructor;

/**
 *
 * @author asus
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    private String name;
    private int mark;
    
    //fix lỗi constructor bên TestStudent
    public Student()
    {}
    //constructor
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    
    public void setName(String s_name) 
    {
        this.name = s_name;
    }
    public void setMark(int s_mark) 
    {
        if (s_mark > 100 || s_mark < 0) {
            this.mark = 0;
            System.out.println("Điểm không hợp lệ");
        } else {
            this.mark = s_mark;
        }
    }
    
    //getName cần return để trả về
    public String getName()
    {
        return name;
    }
    public  int getMark()
    {
        return mark;
    }
    
    public void output()
    {
        System.out.println("Name: "+ name);
        System.out.println("Mark: "+ mark);
    }
}
