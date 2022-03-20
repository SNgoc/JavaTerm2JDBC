/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author asus
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        HashMap<String, Person> people = new HashMap<>();
        Person jim = new Person("Jim", 25);
        Person scott = new Person("Scott", 28);
        Person anna = new Person("Anna", 23);

        people.put(jim.getName(), jim);
        people.put(scott.getName(), scott);
        people.put(anna.getName(), anna);

        // not yet sorted
        List<Person> peopleByAge = new ArrayList<>(people.values());
        System.out.println("List truoc khi sort:");
        for (Person p : peopleByAge) {
            System.out.println(p.getName() + "\t" + p.getAge());
        }

        System.out.println("List sau khi sort:");
        Collections.sort(peopleByAge, Comparator.comparing(Person::getAge));
        for (Person p : peopleByAge) {
            System.out.println(p.getName() + "\t" + p.getAge());
        }
    }
}
