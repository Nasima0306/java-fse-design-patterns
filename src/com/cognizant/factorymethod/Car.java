package com.cognizant.factorymethod;

public class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("starting car");
    }
}
