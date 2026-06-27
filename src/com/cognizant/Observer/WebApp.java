package com.cognizant.Observer;

public class WebApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Web App: Stock Price = " + price);
    }
}
