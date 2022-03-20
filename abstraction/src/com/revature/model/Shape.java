package com.revature.model;

public abstract class Shape {

    protected String name;

//    We have defined a consturctor in an abstract class, but we cannot instantiate an abstract class

    public Shape(String name) {
        this.name = name;
    }
// Abstract method

    public abstract double calculateArea();
    public String getName() {
        return name;
    }

}
