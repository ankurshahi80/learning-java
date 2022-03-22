package com.revature.main;

public class MySingleton {

    private static MySingleton instance;
//    We don't want code in other classes to instantiate an instance of this class
    private MySingleton(){
    }

    public static MySingleton getInstance(){
        if(instance == null){
            instance = new MySingleton();
        }

        return instance;
    }
}
