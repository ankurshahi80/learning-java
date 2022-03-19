package com.revature.model;

public class Animal {
    protected int numOfLegs;

    public Animal(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
}
