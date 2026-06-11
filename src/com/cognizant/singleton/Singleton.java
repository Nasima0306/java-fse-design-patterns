package com.cognizant.singleton;

public class Singleton {

    static Singleton instance;

    public Singleton(){

    }
    public static  Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void message(){
        System.out.println("Singleton");
    }
}
