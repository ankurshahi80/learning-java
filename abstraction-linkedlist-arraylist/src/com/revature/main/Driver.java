package com.revature.main;

import com.revature.model.*;

public class Driver {
    public static void main(String[] args) {

        MyList<String> myStrings = new MyArrayList<>();
        myStrings.add("String 1");
        myStrings.add("String 2");
        myStrings.add("String 3");
        myStrings.add("String 4");
        myStrings.add("String 5");

        for (int i = 0; i < myStrings.size(); i++) {
            System.out.println(myStrings.get(i));
        }

        MyList<String> myStrings2 = new MyLinkedList<>();
        myStrings2.add("String 1");
        myStrings2.add("String 2");
        myStrings2.add("String 3");
        myStrings2.add("String 4");
        myStrings2.add("String 5");

        for (int i = 0; i < myStrings2.size(); i++) {
            System.out.println(myStrings.get(i));
        }
    }
}
