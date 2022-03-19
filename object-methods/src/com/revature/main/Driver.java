package com.revature.main;

import com.revature.model.Person;

public class Driver {
    public static void main(String[] args) {
        Person p = new Person("John", "Doe", 18);
        Person p1 = new Person("John", "Doe", 18);

        String s = p.toString();
        System.out.println(s);
        System.out.println(p);

        System.out.println("p == p1: " + (p == p1));
        System.out.println("p.equals(p1): " + p.equals(p1));
    }
}
