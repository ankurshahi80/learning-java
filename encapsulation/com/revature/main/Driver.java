package com.revature.main;

import com.revature.model.Person;

public class Driver {
    public static void main(String[] args) {

        Person P1 = new Person("John" , "Doe" , 40);

        System.out.println(P1.getFirstName());
        System.out.println(P1.getLastName());
        System.out.println(P1.getAge());

        P1.setFirstName("Bach");
        P1.setLastName("Tran");

        System.out.println(P1.getFirstName());
        System.out.println(P1.getLastName());
        System.out.println(P1.getAge());
    }
}
