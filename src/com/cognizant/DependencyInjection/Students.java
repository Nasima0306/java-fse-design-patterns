package com.cognizant.DependencyInjection;

public class Students {
    Laptop lap;
//    public Students(Laptop lap){
//        this.lap=lap;
//    }

    public void setter(Laptop lap){
        this.lap=lap;
    }
    public void study(){
        lap.use();
    }
}
