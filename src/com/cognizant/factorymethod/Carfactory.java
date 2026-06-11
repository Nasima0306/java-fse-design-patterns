package com.cognizant.factorymethod;

public class Carfactory extends Vehiclefactory{


    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
