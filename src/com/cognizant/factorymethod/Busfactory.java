package com.cognizant.factorymethod;

public class Busfactory extends Vehiclefactory{

    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }
}
