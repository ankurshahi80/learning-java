package com.revature.main;

import com.revature.model.Circle;
import com.revature.model.Rectangle;
import com.revature.model.Shape;
import com.revature.model.Triangle;

public class Driver {
    public static void main(String[] args) {
        Shape s = new Triangle(10, 5);
        System.out.println(s.getName());
        System.out.println(s.calculateArea());

        s = new Circle(5.5);
        System.out.println(s.getName());
        System.out.println(s.calculateArea());

        s = new Rectangle(10, 12);
        System.out.println(s.getName());
        System.out.println(s.calculateArea());
    }
}
