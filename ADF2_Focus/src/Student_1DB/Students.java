/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_1DB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asus
 */
public class Students {
    private int id;
    private String name, adddress, email;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    void inputStudent(){
        Scanner sc = new Scanner(System.in);
        Pattern p = null;
        Matcher m = null;
        
        
        //name
        System.out.print("Name:");
        setName(sc.nextLine().trim());
        
        //address
        System.out.print("Address:");
        setAdddress(sc.nextLine().trim());
        
        //Email must be right format (have @, dot symbol)
        p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        while (true) {            
            System.out.print("Email:");
            setEmail(sc.nextLine().trim());
            
            m = p.matcher(getEmail());
            if (m.matches()) {
                break;
            }
            System.out.println("Email must be right format (have @, dot symbol)");
        }
    }

    @Override
    public String toString() {
        return getId() + " - " + getName() + " - " + getAdddress() + " - " + getEmail();
    }

    
}
