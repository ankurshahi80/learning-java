package com.revature.model;

import java.util.Locale;

public class Animal {
    protected int numOfLegs;

    public Animal(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public void eat(){
        System.out.println("Animal is eating.");
    }

    public void eat(String food){
        System.out.println("Animal is eating "+ food +".");
    }
    public void makeNoise() {
        System.out.println(("Generic animal noises.").toUpperCase(Locale.ROOT));
    }
    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
}
