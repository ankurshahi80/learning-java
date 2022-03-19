package com.revature.main;

import com.revature.model.Animal;
import com.revature.model.Cat;
import com.revature.model.Dog;

public class Driver {
    public static void main(String[] args) {
        Dog d1 = new Dog(4, "Fido");
        System.out.println(d1.getName());
        System.out.println(d1.getNumOfLegs());

//        Cas Dog object to an Animal object
        Animal a1 = new Dog(4, "Sparky"); // Upcasting - implicit and type-safe
//        Cast Animal to a Dog class to access Dog class methods.
        System.out.println(((Dog) a1).getName()); // Downcasting - explicit and not type-safe
        System.out.println(a1.getNumOfLegs());

        Animal[] myAnimals = new Animal[4];
        myAnimals[0] = new Dog(4, "Fido");
        myAnimals[1] = new Dog(4,"Sparky");
        myAnimals[2] = new Cat(4, "Whiskers");
        myAnimals[3] = new Cat(4, "Mr. Mittens");

        for (int i = 0; i < myAnimals.length; i++) {
            Animal currentAnimal = myAnimals[i];

            if(currentAnimal instanceof Dog){
                ((Dog)currentAnimal).playFetch();
            } else if(currentAnimal instanceof Cat) {
                ((Cat)currentAnimal).sniffCatnip();
            }

            currentAnimal.makeNoise();
        }

        Animal a = new Cat(4, "Tigger");
        a.eat();
        a.eat("fish");

    }
}
