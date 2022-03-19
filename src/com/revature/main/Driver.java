package com.revature.main;

import com.revature.model.Person;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        methodA();
        methodB("passing a String");


        Person p1 = new Person();
        p1.firstName = "John";
        p1.lastName = "Doe";
        p1.age = 40;

        p1.speak();

        System.out.println("End of main() method.");
    }

    public static void methodA() {
        System.out.println("Running methodA()!");
    }

    public static void methodB(String myString){
        System.out.println("My string: " + myString);
    }
}
