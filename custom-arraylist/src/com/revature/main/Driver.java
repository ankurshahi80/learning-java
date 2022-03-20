package com.revature.main;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe", 18);
        Person p2 = new Person("Jane", "Doe", 24);
        Person p3 = new Person("Ankur", "Shahi", 41);

//        ArrayList<Person> people = new ArrayList<>();
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//
//        System.out.println(people);

        MyCustomArrayList<Person> people = new MyCustomArrayList();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        MyCustomArrayList<String> myString = new MyCustomArrayList<>();
        myString.add("String 1");
        myString.add("String 2");
        myString.add("String 3");
        myString.add("String 4");
        myString.add("String 5");

        for (int i = 0; i < myString.size(); i++) {
            System.out.println(myString.get(i));
        }

//        Wrapper class: A class that serves as a blueprint for creating
//        objects that wrap corresponding primitive values inside them
//        the int in the below code must be replaced with Integer for it to work
//        MyCustomArrayList<int> myInts = new MyCustomArrayList<int>();

        MyCustomArrayList<Integer> myInts = new MyCustomArrayList<>();


    }
}
