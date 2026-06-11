package com.cognizant.Decorator;

public class MilkDecorator implements Coffee{
    Coffee  coffee;
    public MilkDecorator(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public int cost() {
        return coffee.cost()+50;
    }
}
